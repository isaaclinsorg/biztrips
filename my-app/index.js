const express = require('express');
const mysql = require('mysql');
const swaggerJsdoc = require('swagger-jsdoc');
const swaggerUi = require('swagger-ui-express');
const app = express();
const fs = require('fs');
let isUsingFakeData = false;

let fakedata = [];

const connection = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: '220563',
    database: 'edelflies',
});
connection.query('SELECT 1', (error) => {
    if (error) {
        isUsingFakeData = true;
        // console.error(error);
        console.log('MYSQL CONNETION FAILED!\nUsing fake data instead');

fs.readFile('./mysql/fakedata/fakedata.json', 'utf8', (err, data) => {
    if (err) {
        console.error('error:',err);
        console.log('fakedata:', fakedata);
        return;
    }
    fakedata = JSON.parse(data);

});
    } else {
        console.log('Connected to the MySQL server.');
        
    }
});
connection.end();




const options = {
    definition: {
        openapi: '3.0.0',
        info: {
            title: "Isaac's LB B",
            version: '1.0.0',
            description: 'Praktische Prüfung 295',
        },
        servers: [
            {
                url: 'http://localhost:3000',
            },
        ],
    },
    apis: ['./index.js'],
};
const swaggerSpec = swaggerJsdoc(options);
app.use('/swagger-ui', swaggerUi.serve, swaggerUi.setup(swaggerSpec));


// TODO: Implement the /users documentation for error 500
/**
 * @openapi
 * /users:
 *   get:
 *     tags: 
 *      - users
 *     summary: Get all users
 *     responses:
 *       200:
 *         description: Successful operation
 *         content:
 *           application/json:
 *             schema:
 *               type: array
 *               example:
 *                 - id: 1001
 *                   first_name: Alice
 *                   last_name: Johnson
 *                   email: alice@example.com
 *                   password: password123
 *                 - id: 1002
 *                   first_name: Bob
 *                   last_name: Miller
 *                   email: bob@example.com
 *                   password: password456
 *                 - id: 1003
 *                   first_name: Carol
 *                   last_name: Lee
 *                   email: carol@example.com
 *                   password: password789
 */
app.get('/users', (_, res) => {
    if (isUsingFakeData) {
        res.json(fakedata[0].user[0]);
    } else { 
        res.json({ message: "This route needs to be implemented." }); // TODO: Implement the /users GET with mysql
    }
});




app.get('/users/:id', (req, res) => {
    const userId = req.params.id;
    if (isUsingFakeData) {
        const user = fakedata[0].user.find(user => user.id === userId);
        if (user) {
            res.json(user);
        } else {
            res.status(404).json({ message: "User not found." });
        }
    } else {
        const query = 'SELECT * FROM users WHERE id = ?';
        connection.query(query, [userId], (error, results) => {
            if (error) {
                console.error(error);
                res.status(500).json({ message: "Internal server error." });
            } else {
                if (results.length > 0) {
                    res.json(results[0]);
                } else {
                    res.status(404).json({ message: "User not found." });
                }
            }
        });
    }
});






app.listen(3000, () => {
    console.log('Server is running on port 3000');
});
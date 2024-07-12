/*
*
* Dear programmer:
* When I wrote this code, only god and I knew how it worked.
* Now, only god knows it!
* Therefore, if you are trying to optimize this routine and it fails (most surely), please increase this counter as a warning for the next person:
*/
total_hours_wasted_here = 4

const express = require('express');
// const mysql = require('mysql'); // TODO: uncomment when done, please
const swaggerJsdoc = require('swagger-jsdoc');
const swaggerUi = require('swagger-ui-express');
const app = express();
const fs = require('fs');
let isUsingFakeData = false;

let fakedata = [];




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
    }
});




app.get('/users/:id', (req, res) => {
    const userId = req.params.id;
    if (isUsingFakeData) {
        const user = fakedata.find(user => user.id === parseInt(userId));
        if (user) {
            res.json(user);
        } else {
            res.status(404).json({ message: "User not found." });
        }
    }
});





app.listen(3000, () => {
    console.log('Server is running on port 3000');
});
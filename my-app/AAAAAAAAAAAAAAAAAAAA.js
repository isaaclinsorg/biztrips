const connection = mysql.createConnection({
    host: 'localhost',
    user: 'hahanottellingyou', // TODO: change this you dumbass
    password: 'hahanottellingyou', // TODO: change this you dumbass
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


var mysql = require('mysql2');
var con = mysql.createConnection({
    host: "localhost",
    user: "root",
    password: "password",
    database: "newdb",
    port: 3301
});
    con.connect(function(err) {
        if (err) throw err;
        console.log("Connected!");
        var sql = "CREATE TABLE customer(cutid int primary key, custname varchar(55), address varchar(255))";
        con.query(sql, function (err) {
            if (err) throw err;
            console.log("Table created");
        });
    }
);

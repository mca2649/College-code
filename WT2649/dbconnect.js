var mysql = require('mysql2');
var con = mysql.createConnection({
    host: "localhost",
    user: "root",
    password: "password",
    port: 3301
});
    con.connect(function(err) {
        if (err) throw err;
        console.log("Connected! to mysql");
    }
);

con.query("CREATE DATABASE newdb", function (err) 
{
    if (err) throw err;
    console.log("newdb Database created");
});

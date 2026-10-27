var mysql = require('mysql2');
var con = mysql.createConnection({
    host: "localhost",
    user: "root",
    password: "password",
    database: "newdb",
    port: 3301
});

// con.connect(function(err) {
//     if (err) throw err;
//     console.log("Connected!");
//     var sql = "INSERT INTO customer VALUES(1301, 'Satish Rathod', 'mumbai')";
//     con.query(sql, function (err) {
//         if (err) throw err;
//         console.log("one row inserted");
//     });


    // var stmt = "INSERT INTO customer (cutid, custname, address) VALUES ?"
    // let custdata = [
    //     [1302, 'Tejas Parker', 'pune'],
    //     [1303, 'Vishal Chauhan', 'nagpur'],  
    //     [1304, 'Mahesh Rawat', 'nashik'],
    // ];
    // con.query(stmt, [custdata], function (err) 
    // {
    //     if (err) throw err;
    //     console.log("multiple rows inserted");
    // });

// con.query("SELECT * FROM customer", function (err, rows) {
//     if (err) throw err;
//     console.table(rows);
//     con.end();
// });

// con.query(
//     "UPDATE customer SET address = ? WHERE address = ?",
//     ["Bombay", "mumbai"],
//     function (err, result) {
//         if (err) throw err;
//         console.log("row(s) updated");
//         con.end();
//     }
// );

con.query(
    "DELETE FROM customer WHERE cutid = ?",
    [1303],
    function (err, result) {
        if (err) throw err;
        console.log(`${result.affectedRows} row(s) deleted`);
        con.end();
    }
);

var e = require('events');
var event = new e.EventEmitter();

var customerinfo = (custid, custname, mobileno, product, amt) => {
    console.log(`Customer Id : ${custid}`);
    console.log(`Customer Name : ${custname}`);
    console.log(`Mobile No : ${mobileno}`);
    console.log(`Product : ${product}`);
    console.log(`Amount paid : ${amt}`);
}

event.on('customer Details', customerinfo);
event.emit('customer Details', 1, 'Amit', 99911222, 'Washing Machine', 55000);

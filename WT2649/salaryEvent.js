var e = require('events');
var event = new e.EventEmitter();

var calculatesalary = (basic) => {
    var da = basic * 0.8;
    var hra = basic * 0.5;
    var ptax = 300;
    var it = basic * 0.35;
    var pf = basic * 0.12;

    var gross = basic + hra + da + ptax + it + pf;
    var deductions = ptax + it + pf;
    var salary = gross - deductions;

    console.log(`Basic Salary : ${basic}`);
    console.log(`House Rent Allowance : ${hra}`);
    console.log(`Dearness Allowance : ${da}`);
    console.log(`Gross Salary : ${gross}`);
    console.log(`Professional Tax : ${ptax}`);
    console.log(`Income Tax : ${it}`);
    console.log(`Provident Fund : ${pf}`);
    console.log(`Net Salary : ${salary}`);
};

event.on('salaryprint', calculatesalary);
event.emit('salaryprint', 50000);

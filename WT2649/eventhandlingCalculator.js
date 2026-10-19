var e = require('events');
var event = new e.EventEmitter();

event.on('div', (no1, no2) => {
    console.log(`${no1} / ${no2} = ${no1 / no2}`);
});

event.on('add', (no1, no2) => {
    console.log(`${no1} + ${no2} = ${no1 + no2}`);
});

event.on('sub', (no1, no2) => {
    console.log(`${no1} - ${no2} = ${no1 - no2}`);
});

event.on('mod', (no1, no2) => {
    console.log(`${no1} % ${no2} = ${no1 % no2}`);
});

event.on('sqrt', (no1) => {
    console.log(`squareroot of  ${no1} = ${Math.sqrt(no1)}`);
});

event.emit('add', 10, 5);
event.emit('sub', 10, 5);
event.emit('div', 10, 5);
event.emit('mod', 10, 5);
event.emit('sqrt', 25);

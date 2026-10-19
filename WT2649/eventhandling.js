var e = require('events');
var event = new e.EventEmitter();
function CreateFile() {
    console.log("creating a file");
}

function Read() {
    console.log("reading a file");
}

function Write() {
    console.log("Writing a file");
}
event.addListener("IOoperations", Write);
event.addListener("IOoperations", Read);
event.once("CreateIO", CreateFile);
console.log("Count:", event.listenerCount("IOoperations"));
event.emit("CreateIO");
event.emit("IOoperations");
event.emit("IOoperations");
console.log("Raw Listeners:", event.rawListeners("IOoperations"));
console.log("Final Count:", event.listenerCount("IOoperations"));
event.removeListener("IOoperations", Read);
event.emit("IOoperations");
console.log(event.listenerCount("IOoperations"));
event.emit("CreateIO");
console.log(event.listenerCount("CreateIO"));

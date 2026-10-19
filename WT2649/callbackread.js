var fs=require("fs");
fs.writeFileSync('input.txt','writing intoa file is '+'a  lengthy and critical process has to be done '+'synchronously');
var data=fs.readFileSync('input.txt');
console.log("Reading file before appending");
console.log(data.toString());
fs.readFile('input.txt',function(ferr,data)
{
    if(ferr) console.error(ferr);
    console.log(data.toString());
    console.log("End of Read");
}
);
console.log("Reading file before appending");
fs.appendFileSync('input.txt','\nappending data to the file, ');
console.log("file after appending");
fs.readFile('input.txt',function(ferr,data)
{
    if(ferr) return console.error(ferr);       
    console.log(data.toString());
    console.log("End of Read");
}
);

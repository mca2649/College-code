let i=0;
var inter=setInterval(function()
{
    ++i;
    console.log("Hello There");
    if(i==10) clearInterval(inter);
},3000);
var t=setTimeout(function()
{
    console.log("Time out example!");
},2000);

clearTimeout(t);
console.log("Program is running!");
process.nextTick(function()
{
    console.log("Urgent task PM/CM");
});
console.log("Hello => no 1");
setImmediate(()=>{
    console.log("Running before the timeout => no 3");
});
setTimeout(()=>{
    console.log("The timeout running last => no 4");
},100);
process.nextTick(()=>{
    console.log("Running at next tick => no 2");
});


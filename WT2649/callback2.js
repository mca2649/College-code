var calculate=function(x,y,display){
    let sum=x+y;
    setTimeout(function(){display(sum)},20000);
    //will execute after 20 seconds
    console.log("VIP task taking place");
    //function call leaves this block
}
calculate(5,10,function(res){
    console.log("Sum of 5 and 10 is ",res);
    console.log("program ends");
});
//call comes here and prints the following
console.log("doing something else......");
console.log("Please wait.......");
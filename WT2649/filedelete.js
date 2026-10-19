var f=require("fs");
f.unlinkSync('newFile.txt');
f.readFile('newFile.txt', "utf-8",function(error,data)
{
    if(error) return console.error(error);  
    else{   
        console.log(data);
    }
});
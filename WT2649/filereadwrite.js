var f=require("fs");
f.renameSync('input.txt','newFile.txt');
f.readFile('newFile.txt',function(err,data)
{
    if(err) return console.error(err);
    else{
        console.log("Reading file");
        console.log(data.toString());
    }
}); 
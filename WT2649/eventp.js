var e=require('events');
var evmt = new e.EventEmitter();

var st = ['a','v','e','d'];

evmt.on('sortarray',() =>
{
    console.log(st);
    st.sort();
    console.log(st);
});

evmt.on('searcharray',(ch) =>
{
    var flag = false;

    for(var i=0; i<st.length; i++)
    {
        if(st[i] == ch)
        {
            flag = true;
            break;
        }
    }

    if(flag)
        console.log(`${ch} is found`);
    else
        console.log(`${ch} is not found`);
});

evmt.emit('sortarray');
evmt.emit('searcharray','w');

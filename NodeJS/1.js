const fs=require('fs');
const path = require('path');

/*

fs.mkdir(path.join(__dirname,'/Training Details'),{},function(err){
    if(err)throw err;
    console.log('')
    
})
*/
fs.writeFile(path.join(__dirname, 'Training Details', 'student.txt')
, 'Hello this is kunal'
,(err)=>{
    if(err) throw err;
    console.log('file written to  ..');
});
/*
fs.appendFile(path.join(__dirname, 'Training Details', 'student.txt'),
' Currently working in sonata software',
err=>{
    if(err) throw err;
    console.log('File appended to . . .')
}
)

fs.readFile(path.join(__dirname, 'Training Details','student.txt'), 'utf8',(err,data)=>{
    if(err)throw err;
    console.log(data);
});
*/
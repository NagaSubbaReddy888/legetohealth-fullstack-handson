
let fs = require(`fs`);
let content;

fs.readFile(`User.json`,(err,data)=>{
    if(err){
        console.log(err);
    }else{
        content = data.toString();
        let jsonArr = JSON.parse(data);
      
        for(var u of jsonArr){
            console.log(`User = ${u.name} , Age= ${u.age}`);
        }
    }
});


console.log(`Reading Done`);
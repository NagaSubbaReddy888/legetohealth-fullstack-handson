const fs = require ('fs');
var jsonData = '{"persons":[{"Name":"Ramu","Address":"Bangalore"},{"Name":"Ravi","Address":"Hyderabad"}]}';
var obj = JSON.parse(jsonData);
console.log(obj);
var jsonContent = JSON.stringify(obj);
console.log(jsonContent);

fs.writeFile ("output of json",jsonContent,'jdg4',function(err){
    if (err){
        console.log(" Error occured while writing JSON  object to file");
        return console.log(err);

    }
    console.log("JSON file has been saved ");
});

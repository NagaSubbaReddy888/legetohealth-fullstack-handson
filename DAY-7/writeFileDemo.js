
let fs = require('fs');
let text = "This is a simple text\n";
fs.writeFileSync('msg.txt', text, {flag : 'a+'});
console.log("DONE!");
let x = 20;
let y = 30;
let z = y-x;
console.log(`z = ${z}`);
setTimeout(() => {
    console.log(' This is inside the callback');

} , 1000);
console.log('last line!');
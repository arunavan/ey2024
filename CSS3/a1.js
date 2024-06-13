console.log("Welcome to Javascript");
var person2 = new Object();
// Attach properties  to person object
person2.firstName = "Ben";
person2["lastName"] = "Tennyson";
person2.age = 18;

console.log(person2.firstName+"  "+person2.lastName+"  "+person2.age)
console.log(person2.firstName)

const fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits.push("Kiwi");
console.log(fruits);
console.log(fruits.pop());
let fruit = fruits.shift();
console.log(fruit)
let fruit1 = fruits.shift();
console.log(fruit1)
const fruits9 = ["Banana", "Orange", "Apple", "Mango"];
fruits9.splice(2, 0, "Lemon", "Kiwi");
console.log(fruits9)


const numbers = [4, 9, 16, 25];
const newArr = numbers.map(Math.sqrt)
console.log(newArr)


let a=9;
console.log(a);
var name='ram'
console.log(typeof(name))

var city="Chennai"
function getCity() {
    let street="abc";
    console.log(city)
    console.log(street);
    street="bbc";
    console.log(street);
    
}
getCity()
console.log(city)
//console.log(street)
var country="India"
console.log(country)
country="Srilanka";

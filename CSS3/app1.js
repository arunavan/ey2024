
let person= [
   { id:'101',
    name:'Ram1'
},
{ id:'102',
name:'Ram2'
},
{ id:'103',
name:'Ram3'
}


]


for (let p in person) {
  console.log(person[p]); // prints 'Bob' and then 25
}

let numbers = [1, 2, 3, 4, 5, 6, 7]
let squares = numbers.map(function(n) {return n*n*n })
let sum = numbers.reduce(function(a,b) {return a+b })
console.log(squares)
console.log(sum)


let product= function(id,name) {
    this.id=id;
    this.name=name;
console.log(this.id+"  "+this.name)
   
}

product(10,"bag");
//product.display();
//let  y;
//console.log(y)

//JSON
let course =[ {
    courseId:101,
    courseName:'JavaFSD'
},
{
    courseId:101,
    courseName:'JavaFSD'
},
{
    courseId:101,
    courseName:'JavaFSD'
},
{
    courseId:101,
    courseName:'JavaFSD'
},


]
console.log(course.courseId  +"  "+course.courseName)


console.log(5 ==='5')
console.log(String(45)+90)
console.log('3'+2)
console.log((456+5).toString())

//named functions
function sumof2numbers(a,b) {
    return a+b
}
console.log(sumof2numbers(4,5))

//ananymous functions
let sumof2numbers1=function(a,b) {
    return a*a+b*b;
}

console.log(sumof2numbers1(4,5))

//arrow functions
let sumof2numbers2=(a,b)=>a*a+b*b;
console.log(sumof2numbers2(5,6))


let disp=(n)=>n.concat("Kumar")

console.log(disp("Ram"))

//function(){console.log("Look at me, I'm running");}();


function a1(x) { console.log(x*x)}

function a2(y,callback) {

    callback(y);
}
console.log(a2(3,a1));

//let state='abc'
function greeting() {
    console.log(state);
    var message = 'Hi';

    function sayHi() {

        console.log(message);
    }

    return sayHi;
}
let state='abc'
let hi = greeting();
hi(); 

msg("Good evening")

let msg =funciton(a) {
    return 'Hello everyone'+a;
}
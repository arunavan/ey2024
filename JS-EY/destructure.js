/*array destructuring*/
let myArray = [1, 2, 3];

let [a, b, c] =  myArray;   // destructering 
console.log("a = %d b = %d c = %d",a,b,c);


let products = ["Television","Mobile Phone","Music Player"];
let productArray = [tv,...others] = products;
console.log(tv,others);

let sizes = ["Small","Medium"];
let [s,m,l="Large"] = sizes;
console.log(s,m,l);



let employee = {
    id:123456,
    name:'Rahul'
}

/*object destructuring*/
let {id,name} = employee;
console.log(id,name);


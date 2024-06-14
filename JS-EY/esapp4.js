const num = 10  //global


console.log(num)

var company = undefined
   console.log(company); // using variable before declaring
   var company = "TutorialsPoint"; // declare and initialized here
   console.log(company);
 var company = "w3schools"; // declare and initialized here
    console.log(company);


class Person {
  constructor(name) {  //data or variable 
      this.name=name
    }
  show() {   //function
          console.log(this.name); 
     }

}
let p= new Person("Srikanth")
   console.log(p.name);         //class
   p.show()

function test() { 
   var num = 100    //local
   console.log("value of num in test() "+num) 
            


} 

function test1() {
console.log("value of num another funciton "+num)
}
console.log("value of num outside test() "+num)  //
test()
test1()

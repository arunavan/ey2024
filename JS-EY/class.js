/*Using the class declaration */
class Foo
{
    constructor(){
        console.log("Foo constructor invoked");
    }
    sayHi(){
        return "Hi from Foo";
    }
}
let foo = new Foo();	
console.log(foo.sayHi());



//foo = new Foo();			
console.log("Foo's type : "+typeof Foo);
console.log("foo instance of Foo Type");
console.log(foo instanceof Foo);
console.log(foo.sayHi());
console.log("foo.sayHi === Foo.prototype.sayHi");
console.log(foo.sayHi+" "+Foo.prototype.sayHi);


//Using the class expression 
let Baz = class{
    greet(){
        return "Greetings from Baz-greet";
    }
}
let baz = new Baz();
console.log(baz.greet());



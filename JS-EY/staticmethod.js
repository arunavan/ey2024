class Foo{
    static fooStatic(){
        return "FooStatic Method Invoked";
    }
}	
//Attaching a Static Member
Foo.staticMember  = "Foo Static Member"; 
console.log(Foo.fooStatic());
console.log(Foo.staticMember);
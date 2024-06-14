class Student {   
    constructor(a) {   
     this.name = a;  
    }   
 }   
 class User extends Student {   
    show() {   
       console.log("The name of the student is:  "+this.name)   
    }   
 }   
 var obj = new User('Sahil');   
 obj.show()  

 /*
 class Parent {   
   show() {   
      console.log("It is the show() method from the parent class");  
   }  
}  
class Child extends Parent {   
   show() {   
      console.log("It is the show() method from the child class");  
   }   
}   
var obj = new Child();   
obj.show();  



*/
/*
class Parent {   
   show() {   
      console.log("It is the show() method from the parent class");  
   }  
}  
class Child extends Parent {   
   show() {  
      super.show();  
      console.log("It is the show() method from the child class");  
   }   
}   
var obj = new Child();   
obj.show();  

*/
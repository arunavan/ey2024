class Emp {   
 // ename:string   
  constructor(ename,sal ) {//initialization
   this.ename=ename
   this.sal=sal
}
  show =function() {  
    console.log(this.ename);
     }
   saldetails=function() {
    console.log(this.sal)
}
}

let e=new Emp("Srikanth",99999)   //immutable
e.show()
e.saldetails()
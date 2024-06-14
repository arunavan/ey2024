function student(name, qualification){  
    this.name = name;  
    this.qualification = qualification;  
    }  
    student.prototype.age = 20;  
    var stu = new student('Daniel Grint' , 'BCA');  
    console.log(stu.name);  
    console.log(stu.qualification);  
    console.log(stu.age);  
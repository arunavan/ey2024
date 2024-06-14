	class Student {   
	   constructor(name, age) {   
	          this.n = name;   
    	      this.a = age;  
    	   }   
    	   stu() {   
    	      console.log("The Name of the student is: ", this.n)   
    	      console.log("The Age of the student is: ",this. a)   
    	   }   
    	}   
	class Employee {
			constructor(id,name,salary) {
				this.id=id;
				this.name=name;
				this.salary=salary;
			}
			display() {
				console.log(this.id +"  "+this.name+"  "+this.salary);
			}
		}
		var eObj=new Employee(101,"Nisha",99999.99);
		Employee.prototype.department="IT";
		Employee.prototype.location=null;
		
		eObj.display();
		console.log(eObj.department+"  "+eObj.location);
    	  
    	var stuObj = new Student('Peter',20);   
    	stuObj.stu();  
    
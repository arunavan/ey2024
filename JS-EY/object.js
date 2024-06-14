let uname = 'Anil',  
	    udivision = 'First';  
	   
	let user = {  
	   uname,  
	   udivision  
	};  
	console.log(user.uname);  
	console.log(user.udivision);  
    
    
    // emp object 
    var department = 'dep_name';  
    var emp = {  
        id : 102,  
        name : 'Anil',  
        [department]:'Production'  
    }  
    console.log(emp);  

    //concise method 

    let user1 = {  
        firstName : "Sunil",  
        lastName : "Kumar",  
        fullName(){  
            return this.firstname + " " + this.lastName;  
        }  
    };  
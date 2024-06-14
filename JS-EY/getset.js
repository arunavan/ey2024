class Employee{
			constructor(){
				this._id_ = 0;
				this._name_ = "";
			}
			get id(){
				return this._id_;      // id    setId()     getId()
			}
			set id(id){
				this._id_ = id;
			}
			get name(){
				return this._name_;
			}
			set name(name){
				this._name_ = name;
			}
		}
		let employee = new Employee();
		employee.id = 123456;
		employee.name = "Rahul";
		console.log("Id : "+employee.id+" Name : "+employee.name);
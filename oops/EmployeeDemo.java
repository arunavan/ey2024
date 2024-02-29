package com.ey.oops;
class Employee{
	int id;    // member, instance, state 
	String name;
	double sal;
	/*
	void readEmpdetails() {  //methods, member functions, behaviour of class
		id=101;
		name="ram";
		sal=9999.99;
	}
	*/
	//looks like a function , initialization
	Employee(){//initialization
		id=101;
		name="ram";
		sal=9999.99;
	}
	
	public Employee(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	void dispEmpDetails() {
		System.out.println(id +"  "+name+"  "+sal);
	}
	double calcBonus() {
		double bonus=sal*0.10;
		return bonus;
	}
}



public class EmployeeDemo {

	public static void main(String[] args) {
		Employee e1=new Employee(); // e1 instance, object , refernce
		Employee e2=new Employee();
		Employee e3=new Employee();
	//	e1.readEmpdetails();
		e1.dispEmpDetails();
	//	e2.readEmpdetails();
		e2.dispEmpDetails();
	//	e3.readEmpdetails();
		e3.dispEmpDetails();
		System.out.println(e1.calcBonus());
		System.out.println(e2.calcBonus());
		System.out.println(e3.calcBonus());
		
	}

}

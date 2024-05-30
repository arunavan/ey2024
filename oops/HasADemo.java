package com.ey.oops;

class Employee{
	String name;
	String desg;
	Integer id;
	Department department; // HAS a  - Employee has DEpartment;
	
	
}

class Department  {
	
	String dname;
	Integer did;
	
	void disp() {
		
	}
}

public class HasADemo {

	public static void main(String[] args) {
		Department d=new Department();
		
		Employee e=new Employee();
		System.out.println(e.desg  +"  "+ e.name);
		System.out.println(e.department.dname+"  "+e.department.did);
	
	}

}

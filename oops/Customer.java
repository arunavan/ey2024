package com.ey.oops;

public class Customer {
	
	Integer id;
	String name;
	String email;
	
	Customer(){  //2  no arg constructor
		id=101;
		name="ram";
		email="ram@gmail.com";
	}
	
	public Customer(Integer id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	void dispDetails() {
		System.out.println(id+"  "+name  +"  "+email);
	}

}

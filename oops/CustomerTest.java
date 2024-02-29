package com.ey.oops;

public class CustomerTest {
	public static void main(String[] args) {
		Customer c=new Customer(12,"kiran","kiran@ey.com"); //JVM - 1. default constructor
		                       //3 parameterized constructor
		c.dispDetails();
		Customer c1=new Customer(13,"raj","kiran@ey.com"); //JVM - 1. default constructor
		c1.dispDetails();
		Customer c2=new Customer(14,"sita","kiran@ey.com"); //JVM - 1. default constructor
	
		
		c2.dispDetails();
		//gc
		System.gc();
		
	}

}

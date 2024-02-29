package com.ey.oops;

public class ConstructorDemo {
	public static void main(String[] args) {
		Account a1=new Account();//object created, initialization
		a1.getAccountDetails();
		System.out.println(a1.getBalance());
		
		Account a2=new Account(7896,"Kiran",20000.00);//object created, initialization
		a2.getAccountDetails();
		System.out.println(a2.getBalance());
		
		Account a3=new Account(7888,"Ravi");//object created, initialization
		a3.getAccountDetails();
		System.out.println(a3.getBalance());
	}
}

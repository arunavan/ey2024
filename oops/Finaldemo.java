package com.ey.oops;


//final - class, method,varible

//final 
class A{
	//final 
	int x=10;
	//final 
	void show() {
		System.out.println("super");
		System.out.println(x+  " "+ x++);
	}
}

public class Finaldemo extends A {
	@Override
	void show() {
		System.out.println("sub");
	}
	public static void main(String[] args) {
	}
}

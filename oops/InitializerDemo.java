package com.ey.oops;

public class InitializerDemo {   //cannot be invoke 
	
	static {//1  annaymous block
		System.out.println("static block 1");  //once
	}
	static {
		System.out.println("static block 2");  //once
	}
	{//instance  //4
		System.out.println(" instance...block1  - before constructor");
		show();
	}
	InitializerDemo(){  //5
		System.out.println(" constructor ");
		
	}
	void show() {  // named block
		System.out.println("show mthod");
	}
	public static void main(String[] args) { //2
		
		System.out.println("main");
		InitializerDemo i1=new InitializerDemo(); //3
		InitializerDemo i2=new InitializerDemo();
		InitializerDemo i3=new InitializerDemo();
	}

}

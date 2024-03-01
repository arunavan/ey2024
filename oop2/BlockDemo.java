package com.ey.oop2;

public class BlockDemo {

	static  //once in life cyle of class
	{
	     System.out.println(" static 1");	
	     disp();
	}
	static
	{
	     System.out.println(" static 2");	
	}
	static
	{
	     System.out.println(" static 3");	
	}
	
	{   // instance block, called before every object created 
		show();
		System.out.println(" instance before constructor  1");	
	}
	{show();
		System.out.println(" instance before constructor  2");	
	}
	BlockDemo(){
		System.out.println("in constructor");
	}
	void show() {
		System.out.println(" non static / instance method");
	}
	static void disp() {
		System.out.println("static method");
	}
	
	public static void main(String[] args) {
		
		System.out.println("main started..");
		disp();
		BlockDemo b=new BlockDemo();
		b.show();
		BlockDemo b1=new BlockDemo();
		b1.show();
		BlockDemo b2=new BlockDemo();
		b2.show();
		BlockDemo b3=new BlockDemo();
		b3.show();
		
	}

}

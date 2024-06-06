package com.ey.java8;

//java8 above 
interface Arith{
	int add(int a,int b);
	int sub(int a,int b);
	//new 
	default public  void show() {
		System.out.println("interface demo ");
	}
	//new static method
	static void disp() {
		System.out.println("Static method of interface");
	}
	
}

class ArithImpl implements Arith{
	public int add(int a,int b) {//must be overriden
		return a+b;
	}
	public int sub(int a,int b) { //must be overriden
		
		disp();
		Arith.disp();   // Interfacename to call staticmethod
		show();
		return a-b;
	}
	//@Override      sttaic method cannot be overriden, scope is within class
	void disp() {
		System.out.println("child class own method");
	}
	 @Override 
	 public void show() //not forced to be overriden
	 {
	  System.out.println("default method of patrent interface "); 
	  }
	 
}
interface Arith1 extends Arith{
	
	//void show();  //abstract method
	
	
	 @Override 
	 default public void show() {
		Arith.disp(); 
	  System.out.println("sub interface default method demo ");
	  }
	 
}
public class Java8InterfaceDemo implements Arith1{
	public int add(int a,int b) {//must be overriden
		return a+b;
	}
	public int sub(int a,int b) { //must be overriden
		
	//	disp();
		Arith.disp();   // Interfacename to call staticmethod
		show();
		return a-b;
	}

	public static void main(String[] args) {
		
		Arith.disp();
	
		Arith a1=new ArithImpl();
		//a1.add(5, 6)
		a1.show();
		
		Arith1 a2=new Java8InterfaceDemo();
		
		
	}

}

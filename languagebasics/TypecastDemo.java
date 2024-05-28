package com.ey.languagebasics;

class Animal{
	
}
class Cat extends Animal{
	
}

public class TypecastDemo {

	public static void main(String[] args) {
	
		Animal aa=new Cat();  //imimplicit  - child - parent
		
		Cat cc=(Cat)new Animal(); //explicit   parent-child - 
		
		
		//byte, short, int ,long,float,double
		//char,boolean 
		int a=10;
		byte b=89; 
		short s=897;
		
		double bb=a; //typecast int - double  widending , implicit
		double d1=b;
	   long d2=s;
		System.out.println(a + "  "+b);
		
		long n =897l;//l -long
		float f=98324.324f; //f - float 
		int i=(int)f; //explicit, narrowing , higher - lower 
		
		short s1=(short)d1;
		byte bb1=(byte)d1;
		System.out.println(f+  "  "+ i);
		
	}

}

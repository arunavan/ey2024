package com.ey.oops3;


//public,protected,default, private
//static ,asbtract,final, synchronized (thread), native,trainscient,volatile

//final class cannot be inherited or extended.
//final 
class Demo{
	//final method cannot be overriden
	void disp() {
		System.out.println("disp method..");
	}
}

public class FinalDemo extends AggregationDemo
{
// final variable cannot be modified
	static  int x;  //contsnat,which cannot be modified ,final
	//@Override
	void disp() {
		System.out.println(" sub class disp method...");
	}
	
	
	static void show() {
		final int y=20;
		System.out.println(y);
	//	System.out.println(y+=20);
		
		System.out.println(x);
		x+=10;
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		show();

	}

}

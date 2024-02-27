package com.ey;

public class Staticdemo {
	int y;
	static int x=99;
	void show() {
		System.out.println("member function/ instance method");
	}
	static void disp() {
		System.out.println("static methods");
	}

	public static void main(String[] args) {
	
		System.out.println(x);
		Staticdemo s1=new Staticdemo();
		System.out.println(s1.y);
		disp();
		Staticdemo.disp();
		s1.show();
		x++;
		System.out.println(Staticdemo.x);
		
		System.out.println(s1.x);
     
	}

}

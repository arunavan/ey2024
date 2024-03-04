package com.ey.oops3;
//compiletime , static polimorp
public class MethodOverloadingDEmo {
	void area(int s) {
		System.out.println("Square:"+(s*s));
	}
	void area(int l,int b) {
		System.out.println("Reactangle:"+(l*b));
	}
	void area(double  r) {
		System.out.println("circle:"+(3.142*r*r));
	}
	void area(String pname,int l) {
		System.out.println("Area os cylinder:"+(l*l*l));
	}
	public static void main(String[] args) {
		MethodOverloadingDEmo d=new MethodOverloadingDEmo();
		d.area(5);
		d.area(7, 8);
		d.area(5.45);
		d.area("Cone",4);
	}
}

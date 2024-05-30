package com.ey.oops;

//dynamic, runtime 
class Ride{
	void sq(int a) {
		System.out.println("Area of square"+(a*a));
	}
	
}
class Mride extends Ride{
	void show() {
		//super.sq(3);
		System.out.println("in sub class...");
	}
	@Override
	void sq(int a) { //differ in implementation
		System.out.println("Perimeter of square"+(4*a));
	}
}

public class MrideDemo {
	public static void main(String[] args) {
    Ride r=new Ride();
    r.sq(5);
    Mride m=new Mride();
    m.show();
    m.sq(5);
	}

}

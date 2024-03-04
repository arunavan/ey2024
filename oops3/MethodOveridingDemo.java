package com.ey.oops3;

//dynamic , runtime poli
class Ride{
	void sq(int r) {
		System.out.println("area="+(r*r));
	}
	void show() {
		System.out.println("show method..");
	}
}
class MRide extends Ride{
	@Override
	void sq(int r) {
		System.out.println("Perimeter:"+(4*r));
	}
	
}

public class MethodOveridingDemo {

	public static void main(String[] args) {
		Ride r=new Ride();
		r.sq(5); //dynamic binding, late binding
		//MRide m=new MRide();
		//m.sq(5);
		//m.show();
		r=new MRide();
		r.sq(5);

	}

}

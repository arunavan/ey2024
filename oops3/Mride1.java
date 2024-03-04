package com.ey.oops3;

//dynamic, runtime 
public class Mride1 extends MRide{
	@Override
	void sq(int r) {
		System.out.println("cube:"+(r*r*r));
	}
	public static void main(String[] args) {
		Mride1 m=new Mride1();
		m.sq(5);
	}

}

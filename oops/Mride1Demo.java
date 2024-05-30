package com.ey.oops;

public class Mride1Demo extends Mride{

	@Override
	void sq(int a) {
		System.out.println("Cube of givne number:"+(a*a*a));
	}
	public static void main(String[] args) {
		//Mride1Demo md=new Mride1Demo();
		//md.sq(5);
		Ride r=new Ride();
		r.sq(5);
		r=new Mride();
		r.sq(5);
		r=new Mride1Demo();
		r.sq(5);
		
	}

}

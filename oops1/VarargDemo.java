package com.ey.oops1;

public class VarargDemo { //var args 

	public int add(int... a) {
		int s=0;
		for(int x:a)
			s+=x;
		return s;
	}
	public static void main(String[] args) {
		VarargDemo v= new VarargDemo();
		System.out.println(v.add(5,8));
		int s=v.add(7, 8,4,2,3,4,5);
		System.out.println(s);
		System.out.println(v.add(5, 2,3,4,5,6,7,8,6));
	}
}

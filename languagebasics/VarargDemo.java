package com.ey.languagebasics;
public class VarargDemo {
	static void printNumbers(String name,int...a) { //vararg
		System.out.println(name);
		for(int x:a)
			System.out.println(x);
	}
	public static void main(String[] args) {
		int a[]= {3,4,5};
		printNumbers("EYUSer1",a);
		int b[]= {3,4,5,6,7,8,9};
		printNumbers("EYUser2",b);
	}
}

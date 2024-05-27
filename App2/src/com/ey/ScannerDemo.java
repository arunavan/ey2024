package com.ey;

import java.util.Scanner;
public class ScannerDemo {
	boolean isEven(int number) {
		boolean result=false;
		if(number%2==0)
			result=true;
		else
			result=false;
		return result;
	}
	void isOdd(int number) {
		if(number%2!=0)
			System.out.println("Odd");
		else
			System.out.println("Not Odd");
	}
	static void disp(String msg) {
		System.out.println("Welcome to OOPS"+msg);
	}

	public static void main(String[] args) { //run, execution
		
		Scanner sc=new Scanner(System.in);//utility class to read runtime 
		System.out.println("enter a number");
		int n=sc.nextInt();
		
		ScannerDemo sd=new ScannerDemo();
		System.out.println(sd.isEven(n));
		sd.isOdd(n);
		disp("EYUSer123");

	}

}

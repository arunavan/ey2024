package com.ey.languagebasics;

import java.util.Scanner;

public class ScannerDemoTest {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);//utility class to read runtime 
		System.out.println("enter a number");
		int n=sc.nextInt();
		
		ScannerDemo sd=new ScannerDemo();
		System.out.println(sd.isEven(n));
		sd.isOdd(n);
		ScannerDemo.disp("EYUSer123");
	}

}

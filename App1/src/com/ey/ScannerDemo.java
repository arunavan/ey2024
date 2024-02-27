package com.ey;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
	
		//byte,short,int,float,long,double
		//char ,boolean 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("sum:"+(a+b));
		System.out.println("diff:"+(a-b));
		System.out.println("product:"+(a*b));
		

	}

}

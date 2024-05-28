package com.ey.languagebasics;

import java.util.Scanner;
//java.lang
//java.util
//java.io
//java.sql
//java.net
//java.awt
public class ControlStructureDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*
		int n=sc.nextInt();
		if(n%2==0)
		  System.out.println("Even");
		else
			System.out.println("Odd");
			*/
		
		System.out.println("enter 3 number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		/*if(a>b && a>c)
			System.out.println("a is big");
		if(b>a && b>c)
			System.out.println("b is big");
		if(c>a && c>b)
			System.out.println("c is big");
			*/
		if(a>b)
		{ if(a>c)
			System.out.println("a is big");
		  else
		   System.out.println("c is big");	
		}
		else {
			if(b>c)
				System.out.println("b is big");
			else
				System.out.println("c is big");
		}
	}

}

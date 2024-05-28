package com.ey.languagebasics;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LoopingDemo {
	static void printNumbersWhile(int a) {  //1...10
	int i=1;
		while(i<=a) 
		{	System.out.println(i);
		    i++;
	   }
	}
	static void printNumbersDoWhile(int a) {
		int i=1;
		System.out.println("do===while");
		do
		{	System.out.println(i);
		    i++;
	   }while(i<=a);
	}
	static void printNumbersFor(int a) {
		System.out.println("===for loop====");
		for(int i=1;i<=a;i++)
		   System.out.println(i);
		   
	}
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		//LoopingDemo l=new LoopingDemo();
	    printNumbersWhile(a);  //10
	    printNumbersDoWhile(a);
	    printNumbersFor(a);
	    System.out.println("array elements ");
	    int ar[]= {3,4,2,5,6,7,8};
	    for(int i=0;i<ar.length;i++)
	    	System.out.println(ar[i]);
	    System.out.println("array elements with enhanced for each loop ");
		  
	    for(int x:ar)
	    	System.out.println(x);
	    System.out.println("For each method with Lambda...");
	    List<Integer> list=Arrays.asList(4,3,5,6,7,8,2);
	    list.forEach(x->System.out.println(x));
	    
	    //int,char,byte,short,long,double,boolean,float   - mutable
	    //Wrapper.. java.lang 
	    //Integer,Character,Float,Byte,Long,Double ...   immutable 
	   Integer ar1[]=new Integer[5];
	    ar1[0]=90;
	    ar1[1]=89;
	    ar1[2]=56;
	    ar1[3]=45;
	    ar1[4]=56;
	    ar1[5]=89;
	    for(int x1:ar1)
	    	System.out.println(x1);
	    List<Integer> lar1=Arrays.asList(ar1);  //class arry into list
	    lar1.add(34);
	    lar1.add(23);
	    lar1.forEach(x->System.out.println(x));

	}

}

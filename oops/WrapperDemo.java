package com.ey.oops;


// byte,short,int,long,float,double char,boolean  -8 types

//java.lang
//Byte,Short,Integer,Long,Float,Double,Character,Boolean


public class WrapperDemo {

	public static void main(String[] args) {
	
	double d=2039.90;
	float c=33223.3f;
	long l=89l;
	
	int a=10;//value ,not safe
	
	Integer aobj=new Integer(a); //object , safe
	
	double b=234.56;
	Double bobj=new Double(b);//boxing
	
	double b1=bobj.doubleValue();//unboxing 
	double b2=bobj;
	
	System.out.println(aobj.intValue()+20); //unboxing
	System.out.println(aobj+20);//autounboxing
	
	}

}

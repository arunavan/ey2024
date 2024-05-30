package com.ey.oops;


class Mload {  //static poly, compiletime 
	                     //similar job calculate emi method overloading,
	Double getEmi(Double amount) {
		return amount/12;
	}
	int getEmi(String name,int amount) {
		System.out.println("customer:"+name);
		return amount/12+100;
	}
	Double getEmi(Double duration,int amount ) {
		
		return amount/12+500.00;
	}
}
public class MethodOverloadDemo {

	public static void main(String[] args) {
	Mload m=new Mload();
	System.out.println(m.getEmi(60000.00));
	System.out.println(m.getEmi("ram",5000));
	System.out.println(m.getEmi(60000.00,5000));
		}
}

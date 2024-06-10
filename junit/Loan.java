package com.ey.junit;

//unit
public class Loan {
	public int getEmi(int amount) {
	return amount/12;
  }
	
	double getSquare(double x) {
		return x*x;
	}
	
	String getMsg(String s) {
	return s.substring(3,6);	
	}
	
	Boolean getResult() {
		return true;
	}
	
	/*
	 * public static void main(String[] args) { Loan l=new Loan(); int
	 * a=l.getEmi(60000); System.out.println(a); }
	 */
}

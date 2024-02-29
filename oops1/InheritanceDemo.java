package com.ey.oops1;

public class InheritanceDemo {

	public static void main(String[] args) {
		Loan l=new Loan();
		//System.out.println(l.id+"  "+l.type+  "  "+l.amount);
		//System.out.println(l);
		l.setAmount(8888000.00);
		System.out.println(l.getAmount());
		l.setId(102);
		l.setType("Housing");
		System.out.println(l.getId()+   "  "+l.getType());
	}

}

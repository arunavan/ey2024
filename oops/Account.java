package com.ey.oops;
class Account{
	Integer acNo;
	String name;
	Double balance;
	Account(){//no arg
		acNo=3456;
		name="Ram";
		balance=10000.00;
	}
	

	public Account(Integer acNo, String name) {
	
		this.acNo = acNo;
		this.name = name;
	}


	public Account(Integer acNo, String name, Double balance) {
		this.acNo = acNo;
		this.name = name;
		this.balance = balance;
	}


	void getAccountDetails() {
		System.out.println(acNo+"  "+ name+"  "+balance);
	}
	double getBalance() {
		return balance;
	}
}
package com.ey.oops3;

import java.util.Arrays;
//java.lang
class Account implements Comparable
{
	Integer acNo;
	String name;
	Double balance;
	
	@Override
	public String toString() {
		return "Account [acNo=" + acNo + ", name=" + name + ", balance=" + balance + "]";
	}

	public Account(Integer acNo, String name, Double balance) {
		this.acNo = acNo;
		this.name = name;
		this.balance = balance;
	}
	
	public int compareTo(Object o) {
		Account a=(Account)o;
	/*	if(this.acNo<a.acNo)
			return -1;
		else
			if(this.acNo>a.acNo)
				return 1;
			else
				return 0;
				*/
	/*	return this.name.compareTo(a.name);*/
		
		if(this.balance<a.balance)
			return -1;
		else
			if(this.balance>a.balance)
				return 1;
			else
				return 0;
					
	}
	
	
}
public class ObjectsortingDemo {
	public static void main(String[] args) {
		
		Account accounts[]=new Account[5];
		accounts[0]=new Account(123412,"Ram",99999.99);
		accounts[1]=new Account(453412,"Arun",29999.99);
		accounts[2]=new Account(233412,"Kiran",39999.99);
		accounts[3]=new Account(723412,"Samm",79999.99);
		accounts[4]=new Account(623412,"Bindu",59999.99);
		
		for(Account a: accounts) 
			System.out.println(a);
		
		Arrays.sort(accounts);
		
		System.out.println();
		
		for(Account a: accounts) 
			System.out.println(a);
		
		

	}

}

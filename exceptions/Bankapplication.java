package com.ey.exceptions;

import java.util.Scanner;

class WithdrawException extends RuntimeException
{
	 WithdrawException(String msg){
		 super(msg);  //System.out.println(msg);
	 }
}
		

public class Bankapplication {

	public static void main(String[] args) throws DepositException,WithdrawException{
	Scanner sc=new Scanner(System.in);
		int deposit=sc.nextInt();
		if(deposit<1000)
			throw new DepositException("Minimum deposit amount is 1000/-");
		else
			System.out.println(" deposit done, thanks for suing services...");
		
		System.out.println("enter amount to be withdrawn");
		int withdrawamt=sc.nextInt();
		if(withdrawamt<500) 
			throw new WithdrawException("Withdraw limit is 500/-");
		else
				System.out.println(" Collect your amount of rs"+withdrawamt);
		

	}

}

package com.ey.exceptions;

//custom exception

public class DepositException  extends Throwable // RuntimeException,Throwable 
{
	DepositException(String msg){
		super(msg);
	}
}

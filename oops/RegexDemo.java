package com.ey.oops;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	static Boolean isValid(String mobile)  {
		//7,8,9    {quantifier}
	Pattern ptrn = Pattern.compile("[7-9][0-9]{9}");  
	Matcher match = ptrn.matcher(mobile);  
	return (match.find() && match.group().equals(mobile));
	}
	public static void main(String[] args) {
		
     if (isValid("7848368631"))
    	 System.out.println("Mobile number is Valid");
     else
    	 System.out.println("Invalid mobile number");
		
     //string 
     
     if("3848369573".matches("[7-9][0-9]{9}"))
    	 System.out.println("Valid");
     else
    	 System.out.println("Invalid");
     
	}

}

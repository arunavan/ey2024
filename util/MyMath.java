package com.ey.util;

public class MyMath {
	
	// isPalindrome
	
	public static  boolean isPalindrome(int n) {  //121 -T  123-F
		
		boolean flag=false;
		int m=n;
		int r=0;
		int digit=0;
		while(n>0) {
		    digit=n%10;
		    r=r*10+digit;  //1   , 12   ,121
		    n=n/10;
		}
		System.out.println(r+  "   "+m);
		if(r==m)
			flag=true;
		//else
		//	flag=false;
		
		
		return flag;
		
	}
	

}

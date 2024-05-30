package com.ey.oops;

import java.util.StringTokenizer;
public class tokenizerDemo {
	public static void main(String[] args) {
		
		String s="EYUSer123-Chennia-Tamilnadu-India";
		
		char c[]=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			c[i]=s.charAt(i);
		}
		
		String st[]=s.split("-");
		System.out.println(st);
		
		for(int i=0;i<st.length;i++)
			System.out.println(st[i]);
		
		for(String ss:st)
		System.out.println(ss);
		
		System.out.println(" using tokenizer....");
		StringTokenizer st1=new StringTokenizer(s,"-");
		while(st1.hasMoreTokens())
		{	System.out.println(st1.nextToken());
		
		}
		}
}

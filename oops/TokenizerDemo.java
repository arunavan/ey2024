package com.ey.oops;

import java.util.StringTokenizer;

public class TokenizerDemo {

	public static void main(String[] args) {
		String s="EYUser-Chennai-Tamilnadu-India";
	//	StringTokenizer st=new StringTokenizer(s,"-");
	//	String s="EYUser Chennai Tamilnadu India";
		StringTokenizer st=new StringTokenizer(s,"-");
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		String ss[]=s.split("-");
		for(String s1:ss)
			System.out.println(s1);

	}

}

package com.ey.oops;


//java.lang.String

public class StringDemo {

	public static void main(String[] args) {
	
		String s=new String("java");  //literal ,1 ,heap, scp
		System.out.println(s.hashCode());
		String ss1=new String("java");
		System.out.println(ss1.hashCode());
		
		String s1=new String("Java Language"); //object, 2  , 1 heap, 1 in to scp
		String s2=new String("Java Language");
		String s3=s1;
		System.out.println(s1.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s2.matches("ava"));
		System.out.println(s1==s3); //address
		System.out.println(s1.equals(s2));//content
		
		System.out.println(s1.hashCode()+"  "+s2.hashCode());
		
		
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s.startsWith("j"));
		System.out.println(s.endsWith("a"));
		System.out.println(s1.indexOf("v"));
		System.out.println(s1.lastIndexOf("a"));
		System.out.println(s1.concat(" & Technology"));
		System.out.println(s1.replace("a", "e"));
		
		char ss[]=s.toCharArray();
		System.out.println(s1.substring(4));
		System.out.println(s1.substring(4,7));
		System.out.println(s.concat(" lanugae"));
		System.out.println(s);
		//immutable, create duplcate objects for many of string methods
		
		
		//mutable, cpacity, ensurecapacity,append,insert,delete,reverse
		//never create duplicate objects, threadsafe(synchronized)
		//slow, locking n unlocking 
		StringBuffer sb=new StringBuffer("java language");
		System.out.println(sb.length());
		System.out.println(sb.insert(3, "technology"));
		System.out.println(sb);
		System.out.println(sb.delete(3, 10));
		System.out.println(sb);
		System.out.println(sb.append("india"));
		System.out.println(sb.capacity());
		sb.ensureCapacity(100);		
		System.out.println(sb.capacity());
		System.out.println(sb.reverse());
		
		//not syncronized, fast
		StringBuilder sb1=new StringBuilder("java");
		
		String st1="java";
		StringBuffer stb1=new StringBuffer(st1); // string - stringbuffer
		
		StringBuilder stb2=new StringBuilder(st1);
		
		String st3=stb1.toString();
		String st4=stb2.toString();
		

	}

}

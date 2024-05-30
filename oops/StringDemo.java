package com.ey.oops;


//java.lang.String

public class StringDemo {

	public static void main(String[] args) {

		String s=new String("javalanguage"); //object, 2 objects ,1 heap, 1 cached scp
		
		String s1="java";  //literal
		
		System.out.println(s.concat(" technology"));//duplicate
		System.out.println(s); //immutable
		System.out.println(s.toUpperCase()); //one more object
		System.out.println(s);//immutable
		System.out.println(s.charAt(2));
		System.out.println(s.length());
		System.out.println(s.substring(5,8));
		s.replace('e', 'a');
		// so many duplicate , memory leakage
		System.out.println(s1.indexOf('v'));
		System.out.println(s1.concat("lanugage"));
		System.out.println(s1);
		
		//mutable, will not duplicate , insert,delete,append, reverse
		StringBuffer sb=new StringBuffer("java programming language");
		System.out.println(sb.toString().concat("tehcnology"));
		//insert, append, reverse(),delete
		System.out.println(sb.insert(4, "xxxxxxxx"));
		System.out.println(sb);
		System.out.println(sb.delete(4,9));
		System.out.println(sb);
		sb.append("yyyyy");
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb.capacity());
		sb.ensureCapacity(200);
		System.out.println(sb.capacity());
		// syncronized ,slow compare with string
		//mutable, not syncronized, fast
		StringBuilder sb1=new StringBuilder("java language");
		
		System.out.println(sb1.toString());
		System.out.println(sb.toString());
		
		String x1="java";
		String x2="java123";
		System.out.println(x1.hashCode()+  " "+x2.hashCode());
		System.out.println(x1.equals(x2)); //content 
		System.out.println(x1==x2); //adress
		
		String email="abcd@gmail.com";
		System.out.println(email.matches("abcd@gmail.com"));
		
		
		
	}

}

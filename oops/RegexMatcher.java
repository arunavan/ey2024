package com.ey.oops;



import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatcher {
	public static void main(String args[]) {

		// String to be scanned to find the pattern.
		String line = "This order was places for QT3000! OK?";
		String pattern = "(.*)(\\d+)(.*)";
       System.out.println(line.matches(pattern));
       
       System.out.println("98879887988767".matches("[0-9]{10,14}"));
		System.out.println("Ab98c@gmail.com".matches("[^qrst]{3,10}@gmail.com"));
		
	}
}

package com.ey.oops1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;//old version
class Student{
	Integer id;
	String name;
	//Date dob;
	LocalDate dob;
}
public class DateDemo {
	public static void main(String[] args) {
		Date d=new Date(); //before java8
		System.out.println(d);
		System.out.println(d.getDay());//deprecated
		LocalDate date1=LocalDate.now();
		System.out.println(date1);
		
		LocalDate doj=LocalDate.of(2024, 3, 10);
		System.out.println(doj);
		System.out.println(doj.plusDays(10));
		System.out.println(doj.minusMonths(1));
		
		
		LocalTime time1=LocalTime.now();
		System.out.println(time1);
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt);
	}

}

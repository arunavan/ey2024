package com.ey.java8;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class LocalDateDemo {

	public static void main(String[] args) {
		Date d=new Date();  // mutable, not supporting Zone, CST,PST,IST
		System.out.println(d);
		
		Instant i=Instant.now(); //zones, mutable
		System.out.println(i);
		
		LocalDate d1=LocalDate.now();
		d1.plus(10,ChronoUnit.DAYS);
		System.out.println(d1.plus(10,ChronoUnit.MONTHS));
		System.out.println(d1.plusMonths(6));
		
		LocalDate cd1=LocalDate.of(2024, Month.FEBRUARY, 16);
		LocalDate cd2=d1.plusMonths(3);
		System.out.println(cd1);
		
		Period p=Period.between(cd1, d1);
		System.out.println(p.getYears()+  "  "+p.getMonths()  +   "  "+p.getDays());
		
		LocalTime t1=LocalTime.now();
		System.out.println(t1);
		System.out.println(t1.plusMinutes(20));
		System.out.println(t1.minusSeconds(30));
		
		LocalTime ct1=LocalTime.of(16,30);
		
		Duration diff1=Duration.between(t1, ct1);
		System.out.println(diff1.getSeconds());
		
		
		
		
		LocalDateTime d2=LocalDateTime.now();
		System.out.println(d2);
		ZonedDateTime zd1=ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		
		DateTimeFormatter dtf=DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		
		System.out.println(d2.format(dtf));

	}

}

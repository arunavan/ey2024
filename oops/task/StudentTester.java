package com.ey.oops.task;
import java.util.Date;

public class StudentTester {

	public static void main(String[] args) {  //ui,presentation
		
		Student students[]=new Student[5];
		Integer a[]= {67,78,89};
		students[0]=new Student(101,"ram1",new Date(), a,"First");
		students[1]=new Student(102,"ram2",new Date(), a,"First");
		students[2]=new Student(103,"ram3",new Date(), a,"First");
		students[3]=new Student(104,"ram4",new Date(), a,"First");
		students[4]=new Student(105,"ram5",new Date(), a,"First");
		
		StudentService sc=new StudentService();
		sc.displayallstudents(students);
		
				
	}

}

package com.ey;
class Student{  //data members, member variable, instance variable
	int id;
	String name;
	double marks;
	static String country="India";
	void dispStudentDetails() {
		int age=19;
		System.out.println(id +"  "+name+"  "+marks);
	}
}
public class Studentdemo {
	public static void main(String[] args) {
		Student s1=new Student();  //object , instance, reference
		s1.id=101;
		s1.name="ram";
		s1.marks=99.99;
		System.out.println(s1.id +"  "+s1.name  +"  "+ s1.marks);
		s1.dispStudentDetails();
		Student s2=new Student();
		s2.id=102;
		s2.name="Raj";
		s2.marks=89.99;
		System.out.println(s2.id +"  "+s2.name  +"  "+ s2.marks+"   ");
		s2.dispStudentDetails();
		System.out.println(Student.country);
		Student.country="US";
		System.out.println(s1.country);
		System.out.println(s2.country);
		
		

	}

}

package com.ey.oops;

class Course{  //instance 
	Integer courseId;
	String name;
	Integer duration;
	Double fee;

	/*
	 * Course() { //initialization , no arg constructor courseId=101; name="java";
	 * duration=40; fee=9999.99; }
	 */   
	//local
	/*
	 * public Course(Integer courseId, String name, Integer duration, Double fee) {
	 * 
	 * this.courseId = courseId; this.name = name; this.duration = duration;
	 * this.fee = fee; } public Course(Integer courseId, String name) {
	 * this.courseId = courseId; this.name = name; }
	 */


	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", name=" + name + ", duration=" + duration + ", fee=" + fee + "]";
	}

	
	/*
	public void dispCourseDetails() {
		System.out.println(courseId+  " "+name+"  "+duration +  "  "+fee);
	}
	*/
	
	
}
public class CourseDemo {

	public static void main(String[] args) {
		     //JVM
		Course c=new Course(); //object, instance, reference 
	//	Course c1=new Course(102,"oralce",20,8888.88);
	//	Course c2=new Course(103,"spring");
		int marks=99;  //local
		System.out.println(c);
	//	System.out.println(c1);
	//	System.out.println(c2);
	//	System.out.println(c.name +  "  " +c.courseId  +"  "+c.duration   +"  "+c.fee);
		//System.out.println(c1.name +  "  " +c1.courseId  +"  "+c1.duration   +"  "+c1.fee);
		//c.dispCourseDetails();
		//c1.dispCourseDetails();

	//	c2=null;
	//	c1=null;
		//gc
		System.gc();
	}

}

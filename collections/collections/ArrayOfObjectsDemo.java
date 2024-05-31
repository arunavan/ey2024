package com.ey.collections;

class Course{
	Integer courseId;
	String name;
	Double  fee;
	Course() {
		
	}
	
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", name=" + name + ", fee=" + fee + ", duration=" + duration + "]";
	}

	public Course(Integer courseId, String name, Double fee, Integer duration) {
		super();
		this.courseId = courseId;
		this.name = name;
		this.fee = fee;
		this.duration = duration;
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getFee() {
		return fee;
	}
	public void setFee(Double fee) {
		this.fee = fee;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	Integer duration;
	
	
}

public class ArrayOfObjectsDemo {

	public static void main(String[] args) {
		
		//10 
		
		Course c[]=new Course[10]; //array of objects, static, homogeneos 
		c[0]=new Course(10,"java",8999.99,20);
		c[1]=new Course(11,"java",8999.99,20);
		c[2]=new Course(12,"java",8999.99,20);
		c[3]=new Course(13,"java",8999.99,20);
		
		for (Course c1: c)
			System.out.println(c1);

	}

}

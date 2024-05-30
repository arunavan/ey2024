package com.ey.oops.task;

import java.util.Arrays;
import java.util.Date;

public class Student {
	private Integer admissionCode;
	private String studentName;
	private Date birthdate;
	private Integer [] marks; // array to hold marks in 3 subjects
	private String grade;
	private static Integer admissionCounter;
	private static String schoolName;
	
	public Student(Integer admissionCode, String studentName, Date birthdate, Integer[] marks, String grade) {
		super();
		this.admissionCode = admissionCode;
		this.studentName = studentName;
		this.birthdate = birthdate;
		this.marks = marks;
		this.grade = grade;
	}
	public Integer getAdmissionCode() {
		return admissionCode;
	}
	public void setAdmissionCode(Integer admissionCode) {
		this.admissionCode = admissionCode;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public Integer[] getMarks() {
		return marks;
	}
	public void setMarks(Integer[] marks) {
		this.marks = marks;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public static Integer getAdmissionCounter() {
		return admissionCounter;
	}
	public static void setAdmissionCounter(Integer admissionCounter) {
		Student.admissionCounter = admissionCounter;
	}
	public static String getSchoolName() {
		return schoolName;
	}
	public static void setSchoolName(String schoolName) {
		Student.schoolName = schoolName;
	}
	@Override
	public String toString() {
		return "Student [admissionCode=" + admissionCode + ", studentName=" + studentName + ", birthdate=" + birthdate
				+ ", marks=" + Arrays.toString(marks) + ", grade=" + grade + "]";
	}
	

}

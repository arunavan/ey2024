package com.ey.oops.task;

public class StudentValidator {
	
	public boolean isValidName(Student student) {
	
		return true;
	}
	public boolean isValidDOB(Student student) {
		//min 5yrs
		return true;
	}
	public boolean isValidName(int marks[]) {
		//0 to 100
		return true;
	}
	public boolean isValidStudent(Student student) {
		if( isValidStudent(student) && isValidDOB(student) && is ValidMarks(student.marks))
		return true;
	}
}

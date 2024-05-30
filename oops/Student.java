package com.ey.oops;

public class Student {
	private Integer id;
	private String name;
	Student(){
		
	}

	public Student(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}


	public static void main(String[] args) {
		Student s=new Student(101,"Ram");
		System.out.println(s);
		Student s1=new Student();
		//s1.id=102;
		//s.name="Ravi";
		s1.setId(102);
		s1.setName("Ramesh");
		System.out.println(s1.getId() +  "  "+s1.getName());
	}

}

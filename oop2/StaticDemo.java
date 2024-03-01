package com.ey.oop2;

class College{
	Integer id;
	String name;
	static String city="Chennai";//sttaic variable , while compile , class 
	College(){
		id=101;
		name="SRM";
	}
	public College(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + "]";
	}
	
	void disp() {
		show();
		System.out.println(city);
		System.out.println(" non sttaic / instance method");
	}
	static void show() {
		College c=new College();
		//disp();
		c.disp();
		System.out.println(c.id);
		System.out.println("static method...");
	}
	
	
}
public class StaticDemo {
	

	public static void main(String[] args) {
		College c=new College();
		System.out.println(c);
		System.out.println(College.city);
		System.out.println(c.city);
		College.show();
		c.show();
		
	
	}

}

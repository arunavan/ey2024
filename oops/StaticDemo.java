package com.ey.oops;

//local variables, static , instance variables

class College{
	Integer id;  //instance variable 
	String name;
	
	public College(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	static String country="India";  //global to all objects , class level, common for all instances
	static void dispAddress() {
		System.out.println("I am Indian Graduate");
	}
	void read(int marks ) { //local
		int age=10;  //local
		System.out.println(id + "  "+name   +  " "+ age   +"   "+marks);
	}
	void disp() {
		String  cit="Hyd";
		System.out.println(id + "  "+name );   // +"   "+age  +"  "+marks);
		System.out.println(country);
	}
	
}
public class StaticDemo {
	Integer id;
	static int a=10;
	void disp() {
		System.out.println("instance method...");
	}
	static void methoddisp() {
		System.out.println("static method");
	}
	
	public static void main(String[] args) {
		String state="Telangana";
		College c=new College(101,"OU");//
		
		//c=null;
		College c1=new College(102,"JNTU");
		System.out.println(c.id+"  "+c.name);
		System.out.println(c1.id+"  "+c1.name+"  ");
		c.read(89);
		c.disp();
		c1.read(67);
		c1.disp();
		System.out.println(College.country);
		System.out.println(c.country +  "  "+c1.country);
		StaticDemo sd=new StaticDemo();
		System.out.println(sd.id);
		System.out.println(a);  // static variabe within the class 
		System.out.println(College.country);  //static variable of other class
		College.dispAddress();
		sd.disp();  //instance method
		methoddisp();  //static method
		sd.methoddisp();
		StaticDemo.methoddisp();
	}

}

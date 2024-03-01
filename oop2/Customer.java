package com.ey.oop2;
public class Customer {
	Integer id;  //0         this keyword used to refere only instance variables
	String name; //null 0.0
	//email,mobile
	String email;
	public Customer() {	//constructor overloading, cinstructor chaining using this() , this(args1,arg2..)
		id=99;
		name="EYUser";
	}
	public Customer(Integer id) {
		this();
		this.id = id;
	}
	public Customer(String name) {
		this();//default constructor
		this.name = name;
	}
	public Customer(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Customer( String email,Integer id) {
		this("EyUser2");
		this.id = id;
		this.email = email;
	}
	void show(int age ) {//local
		int rating=9; //local variable , instance 
	
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
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	/*
	public void finalize(){
		id=0;
		name=null;
	}
	*/
	public static void main(String[] args) {
		
		Customer c1=new Customer("Balaji");
		System.out.println(c1);
		
		Customer c2=new Customer(88);
		System.out.println(c2);
		
		Customer c3=new Customer(77,"Manju");
		System.out.println(c3);
		
		Customer c4=new Customer("smith@ey.co",76);
		System.out.println(c4);
		
		/*
		Customer cc=new Customer();
		Customer c=new Customer(101,"Ram"); //ram
		Customer c1=new Customer(102,"Raj"); //raj
		Customer c2=new Customer(103);
		Customer c3=new Customer("kiran");
	___	System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		*/
		
		
	//	c=null;
	 //   c1=null;	
	}

}

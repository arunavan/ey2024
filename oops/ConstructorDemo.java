package com.ey.oops;
class Product{
	Integer id;
	String name;
	Product(){  //2 with args, custom
		id=101;
		name="box";
	}
	public Product(Integer id) {
		//this("book");
		this();
		this.id = id;
	}
	public Product(String name) {
		this();
		this.name = name;
	}              //local
	public Product(Integer id, String name) {//3 parameterized constructor
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}
	
	
	void disp() {
		this.show();
		System.out.println("disp method..");
	}
	
	void show() {
		System.out.println("show method");
	}
}
public class ConstructorDemo {
	public static void main(String[] args) {
	Product p=new Product(); //JVM  --1
	 System.out.println(p);
	 Product p1=new Product(102,"bag"); //JVM  --1
	 System.out.println(p1);
	 Product p2=new Product(103); //JVM  --1
	 System.out.println(p2);
	 Product p3=new Product("table"); //JVM  --1
	 System.out.println(p3);

	}

}

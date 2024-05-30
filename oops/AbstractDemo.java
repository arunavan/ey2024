package com.ey.oops;

//abstraction-> inheritance 
abstract class Vehicle{//object cannot be created , must be inherited
	static int speed=9;  
	abstract int speed();
	abstract double milage();   //without body
	 void show() {
		 System.out.println(" concrete method with body");
	 }
}

class Car extends Vehicle{ //all abstract method must be implemented
	int year;
	String model;
	int speed() {
		return 60;
	}
	 double milage() {
		 return 10.0;
	 }
	 void method123() {
		 
	 }
	
}

class Bus extends Vehicle{
	int speed() {
		return 40;
	}
	 double milage() {
		 return 8.0;
	 }
}

public class AbstractDemo {

	public static void main(String[] args) {
		
	//	Vehicle v;
	//	Car c=new Car();
	//	v=c;
		
		Vehicle v=new Car();//-
		System.out.println(v.milage());
		System.out.println(v.speed());
		v=new Bus();//
		System.out.println(v.milage());
		System.out.println(v.speed());
			
		

	}

}

package com.ey.oops;
interface  Vehicle1{//object cannot be created , must be inherited
	static int speed=9;  
	int speed(); // all abstract method  public, abstract 
	double milage();   //without body
}
interface Loan1{
	int getEmi();
}
class Car1 implements Vehicle1,Loan1{ //all abstract method must be implemented
	int year;
	String model;
	public int getEmi() {
		return 70000;
		}
	public int speed() {
		return 60;
	}
	public  double milage() {
		 return 10.0;
	 }
	 void method123() {
		 
	 }
	
}

class Bus1 implements Vehicle1{
	public int speed() {
		return 40;
	}
	public  double milage() {
		 return 8.0;
	 }
}
public class InterfaceDemo {
	public static void main(String[] args) {
		//	Vehicle1 v
		//	Car c=new Car();
		//	v=c;
			Vehicle1 v=new Car1();//-
			System.out.println(v.milage());
			System.out.println(v.speed());
			Loan1 l=new Car1();
			System.out.println(l.getEmi());
			v=new Bus1();//
			System.out.println(v.milage());
			System.out.println(v.speed());
  }
}

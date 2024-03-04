package com.ey.oops3;

//asbtraction
abstract class Vehicle{  //abstract 
	abstract void speed(String name);  //without body
	abstract Double milage(String name,Double price);
	void showDetails() {
		System.out.println(" concrete method");
	}
}
// sub class , implementation
class Bus extends Vehicle{
	@Override
	void speed(String name) {
		System.out.println("Bus speed is 80KMPH");
	}
	@Override
	Double milage(String name,Double price) { //implementationmethod
		double milage=price*5.2/100;
		return milage; //0.0
	}
	void show() {
		
	}
}
class Car extends Vehicle{
	void speed(String name) {
		System.out.println("Bus speed is 120KMPH");
	}
	Double milage(String name,Double price) { //implementationmethod
		double milage=price*5.2/90;
		return milage; //0.0
	}
}


public class AbstractionDemo {

	public static void main(String[] args) {
	  Vehicle v;//=new Vehicle();
	  
	  Bus b=new Bus();
	  v=b;
	  System.out.println(v.milage("TSRTCBUS1", 999999.99));
	  v.speed("TSRTCBus2");
	  v.showDetails();
	  Car c=new Car();
	  v=c;
	  
	//  Vehicle v=new Car();
	  System.out.println(v.milage("Car11", 999999.99));
	  v.speed("Car2");
	  v.showDetails();
	  
	 
	}

}

package com.ey.oops3;
abstract class Loan{
	abstract Double  getEmi(Double amount);
	
}

class Boat extends Vehicle{
	@Override
	void speed(String name) {
		System.out.println("Bike speed is 120KMPH");
	}
	@Override
	Double milage(String name,Double price) { //implementationmethod
		double milage=price*5.2/70;
		return milage; //0.0
	}
}
public class Bike  extends Vehicle{
	Bike() {
		
	}
	@Override
	void speed(String name) {
		System.out.println("Bike speed is 120KMPH");
	}
	@Override
	Double milage(String name,Double price) { //implementationmethod
		double milage=price*5.2/70;
		return milage; //0.0
	}
	void show() {
		
	}
	public static void main(String[] args) {
		Vehicle v=new Bike();
		//v=new Car();
		v.speed("Pulsar");
		System.out.println(v.milage("Pulsar", 8989.98));
	}

}

package com.ey.oops3;

//private,default,protected,public 
interface Loan1{
	//public , absrtact
	void getEmi(Double amount,Integer duration);
	double calcInterest(Double amount);
}
interface Parking1{
	void getParkingslot(Integer vNumber);
	Double calcCharges();
}

class Car1  implements Loan1,Parking1{
	public void getEmi(Double amount,Integer duration) {
	}
	public double calcInterest(Double amount) {
		return 0.0;
	}
	public void getParkingslot(Integer vNumber) {
	}
	public Double calcCharges() {
		return 0.0;
     }
}


public class InterfaceDemo {

	public static void main(String[] args) {
		Loan1 l;//=new Loan1();
		l=new Car1();
		Parking1 p1=new Car1();
		p1.getParkingslot(890);
		p1.calcCharges();
		

	}

}

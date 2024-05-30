package com.ey.oops;

//IS a    HosuingLoan IS a LOAN  EDuctaionLoan is a LOAN
//parent, super, base
class Loan {
	Integer id;
	double amount;
	String bankName;
	String name;
	Loan(){
		System.out.println("parent constructor");
	}
	void loanMethod() {
		
	}
	
	void disp() {
		System.out.println("parent disp method");
	}
}

//child, sub,derived
class HousingLoan extends Loan{
	String propertyType;
	Double estimatedValue;
	String name;
	HousingLoan(){
		super(); //parent constructor
		System.out.println("Child constructor");
	}
	
	void housingLoanMethod() {
		
	}
	void disp() {
		System.out.println("Child disp method");
	}
	void show() {
		
		this.disp();
		super.disp();
		System.out.println(this.name  +"  "+super.name);
	}
}


class EducationLoan extends Loan{
	String qualification;
	String course;
	Double loanAmount;
	EducationLoan(){
		super(); //parent constructor
		System.out.println("child2 constructor");
	}
	void educationLoanMethod() {
		
	}
}
public class InheritanceDemo {
	public static void main(String[] args) {
		Loan l=new Loan();
		HousingLoan hl=new HousingLoan();
		hl.show();
		hl.disp();
		hl.housingLoanMethod();
		
		EducationLoan el=new EducationLoan();
	

	}

}

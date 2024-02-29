package com.ey.oops1;



//non sub classes
public class HousingLoanDemo {

	public static void main(String[] args) {
		
		Loan l=new Loan();
		l.calcTax();
		HousingLoan hl=new HousingLoan();
		hl.calcTax();
		hl.estimatedLoan();
		

	}

}

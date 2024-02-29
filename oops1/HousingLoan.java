package com.ey.oops1;
//Loan
//sub, child ,derived 
//sub class
class HousingLoan extends Loan {
	
	String typeOfProperty;
	Double propertyValue;
	HousingLoan(){
		propertyValue=999999.99;
	}
	
	public void estimatedLoan() {
		System.out.println(propertyValue*0.80);
	}
	
}
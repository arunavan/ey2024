package com.ey.oops1;

//parent, base, super
class Loan{
	private Integer id;
	private String type;
	private Double amount;
	Loan(){
		id=101;
		type="EducationLoan";
		amount=9000000.00;
	}
	//setters , getters accessors and mutator

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public Double getAmount() {
		return amount;
	}


	public void setAmount(Double amount) {
		this.amount = amount;
	}

  public void calcTax() {
	  System.out.println(amount*0.05);
  }
	@Override
	public String toString() {
		return "Loan [id=" + id + ", type=" + type + ", amount=" + amount + "]";
	}
	
	
}

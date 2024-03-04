package com.ey.oops3;




public class AggregationDemo {

	public static void main(String[] args) {
	
		
	//	Department d=new Department("10","Ram","Chennai");
		
		Employee e=new Employee(1001,"RamKumar",89999.99,new Department("10","Ram","Chennai"));
		System.out.println(e);

	}

}

package com.ey.jdbc.task;

public class ProductUI {

	public static void main(String[] args) throws Exception{
		ProductService ps=new ProductService();
		Product p=new Product(1,"box");
		ps.addProduct(p);

	}

}

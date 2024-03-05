package com.ey.collections;

public class ProductTest {

	public static void main(String[] args) {
		
		//menu implement update, delete
		// 1. add 2 update  3. delete 4.display all
		
		Product product=new Product(101,"bag",890.90);
		Product product1=new Product(102,"bag",890.90);
		
		ProductService ps=new ProductService();
		
		String result=ps.addProduct(product);
		String result1=ps.addProduct(product1);
		
		if(result.equals("success") && result1.equals("success"))
		  System.out.println(" Product added successfully");
		ps.listProducts();
		ps.deleteProduct(102);
		System.out.println("after deleting ");
		
		ps.listProducts();
		ps.updateProduct(101, "book", 1500.00);
		ps.listProducts();
	}

}

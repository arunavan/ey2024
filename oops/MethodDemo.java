package com.ey.oops;

import java.util.Scanner;

class Product1{
	Integer id;
	String name;
	Double qty;
	Product1(){
	
	}
	
	public Product1(Integer id, String name, Double qty) {
		this.id = id;
		this.name = name;
		this.qty = qty;
	}

	void updateProduct(Integer id,String name,Double qty) {
		this.id=id+500;
		this.name=name.toUpperCase();
		this.qty=qty*10;
		
	}
	Product1 updateProductObject(Product1 product) {
		product.id=product.id+100;
		product.name=product.name.concat("OrganicProduct");
		product.qty=product.qty*20;
		
		return product;
	}
	void dispProductObject(Product1 p) {
		System.out.println("Product details:"+p.id+  " "+p.name+"  "+p.qty);
	}
	void dispProduct() {
		System.out.println("Product details:"+id+  " "+name+"  "+qty);
	}
	
}
public class MethodDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
     Integer id=sc.nextInt(); sc.nextLine();
     String name=sc.nextLine();
     Double qty=sc.nextDouble();
     Product1 p=new Product1();
     
     p.updateProduct(id,name,qty);
     p.dispProduct();
     
     Product1 p2=new Product1(13,"box",50.00);
     
     
     Product1 p3=p.updateProductObject(p2);
     p3.dispProduct();
     p.dispProductObject(p3);
	}

}

package com.ey.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductService {
	
	List<Product> productList=new ArrayList<>();
	
	String addProduct(Product product) {
		String result="fail";
		productList.add(product);
		result="success";
		return result;
	}
	
	public void listProducts() {
		//productList.forEach(p->System.out.println(p));
		
		Iterator i=productList.iterator();
		while(i.hasNext()) {
			
			System.out.println(i.next());
		}
		
	}
	
	public void updateProduct(Integer id, String name, Double price) {
		Iterator i=productList.iterator();
		while(i.hasNext()) {
			Product p=(Product)i.next();
			if(p.id==id) {
			  p.name=name;
			  p.price=price;
			}
		}
	}

	
	public void deleteProduct(Integer id) {
		
		Iterator i=productList.iterator();
		while(i.hasNext()) {
			Product p=(Product)i.next();
			if(p.id==id)
			 i.remove();
		}
		
	}
}

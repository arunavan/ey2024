package com.ey.oops3;

import java.util.Arrays;
import java.util.Comparator;

class Product{
	Integer id;
	String name;
	Double price;
	public Product(Integer id, String name, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
}

class IdComparator implements Comparator{
	
	public int compare(Object o1,Object o2) {
		Product p1=(Product)o1;
		Product p2=(Product)o2;
		if(p1.id<p2.id)
			return -1;
		else
			if(p1.id>p2.id)
				return 1;
			else
				return 0;
	}
	
}

class Namecomparator implements Comparator{
	public int compare(Object o1,Object o2) {
	Product p1=(Product)o1;
	Product p2=(Product)o2;

	return p1.name.compareTo(p2.name);
	
}
}
class PriceComparator implements Comparator{
	public int compare(Object o1,Object o2) {
		Product p1=(Product)o1;
		Product p2=(Product)o2;
		if(p1.price<p2.price)
			return -1;
		else
			if(p1.price>p2.price)
				return 1;
			else
				return 0;
	}
}

public class ComparatorDemo {

	public static void main(String[] args) {
		Product accounts[]=new Product[5];
		accounts[0]=new Product(123412,"TV",99999.99);
		accounts[1]=new Product(453412,"PC",29999.99);
		accounts[2]=new Product(233412,"TAB",39999.99);
		accounts[3]=new Product(723412,"IPAD",79999.99);
		accounts[4]=new Product(623412,"Mobile",59999.99);
		
		for(Product a: accounts) 
			System.out.println(a);
		
		Arrays.sort(accounts,new PriceComparator());
		System.out.println();


		for(Product a: accounts) 
			System.out.println(a);
	}

}

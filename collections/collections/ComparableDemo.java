package com.ey.collections;


import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class Product implements Comparable{
	Integer id;
	String name;
	public Product(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	public int compareTo(Object o) {
		Product p=(Product)o;
		/*
		if( this.id>p.id)
			return -1;
		else
			if(this.id<p.id) 
				return +1;
			else
				return 0;
				*/
		return p.name.compareTo(this.name);  //+1  -1  0
	}
		
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		
		return this.id.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
	
		Product other = (Product) obj;
		if(this.id==other.id  && this.name.equals(other.name))
			return true;
		else
			return false;
	}
	
	
	
	
}

public class ComparableDemo {

	public static void main(String[] args) {
		Set<Product> pset=new TreeSet<>();//for srting- Comparable, comparator
		pset.add(new Product(101,"bag"));
		pset.add(new Product(101,"bag"));
		pset.add(new Product(102,"box"));
		pset.add(new Product(11,"bag"));
		pset.add(new Product(12,"fan"));
		pset.add(new Product(131,"gate"));
		pset.add(new Product(142,"ball"));
		
		pset.add(new Product(99,"pin"));
		pset.add(new Product(78,"tin"));
		pset.add(new Product(100,"sofa"));
		System.out.println(pset);
		System.out.println(pset.size());
		
		for( Product p: pset)
			System.out.println(p);
		
	}
}

package com.ey.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class Product{
	Integer id;
	String name;
	public Product(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
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

public class SetDemo {

	public static void main(String[] args) {


		//Set<Integer> s=new HashSet<>();
		//Set<Integer> s=new LinkedHashSet<>();//orderedness
		Set<Integer> s=new TreeSet<>();//built in sorting
		
		s.add(34);
		s.add(20);
		s.add(2134);
		s.add(98);
		s.add(456);
		s.add(20);
		System.out.println(s);
		System.out.println(s.size());
		//s.clear();
		s.add(23);
		Iterator<Integer> i=s.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
		
		Set<Product> pset=new HashSet<>();
		pset.add(new Product(101,"bag"));
		pset.add(new Product(101,"bag"));
		pset.add(new Product(102,"box"));
		System.out.println(pset);
		System.out.println(pset.size());
		
		
	}

}

package com.ey.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetSortDemo {

	public static void main(String[] args) {
      Set<Product> productList=new TreeSet<>(new NameComparator());
		
		productList.add(new Product(9,"bag",89.90));
		productList.add(new Product(3,"box",189.90));
		productList.add(new Product(2,"table",79.90));
		productList.add(new Product(1,"pen",39.90));
		productList.add(new Product(8,"pencil",29.90));
		
		productList.forEach(x->System.out.println(x));

		Object o[]=productList.toArray();
	}

}

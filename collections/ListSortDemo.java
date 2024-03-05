package com.ey.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSortDemo {

	public static void main(String[] args) {
		
		List<Product> productList=new ArrayList<>();
		
		productList.add(new Product(9,"bag",89.90));
		productList.add(new Product(3,"box",189.90));
		productList.add(new Product(2,"table",79.90));
		productList.add(new Product(1,"pen",39.90));
		productList.add(new Product(8,"pencil",29.90));
		
		System.out.println("before sort");
		productList.forEach(x->System.out.println(x));
		Collections.sort(productList,new NameComparator());

		System.out.println("after sort");
		productList.forEach(x->System.out.println(x));
		
		Object o[]=productList.toArray();
		int ar[]= {4,5,6,7,8};
		
		List l=Arrays.asList(ar);
		
	}

}

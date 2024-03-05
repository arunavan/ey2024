package com.ey.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//unique , not allow dupllicates
//indexed operations 
public class SetDemo {

	public static void main(String[] args) {
		//Set<Object> set=new HashSet<>();
		
		Set<Object> set=new LinkedHashSet<>();
		set.add(34);
		set.add("java");
		set.add(34);
		set.add("java");
		set.add(34);
		set.add("java");
		set.add(78);
		set.add(new Product(123,"bag",89.90));
		set.add(new Product(123,"bag",89.90));
		set.add(new Product(123,"bag",89.90));
		//System.out.println(set.size());
		Iterator<Object> i=set.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		//autosorted
	//	Set<Object> set1=new TreeSet<>();//sorted
	//	Set<Object> set1=new HashSet<>();//not sorted, not orderd
		Set<Object> set1=new LinkedHashSet<>();	//ordered
		set1.add(90);
		set1.add(23);
		set1.add(78);
		set1.add(21);
		System.out.println(set1);
		
		
		

	}

}

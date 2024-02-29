package com.ey.oops;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo1 {

	public static void main(String[] args) {
		
		Integer marks[]= {45,67,98,78,65,45,78,7,4,12};
		for(Integer m:marks)
			System.out.println(m);
		Arrays.sort(marks);
		System.out.println("after sorting..");
		for(Integer m:marks)
			System.out.println(m);
		System.out.println(Arrays.binarySearch(marks,777));
		Integer b[]=new Integer[5];
		Arrays.fill(b, 100);
		for(Integer m:b)
			System.out.println(m);
	
		List<Integer> list=Arrays.asList(marks);
		System.out.println(list);
		//list.forEach(System.out::println);
		

	}

}

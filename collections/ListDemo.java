package com.ey.collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {
/*
		List list=new ArrayList();
		list.add(3);
		list.add("java");
		list.add('c');
		list.add(LocalDate.now());
		list.add(new Product(101,"pen",89.90));
		System.out.println(list);
		
		//generics 
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(34);
		l1.add(67);
		l1.add(656);
		System.out.println(l1);
		*/
	//	List<Object> l2=new ArrayList<Object>();
	//	List<Object> l2=new LinkedList<Object>();
	//	LinkedList<Object> l2=new LinkedList<>(); //faster 
		Vector l2=new Vector<>();  //synchronized ,slow
		l2.add(34);
		l2.add(34);		l2.add(34);
		l2.add(new String("java"));
		l2.add(new String("java"));
		l2.add(new String("java"));
		l2.add(new Product(101,"pen",89.90));
		l2.add(134);
		l2.add(new String("jee"));
		l2.add(334);
		l2.add(new String("spring"));
		l2.add(34);
		l2.add(new String("webservcies"));
		
		System.out.println(l2);
		System.out.println(l2.hashCode());
		l2.remove(2);
		//l2.clear();
		System.out.println(l2.indexOf(34));
		System.out.println(l2.lastIndexOf(34));
		System.out.println(l2.contains("jee"));
		System.out.println(l2.size());
		System.out.println(l2.get(4));
		System.out.println(l2.isEmpty());
		System.out.println(l2.set(3,"J2EE"));
		
		System.out.println(" for each loop");
		for(Object o:l2)
			System.out.println(o);
		
		System.out.println("using iterator");
		Iterator i=l2.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("foreach method..java8");
		l2.forEach(x->System.out.println(x));
		
	//	ArrayList<Object> al=new ArrayList<>();
	   // al.add(56);
		
	
		List al=Arrays.asList(50,60,70,80);
		l2.addAll(al);  //bulk
		
		System.out.println("foreach method..java8");
		l2.forEach(x->System.out.print(x+" "));
		//l2.removeAll(al);
	//	l2.retainAll(al);
		System.out.println();
		System.out.println("foreach method..java8");
		l2.forEach(x->System.out.print(x+" "));
		
		System.out.println(l2.containsAll(al));
		
		/*
		Stack<Object> st=new Stack();
		st.push(78);
		st.isEmpty();
		st.clear();
		st.pop();
		*/
	   
		
		
		

	}

}

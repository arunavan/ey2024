package com.ey.collections;
import java.util.*;
public class CollectionDemo1 {

	public static void main(String[] args) {
		

		//int a[]=new int[4]; //primitives
		ArrayList<Object> al=new ArrayList<>();
		al.add(34);//int    Integer   a1.add(new Integer(34));  // auto boxing 
	//	Integer obj=(Integer)al.get(1);
		//int val=obj.intValue(); //un boxing
		al.add("java");
		al.add(56.789);
		al.add(45.5f);
		al.add(new Date());
		al.add(new Course(10,"java",897.89,9));
		//System.out.println(al.hashCode());
		
		//generic 
		List<String> list=new ArrayList<String>();
		list.add("java");
		list.add("oracle");
		list.add("spring");
		list.add("webservices");
		System.out.println(list);	
		
		//iterator
		System.out.println("iterator================");
		Iterator i=list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println(" for --");
		for(String s: list)
			System.out.println(s);
		System.out.println("for each method===========");
		list.forEach(x->System.out.println(x));
		
		
	//	List<Integer> l1=new ArrayList<>();//slow for modification fast for iterating
	//	LinkedList<Integer> l1=new LinkedList<>();//fast due to pointer
		List<Integer> l1=new Vector<>();//slow, built in syncronized , legacy
		l1.add(45);
		l1.add(56);
		l1.add(45);
		l1.add(56);
		l1.add(67);
		l1.add(766);
		l1.add(156);
		l1.add(627);//7
		l1.add(67);//8
		l1.add(7636);
		l1.add(10,99);
		
		l1.remove(2);
		
		System.out.println(l1.size());
		System.out.println(l1.indexOf(67));//first occurance of index
		System.out.println(l1.lastIndexOf(67)); //last occurance of index
		//l1.clear();
		System.out.println(l1.isEmpty());
		System.out.println(l1.contains(156));
		System.out.println(l1.get(6));   //auto un boxing
		List<Integer> l2=Arrays.asList(6,7,8);
		l1.addAll(l2);
		System.out.println(l1);
		//l1.removeAll(l2);
		//l1.retainAll(l2);
		System.out.println(l1.containsAll(l2));
		System.out.println(l1);
		l1.forEach(x->System.out.println(x));
		
		Stack s=new Stack();
		s.add(45);
		s.add(56);
		s.add(45);
		s.add(56);
	
		s.push(89);
		System.out.println(s);
		System.out.println(s.pop());
		
	}

}

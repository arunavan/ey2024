package com.ey.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Course{
	Integer id;
	String name;
	Double fee;
	public Course(Integer id, String name, Double fee) {
		super();
		this.id = id;
		this.name = name;
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", fee=" + fee + "]";
	}
	
}

public class StreamDemo {

	public static void main(String[] args) {
	Stream st=Stream.of(45,67,89,78,56);
	
	st.forEach(x->System.out.println(x));
	System.out.println(" method reference operator ::  ");
	
	List<Integer> list=Arrays.asList(2,1,3,4,5,6);

	list.parallelStream().forEach(System.out::println);//2 4 8 cpu 
	
	Integer a[]=new Integer[] {3,4,4,3,98,98,76,5,6,6,7,1,2,3,45,67,56,12};
	
	Stream<Integer> st1=Stream.of(a);
	Stream<Integer> st2=Arrays.asList(a).stream();
	
	//st1.filter(x->x<50).forEach(x->System.out.println(x));
	
	//st1.filter(x->x>50).filter(x->x%2!=0).forEach(x->System.out.println(x));
	
	//st1.map(x->x/2).forEach(System.out::println);
	
	st1.sorted(Collections.reverseOrder()).forEach(System.out::println);
	
	List<Course> clist=Arrays.asList(new Course(9,"java",7896.00),new Course(3,"oracle",3456.00),
			new Course(1,"spring",6786.00));
	//clist.stream().forEach(System.out::println);
	Comparator<Course> comp=(c1,c2)->c1.fee.compareTo(c2.fee);
	//clist.stream().sorted(comp).forEach(System.out::println);
	
	clist.stream().filter(c->c.name.startsWith("o")).forEach(System.out::println);
	
	//collect 
//	List<Integer> evenlist=st2.filter(x->x%2==0).limit(5).collect(Collectors.toList());
	//evenlist.forEach(System.out::println);
	
	//List<Integer> listafter3=st2.filter(x->x%2==0).skip(5).collect(Collectors.toList());
	//listafter3.forEach(System.out::println);
	
	//Long count=st2.filter(x->x%2==0).count();
	//System.out.println(count);
	
	//Integer sum=st2.limit(5).reduce((a1,b1)->a1+b1).get();
	//System.out.println(sum);
	
	st2.distinct().forEach(System.out::println);
	
	}

}

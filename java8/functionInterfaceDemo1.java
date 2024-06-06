package com.ey.java8;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface   // implement in lamda   ()->  {return }
interface Arr2{
	int op(int a,int b);
}

@FunctionalInterface 
interface Arr3<T>{
	T op1(T a,T b);
}
public class functionInterfaceDemo1 {
	public static void main(String[] args) {
		Arr2 ar=(int a,int b)->  {  return (a*a+b*b ); };
		System.out.println(ar.op(4, 5));
		
		Arr2 ar1=(a,b)->a-b;
		System.out.println(ar1.op(7, 3));
		
		Arr3<Integer> ar3=(a,b)->a*a*a+b*b*b;
		System.out.println(ar3.op1(5, 6));
		Arr3<Double> ar4=(a,b)->a*b;
		System.out.println(ar4.op1(65.45, 34.23));
		
		Consumer<Integer> c=(x)->System.out.println(x);
		c.accept(10);
		Supplier<Integer> s=()->99;
		System.out.println(s.get());
		Predicate<Integer> p=(x)->x%2==0;//true or false
		System.out.println(p.test(8));
		Function<Integer,Integer> f=(a)->a*a;
		System.out.println(f.apply(4));
		BiFunction<Integer,Integer,Integer> bf=(a,b)->a*a+b*b;
		System.out.println(bf.apply(2, 3));
		
		
		
	}
}

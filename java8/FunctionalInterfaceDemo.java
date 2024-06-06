package com.ey.java8;

@FunctionalInterface   // implement in lamda   ()->  {return }
interface Ar{
	int op(int a,int b);
	//int product(int a,int b);
	/*
	 * default void show() {
	 * 
	 * } static void disp() {
	 * 
	 * }
	 */
	
}
/*class ArImpl implements Ar{
	public int op(int a,int b) {
		//
		return a+b;
	}
}
*/
public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
	
		Ar ar=(int a,int b)->  {  return (a*a+b*b ); };
		System.out.println(ar.op(4, 5));
		
		Ar ar1=(a,b)->a-b;
		System.out.println(ar1.op(7, 3));
	}
}

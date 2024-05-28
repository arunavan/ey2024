package com.ey.languagebasics;
public class ArrayDemo {
	public static void main(String[] args) {
		int a[][]= {{4,5,6},{5,6},{2,3,4,1}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		int x[]= {3,2,4,5,6,7,8};
		int y[]=new int[3];
		System.arraycopy(x,3,y,1,1);
		System.out.println("target array");
		for(int x1:y)
			System.out.print(x1+" ");
		
	}
}

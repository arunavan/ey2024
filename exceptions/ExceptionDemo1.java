package com.ey.exceptions;

import java.io.FileReader;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		//Thread.sleep(500);//compile time, checked , need to be handled  InterruptedException
		//FileReader fr=new FileReader("d:\\Hello.java"); //checked  //IOException
		try {
			
			try {
			int a=10;
			int b=0;
			int c=a/b; //exception  , unchecked , runtime exception
			System.out.println("Result:"+c);
			}
			catch(ArithmeticException e1){
				e1.printStackTrace();
			}
			int x[]= {4,5,6};
			System.out.println(x[7]);
			
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			try {
				
			}
			catch(Exception e2) {}
			//System.out.println(e);
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
	
		finally {
			try {
				
			}
			catch(Exception e) {}
			//db.close()  ; f.close();
		}
		
		System.out.println("Demo...");

	}

}

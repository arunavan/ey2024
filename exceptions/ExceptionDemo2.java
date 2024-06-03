package com.ey.exceptions;

import java.io.FileNotFoundException;

public class ExceptionDemo2 {

	public static void main(String[] args)  throws InterruptedException,FileNotFoundException{
			try {
			//db, file,socket
			int a=10;
			int b=0;
			int c=a/b; //exception  , unchecked , runtime exception
			System.out.println("Result:"+c);
			int x[]= {4,5,6};
			System.out.println(x[7]);
			
		}
			
			
		catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e) {
			//System.out.println(e);
		//	System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(Exception e) {
				
			}
		finally {
			//db.close()  ; f.close();
		}
		
			ExceptionDemo3 ed3=new ExceptionDemo3();
			ed3.show();
		System.out.println("Demo...");

	}

}

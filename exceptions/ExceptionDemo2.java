package com.ey.exceptions;



public class ExceptionDemo2 {

	public static void main(String[] args) {
			try {
			//db, file,socket
			int a=10;
			int b=0;
			int c=a/b; //exception  , unchecked , runtime exception
			System.out.println("Result:"+c);
			int x[]= {4,5,6};
			System.out.println(x[7]);
			
		}
		catch (Exception e) {
			//System.out.println(e);
		//	System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			//db.close()  ; f.close();
		}
		
		System.out.println("Demo...");

	}

}

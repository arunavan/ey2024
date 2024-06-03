package com.ey.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo3 {
static void show()  throws InterruptedException,FileNotFoundException{
	Thread.sleep(500);
	FileReader f=new FileReader("D:\\Hello.java");
	try {
		String s=null;
		System.out.println(s.length());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  //runtime/unchecked
}
	
	public static void main(String[] args) throws InterruptedException,FileNotFoundException
	{
		
	
			show();
	

	}

}

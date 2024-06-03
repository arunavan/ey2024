package com.ey.exceptions;

import java.io.FileReader;

public class TrywithResourceDemo {

	public static void main(String[] args) {
		/*
		FileReader f=null;
		try {//db, socket
		  f=new FileReader("d:\\Hello.java");

				 // f.read()
		}
		catch(Exception e) {
			
		}
		finally  {
			f=null;
		}
		*/
		//try with resource, auto closeable, java7
		try(FileReader f=new FileReader("d:\\Hello.java")){
			//read
		}
		catch(Exception e) {
			
		}
		
		
		System.out.println("reading id done..");
		
		
	}

}

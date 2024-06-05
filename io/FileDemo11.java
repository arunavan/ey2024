package com.ey.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo11 {

	public static void main(String[] args) 
	{
		FileInputStream f1=null;
		
		FileOutputStream f2=null;
		int k;
		try {
			f1=new FileInputStream("d:\\Hello.java");
		  f2=new FileOutputStream("d:\\eyoutput.txt",true);
		while((k=f1.read())!=-1) {  //-1 EOF
			System.out.print((char)k);
			f2.write((char)k);
		}
		}
		catch(IOException e) {
			
		}
		finally {
		try {
			f1.close();
			f2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

}

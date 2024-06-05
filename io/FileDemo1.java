package com.ey.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException  //FileNotFoundException, EOFException
	{
		FileInputStream f1=new FileInputStream("d:\\Hello.java");
		FileOutputStream f2=new FileOutputStream("d:\\eyoutput.txt",true);
		int k;
		while((k=f1.read())!=-1) {  //-1 EOF
			System.out.print((char)k);
			f2.write((char)k);
		}
		f1.close();
		f2.close();
	}

}

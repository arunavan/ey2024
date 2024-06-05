package com.ey.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException  //FileNotFoundException, EOFException
	{  File f=new File("D:\\ey\\App2\\src\\com\\ey\\oops\\CourseDemo.java");
		FileInputStream f1=new FileInputStream(f);
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

package com.ey.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo2 {

	public static void main(String[] args) throws IOException  //FileNotFoundException, EOFException
	{
		FileReader f1=new FileReader("D:\\ey\\App2\\src\\com\\ey\\oops\\CourseDemo.java");
		BufferedReader b1=new BufferedReader(f1);
		FileWriter f2=new FileWriter("d:\\eyoutput.txt");
		BufferedWriter b2=new BufferedWriter(f2);
		String line=null;
		while((line=b1.readLine())!=null) {  
			System.out.println(line);
			b2.write(line);
		}
		b1.close();f1.close();
		b2.close();f2.close();
	}

}

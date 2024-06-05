package com.ey.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo111 {

	public static void main(String[] args) 
	{
		//try with resouce , auto closeable , no finally block
		int k;
		try (FileInputStream f1=new FileInputStream("d:\\Hello.java");
				FileOutputStream f2= new FileOutputStream("d:\\eyoutput.txt",true);
			)
		{		 
		while((k=f1.read())!=-1) {  //-1 EOF
			System.out.print((char)k);
			f2.write((char)k);
		}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}

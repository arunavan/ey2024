package com.ey.io;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class DISDEmo {

	public static void main(String[] args) throws IOException{
		
		DataInputStream dis=new DataInputStream(System.in);//byte,slow
		int n=dis.readInt();
		char x=dis.readChar();
		System.out.println(n +"  "+ x);
		                                    //char , fast
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name=br.readLine();
		int marks=Integer.parseInt(br.readLine());
		System.out.println(name+"  "+marks);

	}

}

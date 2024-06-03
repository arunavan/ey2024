package com.ey.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

class A{
	
	void show()throws InterruptedException,FileNotFoundException  {
		
	}
}

public class ThrowswithSuperClassDemo extends A {
	
	@Override
	void show() throws InterruptedException,FileNotFoundException {
		Thread.sleep(500);
		FileReader f=new FileReader("d:\\Hello.java");
	}

	public static void main(String[] args) throws InterruptedException,FileNotFoundException {
		
		ThrowswithSuperClassDemo t=new ThrowswithSuperClassDemo();
		t.show();
	}

}

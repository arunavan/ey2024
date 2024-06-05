package com.ey.io;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Customer implements Externalizable//Serializable
{
//	transient
//	private static final long serialVersionUID = 809L;
static Integer id; //
	String name;
	
	public Customer(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	
	public void readExternal(Object o) {
		
	}
	
	
	
}

public class SerializeDemo {

	public static void main(String[] args) throws ClassNotFoundException,IOException {
		Customer c=new Customer(10,"Ram");
		System.out.println(c);
		
		FileOutputStream f1=new FileOutputStream("d:\\serial.txt");
		
		ObjectOutputStream o1=new ObjectOutputStream(f1);
		
		o1.writeObject(c);  //serialization
		System.out.println(" serialization is done ");
		
		
		FileInputStream f2=new FileInputStream("d:\\serial.txt");
		ObjectInputStream o2=new ObjectInputStream(f2);
		Customer c1=(Customer)o2.readObject();
		System.out.println(" after deserialization...");
		System.out.println(c1);

	}

}

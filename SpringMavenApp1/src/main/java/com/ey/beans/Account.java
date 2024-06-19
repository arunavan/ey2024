package com.ey.beans;

public class Account {
	Integer id;
	String name;
	public Account(){
		
	}
	public Account(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + "]";
	}
	
	public void start() {
		System.out.println(" bean created...");
	}
	public void stop() {
		System.out.println(" bean  destroying");
	}
	

}

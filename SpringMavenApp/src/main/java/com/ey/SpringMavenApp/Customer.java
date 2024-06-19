package com.ey.SpringMavenApp;

public class Customer {

	Integer id;
	String name;
	Customer(){
		
	}
	public Customer(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	public void start() {
		System.out.println(" bean created...");
	}
	public void stop() {
		System.out.println(" bean  destroying");
	}
}

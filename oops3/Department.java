package com.ey.oops3;
class Department{
	String id;
	String manager;
	String location;
	public Department(String id, String manager, String location) {
		super();
		this.id = id;
		this.manager = manager;
		this.location = location;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", manager=" + manager + ", location=" + location + "]";
	}
	
	

}
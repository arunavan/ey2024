package com.ey.oops3;
// Object equals() , hashCode()
class Course{
	Integer id;
	String name;
	Double duration;
	public Course(Integer id, String name, Double duration) {
		//Object 
		this.id = id;
		this.name = name;
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", duration=" + duration + "]";
	}
	/*
	@Override
	public int hashCode() {
		return this.id.hashCode();
	}
	
	@Override
	public boolean equals(Object object) {
		Course course=(Course)object;
		boolean flag=false;
		if((this.id==course.id) && this.name.equals(course.name)
		     && this.duration==course.duration)
			flag=true;
		else
			flag=false;
		return flag;
	}
	*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((duration == null) ? 0 : duration.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (duration == null) {
			if (other.duration != null)
				return false;
		} else if (!duration.equals(other.duration))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
}


public class EqualsHashCodeDemo {

	public static void main(String[] args) {
	/*	
		Course course[]=new Course[5];// array of objects , group of object
		course[0]=new Course(101,"java",5.4);
		course[1]=new Course(102,"oracle",2.4);
		course[2]=new Course(101,"java",5.4);
		course[3]=new Course(104,"spring",1.4);
		course[4]=new Course(105,"hibernate",1.4);
		
       for( Course c: course)
    	   System.out.println(c);
    	   
    	   */
		
		Course c1=new Course(101,"java",5.4);
		Course c2=new Course(101,"java",5.4);
		
		System.out.println(c1==c2);
		System.out.println("java".equals("java"));
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode()+"  "+c2.hashCode());
		
		
		
	}

}

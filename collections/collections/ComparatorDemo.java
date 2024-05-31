package com.ey.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Module {
	Integer id;
	String name;
	Integer duration;
		public Module(Integer id, String name, Integer duration) {
		super();
		this.id = id;
		this.name = name;
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Module [id=" + id + ", name=" + name + ", duration=" + duration + "]";
	}
	
}

class IdComparator implements Comparator{
	public int compare(Object o1,Object o2) {
		Module m1=(Module)o1;
		Module m2=(Module)o2;
		
		
		if( m1.id>m2.id)
			return 1;
		else
			if(m1.id<m2.id) 
				return -1;
			else
				return 0;
				
		  //+1  -1  0
	}
}
class NameComparator implements Comparator{
	public int compare(Object o1,Object o2) {
		Module m1=(Module)o1;
		Module m2=(Module)o2;
		
		
		return m1.name.compareTo(m2.name);
				
		
	}
}

class DurationComparator implements Comparator{
	public int compare(Object o1,Object o2) {
		Module m1=(Module)o1;
		Module m2=(Module)o2;
		
		
		if( m1.duration>m2.duration)
			return 1;
		else
			if(m1.duration<m2.duration) 
				return -1;
			else
				return 0;
				
		  //+1  -1  0
	}
}

public class ComparatorDemo {

	public static void main(String[] args) {
		//Set<Module> pset=new TreeSet<>(new DurationComparator());//for srting- Comparable, comparator
		List<Module> pset=new ArrayList<>();
		pset.add(new Module(5,"java",3));
		pset.add(new Module(2,"html",5));
		pset.add(new Module(1,"angular",2));
		pset.add(new Module(4,"microservices",1));
		
		Collections.sort(pset,new NameComparator());
		for( Module p: pset)
			System.out.println(p);
	}

}

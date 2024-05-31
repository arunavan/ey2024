package com.ey.collections;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<Integer,Object> map=new HashMap<>();
	//	ConcurrentHashMap<Integer,Object> map=new ConcurrentHashMap<>();
	//	Map<Integer,Object> map=new LinkedHashMap<>();
	//	Map<Integer,Object> map=new TreeMap<>();
	//	Hashtable<Integer,Object> map=new Hashtable<>();//synchronized 
		map.put(1, "java");
		map.put(4,new Product(10,"bag"));
		map.put(3, 897.89);
	
	//	map.put(null,"oracle");
	//	map.put(null,"mysql");
		
	//	map.put(5, null);
		map.put(2, new Date());
	//	map.put(6, null);
		System.out.println(map);
		System.out.println(map.get(4));
		map.replace(4,"postgres");
		//map.clear();
		System.out.println(map.isEmpty());
		
		Set keys=map.keySet();
		System.out.println(keys);
		
		Collection values=map.values();
		System.out.println(values);
		
		Set entries=map.entrySet();
		System.out.println(entries);
		
		Iterator i=entries.iterator();
		while(i.hasNext()) {
			Map.Entry e=(Map.Entry)i.next();
			map.put(9, "abc");
		//	map.remove(3);
			System.out.println(e.getKey()+  "  "+e.getValue());
		}
		
		System.out.println(" for loopp....");
		for(Map.Entry   e1: map.entrySet())
			System.out.println(e1.getKey() +"  "+e1.getValue());
		

	}

}

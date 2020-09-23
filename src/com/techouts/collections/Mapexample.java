package com.techouts.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Mapexample {

	public static void main(String[] args) {
		
		//iterating TreeMap 
		TreeMap<Integer,String>t=new TreeMap<>();
		t.put(1,"one");
		t.put(2, "two");
		t.put(3, "three");
		t.put(4, "four");
		t.put(5, "five");
		System.out.println(t);
	
		for(Map.Entry m1:t.entrySet()) {
			System.out.println(m1.getKey()+" "+m1.getValue());
		}
		
		System.out.println("***********");
		System.out.println("Hashmap Sorting by value");
		
		//HashMap Sorting by value
		
		HashMap<Integer,String>hm=new HashMap<>();
		hm.put(1, "login");
		hm.put(2,"perform");
		hm.put(3, "check");
		hm.put(4, "logout");
		hm.put(5, "webserver");

		List<Entry<Integer, String>> list=new LinkedList<Map.Entry<Integer,String>>(hm.entrySet());
		Collections.sort(list,new Comparator<Entry<Integer, String>>() {

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
			
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		for(Entry<Integer, String> item:list) {
			System.out.println(item);
		}
		
	}
		
	}


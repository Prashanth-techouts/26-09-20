package com.techouts.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Synchronizationexample {

	public static void main(String[] args) {
		HashMap<Integer,String>hm=new HashMap<>();
		hm.put(12, "login");
		hm.put(22,"perform");
		hm.put(34, "check");
		hm.put(14, "logout");
		hm.put(5, "webserver");
		
		System.out.println("before Synchronization");
		for(Entry<Integer, String> m:hm.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
			
		}
		
		Map map=Collections.synchronizedMap(hm);
		Set set=map.keySet();
		synchronized (map) {
		
			Iterator i=set.iterator();
			System.out.println("After Synchronization");
			while(i.hasNext()) {
				System.out.println(i.next());
			}
		}
		

	}

}

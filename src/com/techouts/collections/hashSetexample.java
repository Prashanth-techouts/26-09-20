package com.techouts.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class hashSetexample {

	public static void main(String[] args) {
		Set<String>h=new HashSet<>();
		h.add("laptop");
		h.add("desktop");
		h.add("cpu");
		h.add("mouse");
		h.add("desktop");
		h.add("Laptop");
		
		System.out.println(h);
		
		LinkedHashSet<String> lh=new LinkedHashSet<>();
		lh.add("laptop");
		lh.add("desktop");
		lh.add("cpu");	
		lh.add("mouse");
		lh.add("desktop");
		lh.add("Laptop");
		
		System.out.println(lh);
		
		
		TreeSet<String> t=new TreeSet<>();
		t.add("laptop");
		t.add("desktop");
		t.add("cpu");
		t.add("mouse");
		t.add("desktop");
		t.add("Laptop");
		t.add("laptop");
		System.out.println(t);
	}

}

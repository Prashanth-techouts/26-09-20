package com.techouts.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class LinkedListtoArraylist{

	public static void main(String[] args) {
		LinkedList<String>l=new LinkedList<>();
		l.add("ram");
		l.add("laxman");
		l.add("savya");
		l.add("venky");
		l.addFirst("sweety");
		l.addLast("sony");
		System.out.println(l);
	
		List<String>al=new ArrayList<>(l);
		System.out.println("After converting linked list to Arraylist");
		System.out.println(al);
		for(String a:al) {
		
			System.out.println(a);
		}
	
	}
}

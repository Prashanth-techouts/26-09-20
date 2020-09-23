package com.techouts.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ArrayListex {
	
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("hello");
		al.add("i am ");
		al.add("prashanth");
		
		System.out.println(al);
		
		al.add(1,"hai");
		System.out.println("after adding element at index 1");
		System.out.println(al);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("After Sorting in Descending");
		System.out.println(al);
		ListIterator<String> li1=al.listIterator(); 
			li1.add("new element");
		
			while(li1.hasNext()) {
				System.out.println(li1.next());
			
		}
			Collections.sort(al);
			System.out.println("After sorting Alphabetically");
			System.out.println(al);
			al.set(1,"greetings");
			System.out.println("After replacing an element");
			System.out.println(al);
		
			System.out.println(" After searching an element the result is"+" "+al.contains("greetings"));
			
			al.remove(3);
			System.out.println("After removing an element at index 3"+ al);
			
		
		
			System.out.println("********");
			System.out.println("using List Iterator");
			ListIterator<String> li=al.listIterator();
			while(li.hasNext()) {
			System.out.println(li.next());
		}
			Collections.sort(al,Collections.reverseOrder());
		
			System.out.println("after reversing an arraylist"+al);
		
			al.add("hai");
			al.add("prashanth");
			System.out.println(al);
			
			for(int i=0; i<al.size(); i++) {
				for(int j=i+1; j<al.size(); j++) {
				if(al.get(i).equals(al.get(j))) {
					al.remove(j);
					j--;
				}
				}
			}
			System.out.println("After removing duplicates"+al);
	
	}

}

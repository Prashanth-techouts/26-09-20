package com.techouts.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetToArray {

	public static void main(String[] args) {
		Set<Integer>s=new HashSet<>();
		s.add(100);
		s.add(200);
		s.add(300);
		s.add(400);
		s.add(500);
		
		Iterator<Integer>iterate=s.iterator();
		
		int[] arr=new int[s.size()];
		for(int i=0; i<s.size(); i++) {
			arr[i]=iterate.next();
		}
		
		System.out.println(Arrays.toString(arr));
		
		

	}

}

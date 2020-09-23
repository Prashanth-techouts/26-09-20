package com.techouts.collections;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class Serializationexample {

	public static void main(String[] args)  {
		HashMap<Integer,String>hm=new HashMap<>();
		hm.put(1, "login");
		hm.put(2,"perform");
		hm.put(3, "check");
		hm.put(4, "logout");
		hm.put(5, "webserver");
		try {
		FileOutputStream fos=new FileOutputStream("hashmap.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(hm);
		oos.close();
		fos.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Serialized data is stored in hashmap.ser");
		
		
		ArrayList<String> al=new ArrayList<>();
		al.add("hello");
		al.add("i am ");
		al.add("prashanth");
		al.add("trainee");
		al.add("at");
		al.add("techouts");
		try {
		FileOutputStream fos1=new FileOutputStream("arraylist.ser");
		ObjectOutputStream oos1=new ObjectOutputStream(fos1);
		oos1.writeObject(al);
		oos1.close();
		fos1.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Serialized data is stored in arraylist.ser");
	
	}
	
	
	

}

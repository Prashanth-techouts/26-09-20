package com.techouts.sportscomplex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PersonDetails {
	
	 List<PersonDetails>l=new LinkedList<>();
	Map<Integer,Object>m=new HashMap<>();
	
	Scanner sc=new Scanner(System.in);
	
	private  static  String Name;
	private  static int Age; 
	private static  String Gender; 
	private static  String Contact;
	private  static String Address;
	private  int count=0;
	private int id=1;
	


	public static String getName() {
		return Name;
	}

	public static void setName(String name) {
		Name = name;
	}

	public static int getAge() {
		return Age;
	}

	public static void setAge(int age) {
		Age = age;
	}

	public static String getGender() {
		return Gender;
	}

	public static void setGender(String gender) {
		Gender = gender;
	}

	public static String getContact() {
		return Contact;
	}

	public static void setContact(String contact) {
		Contact = contact;
	}

	public static String getAddress() {
		return Address;
	}

	public static void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		
		return " Name=" + Name + ", Age=" + Age + ", Gender=" + Gender + ", Contact=" + Contact
				+ ", Address=" + Address+ "";
	}

	public void Details() {
		m.put(id,l);
		id++;
		System.out.println("Please enter the ID  number");
		int idno=sc.nextInt();	
		Object Details=m.get(idno);
		System.out.println(" ");
		System.out.println("Your details are = "+Details.toString());
		System.out.println(" ");
		System.out.println("if you wish to continue please press Y. To Exit please press N");
		String s=sc.next();
		if (s.equalsIgnoreCase("y")) {
			System.out.println("Please choose the options 1.View Total List 2.new Registration");
			int choice=sc.nextInt();
			switch (choice) {
			case 1:
				totallist();
			break;
			case 2:
				Register();
			break;
			default :
					System.out.println("please choose either 1 or 2");
			break;
			}
			
		}
		else {
		System.out.println("Thank you...");	
		}
		
	}
	
	public void Register() {
		
		PersonDetails pd=new PersonDetails();
		System.out.println("please enter your name");
		Name=sc.nextLine();
		pd.setName(Name);
		System.out.println("Please enter your Age ");
		Age=sc.nextInt();
		pd.setAge(Age);
		System.out.println("Please enter your Gender M=Male or F=Female");
		Gender=sc.next();
		pd.setGender(Gender);
		System.out.println("Please enter your Contact number ");
		Contact=sc.next();
		pd.setContact(Contact);
		System.out.println("Please enter your Address ");
		sc.nextLine();
		Address=sc.nextLine();
		l.add(count,pd);
		count++;
		System.out.println(" your registration is successful.. ");
		System.out.println(" ");
		System.out.println("Your details are..");
		System.out.println(" ");
		Iterator<PersonDetails> i=l.iterator(); 
		while (i.hasNext()) {
		System.out.println(i.next());	
		}
		System.out.println(" ");
		System.out.println("if you wish to continue please press Y. To Exit please press N");
		String s=sc.next();
		if (s.equalsIgnoreCase("y")) {
			System.out.println("Please choose the options 1.View Total List 2.View the Details using Key");
			int choice=sc.nextInt();
			switch (choice) {
			case 1:
				totallist();
			break;
			case 2:
				Details();
			break;
			default :
					System.out.println("please choose either 1 or 2");
			break;
			}
			
		}
		else {
		System.out.println("Thank you for Registering...");	
		}
	}
	
	public void totallist() {
		System.out.println("***Total List***");
		Iterator<PersonDetails> i=l.iterator(); 
		while (i.hasNext()) {
		System.out.println(i.next());	
		}
		
		System.out.println("if you wish to continue please press Y. To Exit please press N");
		String s=sc.next();
		if (s.equalsIgnoreCase("y")) {
			System.out.println("Please choose the options 1.new Registration 2.View the Details using Key");
			int choice=sc.nextInt();
			switch (choice) {
			case 1:
				Register();
			break;
			case 2:
				Details();
			break;
			default :
					System.out.println("please choose either 1 or 2");
			break;
			}
			
		}
		else {
		System.out.println("Thank you...");	
		}
	}
	public static void main(String[] args) {

		PersonDetails person=new PersonDetails();
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Registration portel");
		System.out.println(" ");
		System.out.println("Kindly please fill your details ");
		System.out.println(" ");
		person.Register();
		
	}

}

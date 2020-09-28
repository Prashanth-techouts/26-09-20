package com.techouts.sportscomplex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class ResidentsList {
	
	private static String name;
	private static int age;
	private static String gender;
	private  int count=0;
	private int key=1;
	static Address address;
	
	 List<Object>list=new LinkedList<Object>();
	 Map<Integer,Object> m=new HashMap<>();
	 
	
	public ResidentsList(String name, int age, Address address, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.gender = gender;
		this.list.add(address);
	}

		@Override
	public String toString() {
		return "name=" + name + ", age=" + age + ",list=" + list+" gender=" + gender;
	}


	Scanner sc=new Scanner(System.in);
	
	
	public void Adddetails() {
		
		System.out.println("Enter the Name : ");
	       this.name = sc.next();
	       System.out.println("Enter the Age : ");
	       this.age = sc.nextInt();
	       System.out.println("Enter the gender ");
	       this.gender=sc.next();
	       System.out.println("Enter the House Number ");
		   String Hno = sc.next();
		   System.out.println("Enter the street name");
		   sc.nextLine();
		   String street=sc.nextLine();
		   System.out.println("Enter the village : ");
		   String village = sc.next();
		   System.out.println("Enter the distict : ");
		   String distict = sc.next();
		   System.out.println("Enter the State : ");
		   String state = sc.next();
		   System.out.println("Enter the pincode : ");
		   String pincode = sc.next();
		   ResidentsList rs= new ResidentsList(name, age,new Address(Hno,street, village, distict,state, pincode), gender);
		   list.add(count, rs);
		   m.put(key, list);
		   System.out.println("Your Details Are Successfully Added and your id number is ="+key);
		   key++;
		   System.out.println("if you wish to continue please press Y. To Exit please press N");
			String s=sc.next();
			if (s.equalsIgnoreCase("y")) {
				System.out.println("Please choose the options 1.new Registration 2.View the Details using Key");
				int choice=sc.nextInt();
				switch (choice) {
				case 1:
					Adddetails();
				break;
				case 2:
					getDetails();
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
	
	public void getDetails() {
		
		System.out.println("please enter your id number");
		int id=sc.nextInt();
		System.out.println("Your details are="+m.get(id));
	}
	
	public static void main(String[] args) {
		ResidentsList rlist=new ResidentsList(gender, age, address, gender);
	
		int choice=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please choose 1.Adddetails 2.get the details");
		choice=sc.nextInt();
		switch (choice) {
		case 1:
			rlist.Adddetails();
			break;
			
		case 2:
			rlist.getDetails();
			break;	
		default:
			System.out.println("Please choose either 1 or 2 ");
			break;
		}
		
	}


}

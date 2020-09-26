package com.techouts.sportscomplex;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SportsComplex {
	
	static String name;
	static String S;
	Scanner sc=new  Scanner(System.in);
	
	public void Sportslist() {
		
		System.out.println("*****Warriors sports club Welcomes you*****");
		System.out.println(" ");
		System.out.println("Please enter your name");
		sc.nextLine();
		name=sc.nextLine();
		System.out.println("Sports list");
		Map<Integer,String>sportslist=new HashMap<>();
		sportslist.put(1,"Badminton court");
		sportslist.put(2, "Football");
		sportslist.put(3, "Box cricket");
		System.out.println("Serial No"+"     "+"Name Of The Sport");
		System.out.println("   ");
		for (Map.Entry<Integer, String> list : sportslist.entrySet()) {
			System.out.println("   "+list.getKey()+"            "+list.getValue());
		}
		System.out.println("Please choose your Sport serial number you wish to book");
		int choice=sc.nextInt();
		switch (choice) {
		case 1:
			Badminton();
			break;
		case 2:
			Football();
			
			break;
		case 3:
			Boxcricket();
			
			break;
		default:
			System.out.println("please choose specified Sport serial numbers only...");
			break;
		}

	}
		
	static Map<Integer,String>badmintonslots=new HashMap<>();
	
	
	public void Badminton() {
		
		System.out.println("please enter your name...");
		sc.nextLine();
		String user=sc.nextLine();
		System.out.println(" ");
		System.out.println("The Availabale Badminton Slots are given below..");
		System.out.println(" ");
		System.out.println("Serial No"+"     "+"Slot Timings");
		System.out.println("   ");
		for (Map.Entry<Integer, String> list : badmintonslots.entrySet()) {
			System.out.println("   "+list.getKey()+"            "+list.getValue());
		}
		System.out.println("Please choose your Slot serial number you wish to book");
		int badmintonchoice=sc.nextInt();
		
		if (badmintonslots.get(badmintonchoice)!=null) {
			
		System.out.println("your booking Succesful...");
		System.out.println("your slot details  "+"name="+user+"  "+"Slot Timing"+" "+badmintonslots.get(badmintonchoice)+" "+"Sport name=Badminton ");
		System.out.println("Thank you for booking..");
		}
		else
		{
			System.out.println("Sorry Slot is Already booked....");
		}
		badmintonslots.remove(badmintonchoice);
		System.out.println("if You wish to continue please press Y . To Exit please press N");
		S=sc.next();
		if (S.equalsIgnoreCase("y")) {
			Badminton();
		}
		else {
			Sportslist();
		}
		
		}
	
	static Map<Integer,String>footballslots=new HashMap<>();
	
	public void Football() {

		System.out.println("please enter your name...");
		sc.nextLine();
		String user=sc.nextLine();
		System.out.println(" ");
		System.out.println("The Availabale FootBall Slots are given below...");
		System.out.println(" ");
		System.out.println("Serial No"+"        "+"Slot Timings");
		System.out.println("   ");
		for (Map.Entry<Integer, String> list : footballslots.entrySet()) {
			System.out.println("   "+list.getKey()+"            "+list.getValue());
		}
		System.out.println("Please choose your Slot serial number you wish to book");
		int footballchoice=sc.nextInt();
		
		if (footballslots.get(footballchoice)!=null) {
			
		System.out.println("your booking Succesful...");
		System.out.println("your slot details  "+"name="+user+"  "+"Slot Timings"+" "+footballslots.get(footballchoice)+" "+"Sport name=FootBall ");
		System.out.println("Thank you for booking..");
		}
		else
		{
			System.out.println("Sorry Slot is Already booked..");
		}
		footballslots.remove(footballchoice);
		System.out.println("if You wish to continue please press Y. To Exit please press N");
		S=sc.next();
		if (S.equalsIgnoreCase("y")) {
			Football();
		}
		else {
			Sportslist();
		}	
	}
	
	static Map<Integer,String>boxcricketslots=new HashMap<>();
	
	public void Boxcricket() {

		System.out.println("please enter your name...");
		sc.nextLine();
		String user=sc.nextLine();
		System.out.println("The Availabale Box Cricket Slots are given below..");
		System.out.println(" ");
		System.out.println("Serial No"+"       "+"Slot Timings");
		System.out.println("   ");
		for (Map.Entry<Integer, String> list : boxcricketslots.entrySet()) {
			System.out.println("   "+list.getKey()+"            "+list.getValue());
		}
		System.out.println("Please choose your Slot serial number you wish to book");
		int boxcricketchoice=sc.nextInt();
		
		if (boxcricketslots.get(boxcricketchoice)!=null) {
			
		System.out.println("your booking Succesful...");
		System.out.println("your slot details  "+"name="+user+"  "+"Slot Timings"+" "+boxcricketslots.get(boxcricketchoice)+" "+"Sport name=Box Cricket ");
		System.out.println("Thank you for booking..");
		}
		else
		{
			System.out.println("Sorry Slot is Already booked..");
		}
		boxcricketslots.remove(boxcricketchoice);
		System.out.println("if You wish to continue please press Y. To Exit please press N");
		S=sc.next();
		if (S.equalsIgnoreCase("y")) {
			Boxcricket();
		}
		else {
			Sportslist();
		}
	}
	
	public static void main(String[] args) {
		
		badmintonslots.put(1,  "09:00AM to 10:00AM");
		badmintonslots.put(2,  "10:00AM to 11:00AM");
		badmintonslots.put(3,  "11:00AM to 12:00AM");
		badmintonslots.put(4,  "12:00AM to 01:00PM");
		badmintonslots.put(5,  "01:00PM to 02:00PM");
		badmintonslots.put(6,  "02:00PM to 03:00PM");
		badmintonslots.put(7,  "03:00PM to 04:00PM");
		badmintonslots.put(8,  "04:00PM to 05:00PM");
		badmintonslots.put(9,  "05:00PM to 06:00PM");
		badmintonslots.put(10,"06:00PM to 07:00PM");
	
		footballslots.put(1,  "09:00AM to 09:30AM");
		footballslots.put(2,  "09:30AM to 10:00AM");
		footballslots.put(3,  "10:00AM to 10:30AM");
		footballslots.put(4,  "10:30AM to 11:00AM");
		footballslots.put(5,  "11:00AM to 11:30AM");
		footballslots.put(6,  "11:30AM to 12:00PM");
		footballslots.put(7,  "12:00PM to 12:30PM");
		footballslots.put(8,  "12:30PM to 01:00PM");
		footballslots.put(9,  "01:00PM to 01:30PM");
		footballslots.put(10, "01:30PM to 02:00PM");
		footballslots.put(11, "02:00PM to 02:30PM");
		footballslots.put(12, "02:30PM to 03:00PM");
		footballslots.put(13, "03:00PM to 03:30PM");
		footballslots.put(14, "03:30PM to 04:00PM");
		footballslots.put(15, "04:00PM to 04:30PM");
		footballslots.put(16, "04:30PM to 05:00PM");
		footballslots.put(17, "05:00PM to 05:30PM");
		footballslots.put(18, "05:30PM to 06:00PM");
		footballslots.put(19, "06:00PM to 06:30PM");
		footballslots.put(20, "06:30PM to 07:00PM");
		
		boxcricketslots.put(1, "10:00AM to 12:00PM");
		boxcricketslots.put(2, "12:00PM to 02:00PM");
		boxcricketslots.put(3, "02:00PM to 04:00pM");
		boxcricketslots.put(4, "04:00PM to 06:00PM");
		boxcricketslots.put(5, "06:00PM to 08:00PM");
		
		SportsComplex sp=new SportsComplex();
		sp.Sportslist();
		
		
	}

}

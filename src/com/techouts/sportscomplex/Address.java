package com.techouts.sportscomplex;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Address {
	
	private String Hno;
	private  String street;
	private String village;
	private String district;
	private String state;
	private String pincode;
	
	
	
public Address(String hno, String street, String village, String district, String state, String pincode) {
		super();
		Hno = hno;
		this.street = street;
		this.village = village;
		this.district = district;
		this.state = state;
		this.pincode = pincode;
	}



@Override
public String toString() {
	return "Hno=" + Hno + ", street=" + street + ", village=" + village + ", district=" + district + ", state="
			+ state + ", pincode=" + pincode;
}
}


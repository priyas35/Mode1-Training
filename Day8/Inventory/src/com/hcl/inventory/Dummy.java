package com.hcl.inventory;

public class Dummy {

	public static void main(String[] args) {
		int number = 111;

	       // String format below will add leading zeros (the %0 syntax) 
	       // to the number above. 
	       // The length of the formatted string will be 7 characters.

	       String formatted = String.format("%03d", number);

	       System.out.println("Number with leading zeros: " + formatted);
	}
}

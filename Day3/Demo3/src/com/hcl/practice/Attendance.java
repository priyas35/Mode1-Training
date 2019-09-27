package com.hcl.practice;

public class Attendance {
	
	public static void display(Object...ob){
		for (Object obj : ob) {
			System.out.print(obj+ " ");
		}
		System.out.println();
	}
	public static void show(String...name){
		for (String s : name) {
			System.out.print(s + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		show();
		show("priya sri");
		show("hema","janani","anisha");
		show("bindhu","jehanath","kiruba","abi");
		
		display();
		display("ram",12,true,12.8);
	}

}

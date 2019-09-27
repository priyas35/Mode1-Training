package com.priya.samples.java8;

public class MultiInterface{
	public static void main(String[] args) {
		NewInterface ni=(name)->(name + "world");
		System.out.println(ni.sayHello("Hello"));
		
		System.out.println(NewInterface.add(20, 30,40));
		System.out.println(ni.defaultMethod(10));
		NewInterface ni2=(name)->(name+"world");
		System.out.println(ni.equals(ni2));
		
		
		
	}

}

package com.hcl.boxing;

public class BoxDemo {
	public static void main(String[] args) {
		int a=12;
		double b=12.5;
		String name="Hcl";
		/* Boxing Code */
		
		Object ob1=a;
		Object ob2=b;
		Object ob3=name;
		
		/*Unboxing code */
		int a1=(Integer)ob1;
		double b1=(Double)ob2;
		String n1=(String)ob3;
		
		a1++;
		System.out.println("Integer Value "+a1);
		System.out.println("Double Value " +b1);
		System.out.println("String "+n1);
	}
   
}

package com.hcl.json;

import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JasonMultiDimArray {
	public static void main(String args[]){  
		
		JSONArray o = new JSONArray(); 
		for(int i=0;i<2;i++){
			JSONArray arr = new JSONArray(); 
			Scanner sc=new Scanner(System.in);
			System.out.println("Name:");
			String name=sc.next();
			System.out.println("Age:");
			int age = sc.nextInt();
			System.out.println("Salary:");
			double salary=sc.nextDouble();
			
			arr.add(name);    
			  arr.add(age);    
			  arr.add(salary);  
			  o.add(i,arr);
		}
		System.out.println(o);
}
}

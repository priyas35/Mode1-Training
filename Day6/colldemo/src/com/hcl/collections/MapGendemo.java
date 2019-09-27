package com.hcl.collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapGendemo {
	public static void main(String[] args) {
		Map<Integer, String> m=new Hashtable<Integer,String>();
		m.put(1, "priya");
		m.put(2, "vinod");
		m.put(3, "laksh");
		m.put(4, "hema");
		m.put(5, "bindu");
		
		int key;
		String result;
		System.out.println("enter key");
		Scanner sc=new Scanner(System.in);
		key=sc.nextInt();
		result=m.getOrDefault(key, "Not found");
		System.out.println(result);
		
		
	}

}

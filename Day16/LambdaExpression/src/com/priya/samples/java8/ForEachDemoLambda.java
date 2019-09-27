package com.priya.samples.java8;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemoLambda {
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		
		list.forEach((var) -> System.out.println(var));
		
	}

}

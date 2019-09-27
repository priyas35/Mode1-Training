package com.hcl.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
	public static void main(String[] args) {
		SortedSet lstnames=new TreeSet();
		lstnames.add("priya");
		lstnames.add("srinath");
		lstnames.add("hema");
		lstnames.add("bindu");
		lstnames.add("janani");
		lstnames.add("anisha");
		lstnames.add("jehanath");
		System.out.println("sorted data");
		lstnames.forEach(System.out::println);
		
	}

}

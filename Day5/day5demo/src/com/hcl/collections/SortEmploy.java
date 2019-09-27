package com.hcl.collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {
	public static void main(String[] args) {
		Comparator c=new BasicComparator(); 
		
		SortedSet lstnames=new TreeSet(c);
		lstnames.add(new Employ(1, "anisha", 765767.76));
		lstnames.add(new Employ(2, "anu", 767.76));
		lstnames.add(new Employ(3, "sidhu", 7676));
		lstnames.add(new Employ(4, "achu", 98967.76));
		lstnames.add(new Employ(5, "ram", 875767.76));
		System.out.println("sorted data");
		
		lstnames.forEach(System.out::println);
		
		
	}

}

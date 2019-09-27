package com.hcl.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SorEmploy {
	public static void main(String[] args) {
		Comparator<Employ> c=new NameComparator();
		Set<Employ> setemploy=new TreeSet<Employ>(c);
		setemploy.add(new Employ(1,"Divya",78978));
		setemploy.add(new Employ(2,"laksh",543814));
		setemploy.add(new Employ(3,"vinod",14777));
		setemploy.add(new Employ(4,"prem",6514655));
		setemploy.add(new Employ(5,"raghu",17771));
		setemploy.add(new Employ(6,"hema",75454));
		System.out.println("employ list");
		setemploy.forEach(System.out::println);
	}
	

}

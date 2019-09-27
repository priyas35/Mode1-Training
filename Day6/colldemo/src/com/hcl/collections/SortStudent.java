package com.hcl.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortStudent {
	
		public static void main(String[] args) {
			Comparator<Student> c=new NameComparator2();
			Set<Student> setemploy=new TreeSet<Student>(c);
			List<Student> lststu=new ArrayList<Student>();
			lststu.add(new Student("priyadharshini", "s", "chennai",10));
			lststu.add(new Student("srinath", "s", "trichy",11));
			lststu.add(new Student("senthilkumar", "k", "karur",10.5));
			lststu.add(new Student("sasikala", "A", "samayapuram",10.9));
			lststu.add(new Student("hariharan", "s", "srirangam",10.6));
			System.out.println("studentlist");
			setemploy.forEach(System.out::println);
		}
		
	}



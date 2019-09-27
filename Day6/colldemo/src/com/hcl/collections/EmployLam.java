package com.hcl.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployLam {
	public static void main(String[] args) {
		List<Employ> list=new ArrayList<Employ>();
		list.add(new Employ(1, "sindhu", 25000));
		list.add(new Employ(2, "achu", 1000));
		list.add(new Employ(3, "priya", 200));
		
		Collections.sort(list,(p1,p2) ->{
			return p1.name.compareTo(p2.name);
		});
		for (Employ product : list) {
			System.out.println(product);
		}
	Collections.sort(list,(p1,p2) ->{
			return (int)(p1.basic - p2.basic);
		});
		System.out.println("sort by basic wise");
		for (Employ product : list) {
			System.out.println(product);
	}
		
		list.stream().filter(p -> p.basic >=25000).forEach(x ->{
			System.out.println(x);
		});
	}

}

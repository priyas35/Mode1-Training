package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class ListReducedemo {
	public static void main(String[] args) {
		List< Integer> lst=new ArrayList<Integer>();
		lst.add(3);
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(9);
		
		int sum=lst.stream().reduce(1, (e2,e1) -> e1+e2);
		System.out.println(sum);
		
	}

}

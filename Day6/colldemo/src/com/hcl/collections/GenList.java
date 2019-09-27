package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class GenList {
	public static void main(String[] args) {
		List<Integer> lstdata=new ArrayList<Integer>();
		lstdata.add(new Integer(42));
		lstdata.add(new Integer(11));
		lstdata.add(new Integer(18));
		lstdata.add(new Integer(19));
		lstdata.add(new Integer(13));
		lstdata.add(new Integer(35));
		int sum=0;
		for (Integer integer : lstdata) {
			sum+=integer;
			
		}
		System.out.println("sum is " +sum);
	}

}

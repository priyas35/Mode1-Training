package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class LambdaLimit {
	public static void main(String[] args) {
		
	
	List<Integer> lstdata=new ArrayList<Integer>();
	lstdata.add(new Integer(42));
	lstdata.add(new Integer(11));
	lstdata.add(new Integer(18));
	lstdata.add(new Integer(19));
	lstdata.add(new Integer(13));
	lstdata.add(new Integer(35));
	System.out.println("limited");
	lstdata.stream().limit(3).forEach(p -> {
		System.out.println(p);
	});
	System.out.println("skipped data");
	lstdata.stream().skip(2).forEach(p -> {
		System.out.println(p);
	});
	System.out.println("filtered data");
	lstdata.stream().filter(p ->p >5).forEach(x -> {
		System.out.println(x);
	});

}
}
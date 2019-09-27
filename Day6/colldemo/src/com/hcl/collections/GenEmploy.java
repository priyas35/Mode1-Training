package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class GenEmploy {
	public static void main(String[] args) {
		
	
	List<Employ> lstEmploy=new ArrayList<Employ>();
	lstEmploy.add(new Employ(1,"Divya",78978));
	lstEmploy.add(new Employ(2,"laksh",543814));
	lstEmploy.add(new Employ(3,"vinod",14777));
	lstEmploy.add(new Employ(4,"prem",6514655));
	lstEmploy.add(new Employ(5,"raghu",17771));
	lstEmploy.add(new Employ(6,"hema",75454));
	System.out.println("employ list");
	lstEmploy.forEach(System.out::println);
	

}
}
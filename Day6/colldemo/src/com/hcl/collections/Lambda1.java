package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class Lambda1 {
	public static void main(String[] args) {
		List<Integer> lstdata=new ArrayList<Integer>();
		lstdata.add(new Integer(42));
		lstdata.add(new Integer(11));
		lstdata.add(new Integer(18));
		lstdata.add(new Integer(19));
		lstdata.add(new Integer(13));
		lstdata.add(new Integer(35));
		lstdata.forEach(p -> {
			if(p >= 15){
				System.out.println(p);
			}
			
		}
		);

}
}

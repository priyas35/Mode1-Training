package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class GenStudent {
	public static void main(String[] args) {
		
		List<Student> lststu=new ArrayList<Student>();
		lststu.add(new Student("priyadharshini", "s", "chennai",10));
		lststu.add(new Student("srinath", "s", "trichy",11));
		lststu.add(new Student("senthilkumar", "k", "karur",10.5));
		lststu.add(new Student("sasikala", "A", "samayapuram",10.9));
		lststu.add(new Student("hariharan", "s", "srirangam",10.6));
	}

}

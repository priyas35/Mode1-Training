package com.hcl.boxing;

public class EmployTest {
	public static void main(String[] args) {
		Employ e1=new Employ();
		e1.empno=3;
		e1.name="priya";
		e1.basic=5454;
		
		Employ e2=new Employ();
		e2.empno=3;
		e2.name="priya";
		e2.basic=5454;
		
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
	}

}

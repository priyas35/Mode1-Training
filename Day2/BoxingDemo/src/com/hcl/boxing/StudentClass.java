package com.hcl.boxing;

public class StudentClass {
	public static void main(String[] args) {
		Student s1=new Student();
		
		s1.sno=1;
		s1.name="bindhu";
		s1.city="hassan";
		s1.cgp=10;
		
Student s2=new Student();
		
		s2.sno=1;
		s2.name="bindhu";
		s2.city="hassan";
		s2.cgp=11;
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		
		
	}

}

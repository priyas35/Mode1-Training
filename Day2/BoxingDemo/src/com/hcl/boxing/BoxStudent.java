package com.hcl.boxing;

public class BoxStudent {
	
	public void show(Object ob){
		Student s=(Student)ob;
		System.out.println(s);
	}
	public static void main(String[] args) {
		Student obj=new Student();
		obj.sno=1;
		obj.name="nagindra";
		obj.city="chennai";
		obj.cgp=8.6;
		
		
		new BoxStudent().show(obj);
	}

}

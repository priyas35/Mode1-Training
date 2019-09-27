package com.hcl.practice;

class First{
	public void show() {
		System.out.println("base");

	}
}
class Second extends First{
	public void show() {
		//calling base class
		//super.show();
		System.out.println("derived");

	}
	
}

public class Inh {
	public static void main(String[] args) {
		
		//derived class called
		Second ob=new Second();
		ob.show();
		
		////derived class called
		First obj1=new Second();
		obj1.show();
		
		////derived class called
		First ob1=new First();
		Second ob2=new Second();
		
		//derived class called
		First f1=(First)ob2;
		f1.show();
		
		//derived class called
		First f2=(Second)ob2;
		f2.show();
		
		
		/* runtime error
		Second f3=(Second)ob1;
		f3.show(); 
		*/
	}
 
}

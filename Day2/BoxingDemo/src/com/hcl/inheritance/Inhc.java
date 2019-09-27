package com.hcl.inheritance;

class First{
	static{
		System.out.println("base class static");
	}
	public First(){
				System.out.println("base class constructor");
	}
}

class Second extends First{
	static{
		System.out.println("derived class static");
	}
	public Second(){
		System.out.println("derived class constructor");
	}
}

public class Inhc {
       public static void main(String[] args) {
		new Second();
	}

}

package com.priya.fi;

public class InstanceMethodMain {
	
	public static void main(String[] args) {
		InstanceInterface ii=() ->{System.out.println("welcome");};
		ii.myInterface();
		
		/*
		InstanceInterface ii1=System.out::println;
	      ii1.myInterface();*/
	      
	      
	      InstanceMethodReference c=new InstanceMethodReference();
	      InstanceInterface ii2=c::saySomthing;
	      ii2.myInterface();
	}

}

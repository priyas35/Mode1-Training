package com.priya.samples.java8;


@FunctionalInterface
public interface NewInterface {
	
	public String sayHello(String name);
	
	public static int add(int num1,int num2,int num3){
		return num1+num2;
	}
	
	boolean equals(Object obj);
	default public int defaultMethod(int variable){
		return variable+100;
	}

}

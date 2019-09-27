package com.hcl.boxing;

public class Quiz1 {
	public void show(Object x){
		System.out.println("Object "+x);
	}
	public void show(double x){
		System.out.println("Double "+x);
	}
	public static void main(String[] args) {
		new Quiz1().show(12);
	}

}

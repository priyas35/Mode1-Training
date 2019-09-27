package com.hcl.boxing;

public class StDemo {
	void show(){
		System.out.println("from show method");
	}
	static void display(){
		System.out.println("from display method");
	}
    public static void main(String[] args) {
		StDemo.display();
		new StDemo().show();
	}
}

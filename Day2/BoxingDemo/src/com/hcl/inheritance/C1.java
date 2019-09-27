package com.hcl.inheritance;

class InDemo{
	public void show(){
		System.out.println("from show method");
	
	}
}

class C2 extends InDemo{
	public void display(){
		System.out.println("from display method");
	}
}

public class C1 {
	public static void main(String[] args) {
		C2 obj=new C2();
		obj.show();
		obj.display();
		
	
	}

}
package com.hcl.inheritance;

class A1{
	private int x;
	public int a;
	protected int s;
	public void demo(int ob){
		System.out.println("private inside the class" +x);
		System.out.println("public inside the class" +a);
		System.out.println("protected inside the class" +s);
		
	}
}
class A2 extends A1{
	public void show(int ab){
		System.out.println("private derived  class"+x);
		System.out.println("public inside derived the class"+a);
		System.out.println("protected inside the class"+s);
	}
	
}

public class AccessSpecifiers {
	
	A1 a1=new A1();
	A2 a2=new A2();
	
	a1.demo(3);
	a2.show(8);

}

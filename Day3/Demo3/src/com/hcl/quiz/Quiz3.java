package com.hcl.quiz;

class Cal{
	int a,b;
	public Cal(){
		a=5;b=8;
	}
	@Override
	public String toString() {
		return "C1 [a=" + a + ", b=" + b + "]";
	}
	
}
class Cal2 extends Cal{
	public Cal2(int a,int b) {
		System.out.println("done");
	}
}

public class Quiz3 {
	public static void main(String[] args) {
		Cal2 obj=new Cal2(12, 5);
		System.out.println(obj);
	}

}

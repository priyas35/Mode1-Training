package com.hcl.quiz;

enum Test{
	A,B,X,Y,P,C,N;
	private Test() {
		System.out.println("hi");
		
	}
}

public class Quiz4 {
	public static void main(String[] args) {
		Test t=Test.N;
	}

}

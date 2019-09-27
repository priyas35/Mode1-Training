package com.hcl.java;

public class MaxOf3 {
	public void check(int a,int b,int c){
		if(a>b && a>c){
			System.out.println("A is Greater");
		}else if(b>c){
			System.out.println("B is Greater");
		}else{
			System.out.println("C is Greater");
		}
	}
	public static void main(String[] args) {
		int a=3,b=8,c=6;
		MaxOf3 obj=new MaxOf3();
		obj.check(a,b,c);
	}

}

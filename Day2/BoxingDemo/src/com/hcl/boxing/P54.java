package com.hcl.boxing;

public class P54 {
	static int x;
	static{
		x=12;
	}
	public static int show(){
		return x--;
	}
	public static void main(String[] args) {
		System.out.println(show());
	}

}

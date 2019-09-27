package com.hcl.boxing;

public class P2 {
	public void show(Object ob){
		if(ob=="ABC"){
			System.out.println("correct");
		}else{
			System.out.println("error");
		}
	}
   public static void main(String[] args) {
	String s="ABC";
	P2 obj=new P2();
	obj.show(s);
}
}

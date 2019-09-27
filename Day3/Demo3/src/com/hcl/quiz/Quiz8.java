package com.hcl.quiz;

public class Quiz8 {
	public int result;
	public  void power(int a,int b){
	  for(int i=1;i<=b;i++){
		  int c=a;
		  result=a*c;
		 
	  }
	  System.out.println("power= " +result);
	}
	
	public void root(int a){
		
		
	}
	public void square(int x){
		result=x*x;
		System.out.println("square= "+result);
	}
	public static void main(String[] args) {
	new	Quiz8().power(2,2);
	new Quiz8().square(4);	
	}

}

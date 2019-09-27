package com.priya.samples.java8;

public class WithoutLambdaExpression {
      public static void main(String[] args) {
		
    	  MyInterface mi=new MyInterface(){

			
    		  
    	  
			
			@Override
			public void sayMessage() {
				System.out.println("welcome priya");
				
			}
			
		};
		mi.sayMessage();
		
	}
}

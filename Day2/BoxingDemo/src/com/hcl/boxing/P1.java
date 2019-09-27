package com.hcl.boxing;

public class P1 {
         public void show(int x){
        	 switch(x){
        	 case 1:
        		 System.out.println("Hi 1");
        		 break;
        	 case 2:
        		 System.out.println("Bye 2");
        		 break;
        	 case 3:
        		 System.out.println("hello 3");
        	 case 4:
        		 System.out.println("test 4");
        	 case 5:
        		 System.out.println("demo 5");
        	default:
        		System.out.println("default");
        		 
        	
        	 }
         }
         public static void main(String[] args) {
			P1 obj=new P1();
			obj.show(3);
		}
}

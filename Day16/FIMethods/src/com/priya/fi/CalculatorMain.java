package com.priya.fi;


public class CalculatorMain {
     public static void main(String[] args) {
		Calculator cal=new Calculator();
		Integer ans=cal.calc((x,y)->x+y,10,5);
		System.out.println(ans);
		
		Integer ans1=cal.calc((x,y)->x-y,10,5);
		System.out.println(ans1);
		
		Integer ans2=cal.calc((x,y)->x*y,10,5);
		System.out.println(ans2);
	}
    
}

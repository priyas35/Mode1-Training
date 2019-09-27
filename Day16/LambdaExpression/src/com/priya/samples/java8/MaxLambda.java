package com.priya.samples.java8;

public class MaxLambda {
	
	public static void main(String[] args) {
		MaxCheck  ml=(var1,var2)->{int max=var1>var2?var1:var2;return max;};
		int res=ml.max(2, 3);
		System.out.println(res);
		
	}

}

package com.hcl.junitpractice;

import java.util.HashMap;
import java.util.Map;

public class Data {
	
	public int div(int a,int b){
		int c=1;
		try {
			c=a/b;
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}
	
	
	public String getpropertyTest(String key){
		Map<String, String> m= new HashMap<String,String>();
		m.put("meena", "java");
		m.put("priya", "dharshini");
		m.put("sri", "nath");
		m.put("senthil", "sasi");
		return m.get(key);
		
	}
	
	public boolean even(int x){
		if(x%2==0){
			return true;
		}else{
			return false;
		}
	}
	
	public int minArray(int[] x){
		int min=x[0];
		for(int i=0;i<x.length;i++){
			if(min >x[i]){
				min=x[i];
			}
		}
		return min;
	}
	
	public int max3(int a,int b,int c){
		int m=a;
		if(m<b){
			m=b;
		}
		if(m<c){
			m=c;
		}
		return m;
	}
	
	public String sayHello(){
		return "welcome to junit";
	}
	public int sum(int a,int b){
		return a+b;
	}

}

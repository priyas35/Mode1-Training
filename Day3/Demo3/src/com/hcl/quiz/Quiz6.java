package com.hcl.quiz;

public class Quiz6 {
       public static void main(String[] args) {
		Object[] arr=new Object[]{
				12,"welcome",12.5,"hcl",'a',true,11,11.9,"bangalore"
		};
		for (Object object : arr) {
			//It will print int values only
//			if(object instanceof Integer){
//				System.out.println(object);
//			}
			if(object instanceof String){
				System.out.println(object);
			}
		}
	}
}

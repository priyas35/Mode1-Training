package com.priya.samples.java8;

public class WithLambdaExpression {
    public static void main(String[] args) {
		/*MyFunctionalInteface mi=()->{System.out.println("welcome priyadharsini");};
		mi.sayMessage();*/
    	
    	MyFunctionalInteface mfi1=(var1,var2) ->(var1+var2);
    	int res1=mfi1.addTwoNumbers(10,20);
    	System.out.println(res1);
    	
    	MyFunctionalInteface mfi2=(var1,var2) ->(var1+var2);
    	int res2=mfi2.addTwoNumbers(20,20);
    	System.out.println(res2);
	}
}

package com.hcl.inf;

interface Ione{
	void name();
}

interface Itwo{
	void email();
}
class Test implements Ione,Itwo{

	@Override
	public void email() {
		System.out.println("email hcl@gmail.com");
	}

	@Override
	public void name() {
		System.out.println("company Hcl");
	}
	
}

public class MultiInh {
	public static void main(String[] args) {
		Test obj=new Test();
		obj.name();
		obj.email();
	}

}

package com.hcl.abs;

abstract class Training{
	abstract void name();
	abstract void email();
}
class Anubav extends Training{

	@Override
	void name() {
		System.out.println("Name is Anubav..");
		
	}

	@Override
	void email() {
		System.out.println("anubavanand@gmail.com");
		
		
	}
	
}

class SaiKrishna extends Training{

	@Override
	void name() {
		System.out.println("Name is sai....");
		
	}

	@Override
	void email() {
		System.out.println("saikrish@gmail.com");
		
	}
	
}

public class AbsDemo {
	public static void main(String[] args) {
//		Training t1=new Anubav();
//	    Training t2=new SaiKrishna();	
		
		Training[] arr=new Training[]{
				new Anubav(),
				new SaiKrishna()
		};
		for (Training t: arr) {
			t.name();
			t.email();
		}
	}

}

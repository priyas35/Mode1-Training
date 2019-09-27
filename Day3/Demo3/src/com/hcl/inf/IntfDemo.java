package com.hcl.inf;

interface Itraining{
	void name();
	void email();
}

class Hema implements Itraining{

	@Override
	public void name() {
		System.out.println("name is hema");
		
		
	}

	@Override
	public void email() {
		System.out.println("hema@gmail.com");
		
		
	}
	
}

class Keerthana implements Itraining{

	@Override
	public void name() {
		System.out.println("keerthana");
	}

	@Override
	public void email() {
		System.out.println("keer@hcl.com");
		
	}
	
}
public class IntfDemo {
	public static void main(String[] args) {
		Itraining[] arr=new Itraining[]{
				new Hema(),
				new Keerthana()
		};
		for (Itraining t : arr) {
			t.name();
			t.email();
		}
	}

}

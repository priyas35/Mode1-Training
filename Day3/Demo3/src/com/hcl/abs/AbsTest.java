package com.hcl.abs;


abstract class Animal{
	abstract void name();
	abstract void type();
	
}

class Lion extends Animal{

	@Override
	void name() {
		System.out.println("name is lion");
		
	}

	@Override
	void type() {
		System.out.println("wild animal");
		
	}
	
}

class Crocodile extends Animal{

	@Override
	void name() {
		System.out.println("name is crocodile");
		
	}

	@Override
	void type() {
		System.out.println("amphibian");
	}
	
}

public class AbsTest {
	public static void main(String[] args) {
		Animal[] arr=new Animal[]{
			new Lion(),
			new Crocodile()
		};
		for (Animal animal : arr) {
			animal.name();
			animal.type();
			
		}
	}
	
	
	
	

}

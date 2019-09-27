package com.hcl.inf;

interface Ifirst{
	default void name(){
		System.out.println("name First");
	}
}
interface Isecond{
	default void name(){
		System.out.println("name second");
	}
}
interface Ithird{
	default void name(){
		System.out.println("name third");
	}
}
class Demo implements Ifirst,Isecond,Ithird{

	@Override
	public void name() {
		Ifirst.super.name();
		Isecond.super.name();
		Ithird.super.name();
	}
	
}

public class IntfTest {
	public static void main(String[] args) {
		new Demo().name();
	}

}

package com.priya.fi;

import java.util.function.Consumer;

public class MyInterfaceMain {
	
	public static void main(String[] args) {
		MyInterface mi=(a) ->{
			System.out.println(a);
		};
		mi.someMethod("HCL");
		
		MyInterface mi1=System.out::println;
		mi.someMethod("priya");
		
		Consumer<String> con=System.out::println;
		con.accept("bye");
		
	}

}

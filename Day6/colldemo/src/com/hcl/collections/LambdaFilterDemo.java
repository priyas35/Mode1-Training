package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class LambdaFilterDemo {
	public static void main(String[] args) {
		List<Product> list=new ArrayList<Product>();
		list.add(new Product(1, "hp laptop", 25000));
		list.add(new Product(2, "keyboard", 1000));
		list.add(new Product(3, "dell mouse", 200));
		list.add(new Product(4, "redmi", 20000));
		list.add(new Product(5, "one plus", 10000));
		list.add(new Product(6, "samsung", 200000));
		
		list.stream().filter(p -> p.price >= 20000).forEach(x -> {
			System.out.println(x);
		});
		System.out.println("names starts with s");
		
		list.stream().filter(p -> p.name.startsWith("s")).forEach(x ->{
			System.out.println(x);
		});
		
	    Product maxP=list.stream().max((p1,p2) -> p1.price >= p2.price?1:-1).get();
	    System.out.println("maximum price record");
	    System.out.println(maxP);
	    
	    Product minP=list.stream().min((p1,p2) -> p1.price >= p2.price?1:-1).get();
	    System.out.println("minimum price record");
	    System.out.println(minP);
	    
	    
	}

}

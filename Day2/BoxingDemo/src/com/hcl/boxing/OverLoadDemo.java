package com.hcl.boxing;

public class OverLoadDemo {
	public void show(int x){
		System.out.println("Show method w.r.t Int " +x);
	}
	
	public void show(String x){
		System.out.println("Show method w.r.t String " +x);
	}
	
	public void show(boolean x){
		System.out.println("Show method w.r.t Boolean " +x);
	}
	
	public void show(double x){
		System.out.println("Show method w.r.t Double " +x);
	}
	
	public static void main(String[] args) {
		OverLoadDemo ob=new OverLoadDemo();
		ob.show(12);
		ob.show(true);
		ob.show(12.5);
		ob.show("Hcl");
	}
	
	
	
	

}

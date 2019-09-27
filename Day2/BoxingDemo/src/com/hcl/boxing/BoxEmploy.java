package com.hcl.boxing;

public class BoxEmploy {
	
	public void show(Object ob){
		Employ e=(Employ)ob;
		System.out.println(e);
	}

	public static void main(String[] args) {
		Employ obj=new Employ();
		obj.empno=1;
		obj.name="nagindra";
		obj.basic=8666;
		
		new BoxEmploy().show(obj);
	}
}

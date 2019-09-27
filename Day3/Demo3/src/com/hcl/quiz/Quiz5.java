package com.hcl.quiz;

class Employ{
	String name;
	public Employ(String name){
		this.name=name;
	}
	@Override
	public String toString() {
		return "Employ [name=" + name + "]";
	}


}

class HrEmploy extends Employ{

	public HrEmploy(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
}
class JavaEmploy extends Employ{

	public JavaEmploy(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
}

public class Quiz5 {
	public static void main(String[] args) {
		Employ[] arrEmploy =new Employ[]{
				new HrEmploy("sagar"),
				new JavaEmploy("nivethitha"),
				new HrEmploy("lakshmi"),
				new JavaEmploy("gupta"),
				new HrEmploy("pramod"),
				new JavaEmploy("sakshi"),
				new HrEmploy("aakash"),
				new JavaEmploy("shafiq"),
				new JavaEmploy("sajid"),
				new JavaEmploy("praveen"),
				new HrEmploy("vahid"),
		};
		for (Employ employ : arrEmploy) {
			if(employ instanceof JavaEmploy){
				System.out.println(employ);
			}
		}
	}

	

}

package com.priya.fi;

public class EmployeeMain {
	
public static void main(String[] args) {
	EmployeeInteface ei=Employee::new;
	Employee e=ei.emp(2000);
	EmployeeInteface2 ei1=Employee::new;
	Employee e2=ei1.emp("Priya");
	System.out.println(e.getEmpNo());
	System.out.println(e2.getEmpName());
}

}

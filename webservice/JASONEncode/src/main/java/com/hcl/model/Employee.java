package com.hcl.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.hcl.jason.JavaApplication;

public class Employee {
	private long empNo;
	private String empName;
	private long salary;
	private String dateOfJoin;
	private String band;
	public long getEmpNo() {
		return empNo;
	}
	public void setEmpNo(long empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getDateOfJoin() {
		return dateOfJoin;
	}
	public void setDateOfJoin(String dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}
	public String getBand() {
		return band;
	}
	public void setBand(String band) {
		this.band = band;
	}
	
	
	
	
	 @Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", salary=" + salary + ", dateOfJoin=" + dateOfJoin
				+ ", band=" + band + "]";
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(long empNo, String empName, long salary, String dateOfJoin, String band) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.salary = salary;
		this.dateOfJoin = dateOfJoin;
		this.band = band;
	}
	

		 
		 
		 
	 
}

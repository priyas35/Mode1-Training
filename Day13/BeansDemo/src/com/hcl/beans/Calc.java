package com.hcl.beans;

public class Calc {
	 private int firstNo;
	 private int secondNo;
	public int getFirstNo() {
		return firstNo;
	}
	public void setFirstNo(int firstNo) {
		this.firstNo = firstNo;
	}
	public int getsecondNo() {
		return secondNo;
	}
	public void setsecondNo(int lastNo) {
		this.secondNo = lastNo;
	}
	 public int sum(){
		 return getFirstNo()+getsecondNo();
	 }
}

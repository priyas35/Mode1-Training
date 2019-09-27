package com.hcl.project;

import java.io.Serializable;

public class Customer implements Serializable
{
	private int custId;
	private String custName;
	private double annualpremium;
	private double modalpremium;
	private int paymentMode;
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public double getAnnualpremium() {
		return annualpremium;
	}
	public void setAnnualpremium(double annualpremium) {
		this.annualpremium = annualpremium;
	}
	public double getModalpremium() {
		return modalpremium;
	}
	public void setModalpremium(double modalpremium) {
		this.modalpremium = modalpremium;
	}
	public int getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(int paymentMode) {
		this.paymentMode = paymentMode;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", annualpremium=" + annualpremium
				+ ", modalpremium=" + modalpremium + ", paymentMode=" + paymentMode + "]";
	}
	
	

}

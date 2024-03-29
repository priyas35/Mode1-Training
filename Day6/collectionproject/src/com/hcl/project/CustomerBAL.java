package com.hcl.project;

import java.util.List;

public class CustomerBAL {
	static StringBuilder sb=new StringBuilder();
	
	public void writeCustomerFileBal() {
		new CustomerDAO().writeCustomerFileDao();
	}
	
	public void readCustomerFileBal() {
		new CustomerDAO().readCustomerFileDao();
	}
	public boolean addCustomerBal(Customer objcustomer) throws CustomerException{
		boolean isAdded=true;
		if(objcustomer.getCustId() <= 0){
			sb.append("customer no cannot be negative or zero");
			isAdded=false;
		}
		if(objcustomer.getCustName().length() <= 5){
			sb.append("name more than three characters");
			isAdded=false;
		}
		if(objcustomer.getAnnualpremium() <=20000 && objcustomer.getAnnualpremium() >=1000000){
			sb.append("annual premium should be 20000 to 1000000");
			isAdded=false;
		}
		if(objcustomer.getModalpremium()<=1000 && objcustomer.getModalpremium() >= 50000 ){
			sb.append("modal premium from 1000 to 50000");
			isAdded=false;
		}
		if(objcustomer.getPaymentMode()<= 0 ){
			sb.append("payment mode should be nonzero");
			isAdded = false;
		}
		if(objcustomer.getPaymentMode() >= 4){
			sb.append("payment mode should be 1 or 2 or 3");
			isAdded = false;
		}
		if(isAdded == false){
			throw new CustomerException(sb.toString());
		}else{
			new CustomerDAO().addCustomerDao(objcustomer);
		}
		return isAdded;
	}
	public Customer searchCustomerBal(int custId){
		return new CustomerDAO().searchCustomerDao(custId);
		
	}
    public List<Customer> showCustomerBal(){
    	return new CustomerDAO().showCustomerDao();
    }
    
    public String updateCustomerBal(Customer objcustomer){
    	return new CustomerDAO().updateCustomerDao(objcustomer);
    	
    }
    
    public String deleteCustomerBal(int custId){
    	return new CustomerDAO().deleteCustomerNameDao(custId);
    }
    
  
    
}

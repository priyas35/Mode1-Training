package com.hcl.project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {
	static List<Customer> lstcustomer=null;
	static{
		lstcustomer =new ArrayList<Customer>();
		
	}
	public String addCustomerDao(Customer customer){
		lstcustomer.add(customer);
		return "customer created successfully";
	}
	public Customer searchCustomerDao(int custId){
	       Customer objcustomer=null;
	       for (Customer customer : lstcustomer) {
			if(customer.getCustId() == custId){
				objcustomer =customer;
			}
		}

			return objcustomer;
		}
	public List<Customer> showCustomerDao(){
		return lstcustomer;
	}
	public String updateCustomerDao(Customer objcustomer) {
		Customer customer=searchCustomerDao(objcustomer.getCustId());
		if(customer!=null){
			for (Customer c : lstcustomer) {
				if(c.getCustId() == objcustomer.getCustId()){
					c.setCustName(objcustomer.getCustName());
					c.setAnnualpremium(objcustomer.getAnnualpremium());
					c.setModalpremium(objcustomer.getModalpremium());
					c.setPaymentMode(objcustomer.getPaymentMode());
				}
			}
			return "record updated";
			
		}else{
			return "customer not found";
		}
	}
    public String deleteCustomerNameDao(int custId){
   	 Customer customer=searchCustomerDao(custId);
   	 if(customer != null){
   		 lstcustomer.remove(customer);
   		 return "customer removed";
   	 }else{
   		 return "customer not found";
   	 }
    }
    
    public void writeCustomerFileDao() {
		try {
			FileOutputStream fout=new FileOutputStream("c:/file/customer.txt");
			ObjectOutputStream objout=new ObjectOutputStream(fout);
			objout.writeObject(lstcustomer);
			objout.close();
			fout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void readCustomerFileDao() {
		try {
			FileInputStream fin=new FileInputStream("c:/file/customer.txt");
			ObjectInputStream objin=new ObjectInputStream(fin);
			lstcustomer =(List<Customer>)objin.readObject();
			objin.close();
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
    }



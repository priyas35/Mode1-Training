package com.hcl.project;

import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;

public class CustomerMain {
	static ResourceBundle rb=ResourceBundle.getBundle("project1");

	public static void deleteCustomer() {
		int custId;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter CustomerNo  ");
		custId=sc.nextInt();
		CustomerBAL obj=new CustomerBAL();
		String res=obj.deleteStudentBal(custId);
		System.out.println(res);
	}
	public static void updateCustomer() {
		Customer objcustomer=new Customer();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter CustomerNo  ");
		objcustomer.setCustId(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter Customer Name  ");
		objcustomer.setCustName(sc.nextLine());
		System.out.println("Enter Customer Annualpremium  ");
		objcustomer.setAnnualpremium(sc.nextDouble());
		System.out.println("Enter Customer modalpremium  ");
		objcustomer.setModalpremium(sc.nextDouble());
		CustomerBAL obj=new CustomerBAL();
		String res=obj.updateCustomerBal(objcustomer);
		System.out.println(res);
	}
	public static void showCustomer() {
		CustomerBAL obj=new CustomerBAL();
		List<Customer> lstcustomer=obj.showCustomerBal();
		for (Customer customer : lstcustomer) {
			System.out.println(customer);
		}
	}
	public static void searchCustomer() {
		int custId;
		System.out.println("Enter Customer No  ");
		Scanner sc=new Scanner(System.in);
		custId=sc.nextInt();
		CustomerBAL obj=new CustomerBAL(); 
		Customer objcustomer=obj.searchCustomerBal(custId);
		if(objcustomer!=null) {
			System.out.println(objcustomer);
		} else {
			System.out.println("Record not found...");
		}
		
	}
	public static void addCustomer() {
		
		Customer objcustomer=new Customer();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter CustomerNo  ");
		objcustomer.setCustId(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter Customer Name  ");
		objcustomer.setCustName(sc.nextLine());
		System.out.println("Enter Customer Annualpremium  ");
		objcustomer.setAnnualpremium(Double.parseDouble(sc.nextLine())
				);
		System.out.println("Enter Customer modalpremium ");
		objcustomer.setModalpremium(Double.parseDouble(sc.nextLine()));
		System.out.println("Enter Customer paymentmethod ");
		objcustomer.setPaymentMode(Integer.parseInt(sc.nextLine()));
		CustomerBAL obj=new CustomerBAL();
		try {
			boolean res=obj.addCustomerBal(objcustomer);
			if(res==true) {
				System.out.println(rb.getString("added"));
			}
		} 
		 catch (CustomerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void writeCustomerFile() {
		new CustomerBAL().writeCustomerFileBal();
	}
	
	public static void readCustomerFile() {
		new CustomerBAL().readCustomerFileBal();
	}
	public static void main(String[] args) {
		int ch;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Options");
			System.out.println("---------");
			System.out.println("1. Add Customer");
			System.out.println("2. Show Customer");
			System.out.println("3. Search Customer");
			System.out.println("4. Update Customer");
			System.out.println("5. Delete Customer");
			System.out.println("6. write customer file");
			System.out.println("7. read"
					+ " customer file");
			System.out.println("8.return");
			System.out.println("Enter Ur Choice  ");
			ch=sc.nextInt();
			switch(ch) {
			case 1 : 
				addCustomer();
				break;
			case 2 :
				showCustomer();
				break;
			case 3 :
				searchCustomer();
				break;
			case 4 : 
				updateCustomer();
				break;
			case 5 : 
				deleteCustomer();
				break;
			case 6 : 
				writeCustomerFile();
				break;
			case 7:
				readCustomerFile();
				break;
			case 8:
				return;
			default : 
				System.out.println("Invalid Choice");
			}
		} while(ch!=8);
	}

}

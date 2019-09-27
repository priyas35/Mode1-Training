package com.hcl.bank;

import java.util.Scanner;

public class CreateAccountMain {
	public static void main(String[] args) {
		int accountNo=AccountBAL.generateAccountBal();
		//System.out.println(accountno);
		Accounts objAccounts=new Accounts();
		objAccounts.setAccountNo(accountNo);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first name");
		objAccounts.setFirstName(sc.nextLine());
		System.out.println("enter last name");
		objAccounts.setLastName(sc.nextLine());
		System.out.println("enter city");
		objAccounts.setCity(sc.nextLine());
		System.out.println("enter state");
		objAccounts.setState(sc.nextLine());
		System.out.println("enter amount");
		objAccounts.setAmount(Integer.parseInt(sc.nextLine()));
		System.out.println("enter cheqfacil");
		objAccounts.setCheqFacil(sc.nextLine());
		System.out.println("enter account type");
		objAccounts.setAccountType(sc.nextLine());
		System.out.println(AccountBAL.createAccountBal(objAccounts));
		
	}

}

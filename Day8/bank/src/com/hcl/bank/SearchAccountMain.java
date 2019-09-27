package com.hcl.bank;

import java.util.Scanner;

public class SearchAccountMain {
	public static void main(String[] args) {
		int accountNo;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter account no ");
		accountNo = sc.nextInt();
		Accounts objAccounts=AccountBAL.searchAccountBal(accountNo);
		if(objAccounts != null){
			System.out.println("first name " + objAccounts.getFirstName());
			System.out.println("last name " + objAccounts.getLastName());
			System.out.println("city " + objAccounts.getCity());
			System.out.println("state " + objAccounts.getState());
			System.out.println("amount " + objAccounts.getAmount());
			System.out.println("cheq facil " + objAccounts.getCheqFacil());
			System.out.println("account type " + objAccounts.getAccountType());
			
		}else
		{
			System.out.println("!!! account not found !!!"
					+ "");
		}
	}

}

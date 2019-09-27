package com.hcl.bank;

import java.util.Scanner;

public class UpdateAccountMain {
	public static void main(String[] args) {
		int accountNo;
		String city,state;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter account no");
		accountNo=Integer.parseInt(sc.nextLine());
		System.out.println("enter city ");
		city=sc.nextLine();
		System.out.println("enter state");
		state=sc.nextLine();
		System.out.println(AccountBAL.updateAccountbal(accountNo, city, state));
	}

}

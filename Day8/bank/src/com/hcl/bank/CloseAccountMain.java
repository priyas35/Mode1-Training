package com.hcl.bank;

import java.util.Scanner;

public class CloseAccountMain {
	public static void main(String[] args) {
		int accountNo;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter account no");
		accountNo=sc.nextInt();
		System.out.println(AccountBAL.closeAccountBal(accountNo));
	}

}

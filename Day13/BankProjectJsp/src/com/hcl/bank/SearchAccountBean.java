package com.hcl.bank;

public class SearchAccountBean {

	private int accountNo;

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	
	public Accounts searchAccount() {
		return AccountBAL.searchAccountBal(getAccountNo());
	}
}

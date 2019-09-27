package com.hcl.bank;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

public class AccountsTestCase {
	
	@Test
	public void testWithdrawAccount(){
		
		assertEquals("amount debited", AccountBAL.withdrawAccountBal(2,300));
		assertEquals("insufficient funds", AccountBAL.withdrawAccountBal(3, 3000000));
		assertEquals("account no not found", AccountBAL.withdrawAccountBal(-3, 3000000));
		assertEquals("account closed", AccountBAL.withdrawAccountBal(1, 300));
	}
	

	@Test
	public void testDepositAccount(){
		
		assertEquals("amount Credited !!!!!!!!", AccountBAL.depositAccountBal(2, 154854));
		assertEquals("account not found !!!!!!!!", AccountBAL.depositAccountBal(-3, 154854));
		assertEquals("account inactive !!!!!!!!", AccountBAL.depositAccountBal(1, 154854));
		
		
	}
	
	@Test
	public void testCloseAccount(){
		assertEquals("account closed !!!!!!!!", AccountBAL.closeAccountBal(4));
		assertEquals("account no not found !!!!!!!!", AccountBAL.closeAccountBal(-4));
	}
	
	
	@Test
	public void testUpdateAccount(){
		assertEquals("account updated", AccountBAL.updateAccountbal(2, "chennai", "tamilnadu"));
		assertEquals("account not found", AccountBAL.updateAccountbal(-2, "chennai", "tamilnadu"));
		assertEquals("account closed already", AccountBAL.updateAccountbal(1, "chennai", "tamilnadu"));
		
	}
	
	
	@Test
	public void testSearchAccount(){
		assertNotNull(AccountBAL.searchAccountBal(1));
		assertNull(AccountBAL.searchAccountBal(-1));
		
	}
	
	
	@Test
	public void testCreateAccount(){
		Accounts objAccounts=new Accounts();
		int accno=AccountBAL.generateAccountBal();
		objAccounts.setAccountNo(accno);
		objAccounts.setFirstName("Bindu");
		objAccounts.setLastName("sree");
		objAccounts.setCity("bangalore");
		objAccounts.setState("karnataka");
		objAccounts.setAmount(99222);
		objAccounts.setCheqFacil("yes");
		objAccounts.setAccountType("savings");
		assertEquals("** account created successfully **", AccountBAL.createAccountBal(objAccounts));
	}
	
	
	@Test
	public void testDaoConnection(){
		assertNotNull(DaoConnection.getConnection());
	}
	
	@Test
	public void testGenerateAccountNo(){
		int accno=0;
		Connection con=DaoConnection.getConnection();
		String cmd="select max(accountno)+1 accno from accounts";
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			ResultSet rs=pst.executeQuery();
			rs.next();
			accno=rs.getInt("accno");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(accno, AccountBAL.generateAccountBal());
	}
	
	

	@Test
	public void test() {
		Accounts objaccounts=new Accounts();
		objaccounts.setAccountNo(1);
		objaccounts.setFirstName("sai");
		objaccounts.setLastName("krishna");
		objaccounts.setCity("bangalore");
		objaccounts.setState("karnataka");
		objaccounts.setAmount(76786);
		objaccounts.setCheqFacil("yes");
		objaccounts.setAccountType("savings");
		objaccounts.setStatus("active");
		
		assertEquals(1, objaccounts.getAccountNo());
		assertEquals("sai", objaccounts.getFirstName());
		assertEquals("krishna", objaccounts.getLastName());
		assertEquals("bangalore", objaccounts.getCity());
		assertEquals("karnataka", objaccounts.getState());
		assertEquals(76786,objaccounts.getAmount());
		assertEquals("yes", objaccounts.getCheqFacil());
		assertEquals("savings", objaccounts.getAccountType());
		assertEquals("active", objaccounts.getStatus());
	}

}

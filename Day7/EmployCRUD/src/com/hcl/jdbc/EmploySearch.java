package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmploySearch {
	public static void main(String[] args) {
		int empno;
		System.out.println("enter employ no");
		Scanner sc=new Scanner(System.in);
		empno=sc.nextInt();
		Connection con=DaoConnection.getConnection();
		String cmd="select * from employ where empno=?";
		
		try {
			
		    PreparedStatement pst=con.prepareStatement(cmd);
		    pst.setInt(1, empno);
		    ResultSet rs=pst.executeQuery();
		    if(rs.next()){
		    	System.out.println("employ name "+rs.getString("name"));
		    	System.out.println("department"+rs.getString("dept"));
		    	System.out.println("designation "+rs.getString("desig"));
		    	System.out.println("salary "+rs.getInt("basic"));
		    }else{
		    	System.out.println(" *** Record not found ***");
		    }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}

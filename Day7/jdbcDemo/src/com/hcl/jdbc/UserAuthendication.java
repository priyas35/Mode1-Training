package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserAuthendication {
	public static void main(String[] args) {
		String user,pwd;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter username and password");
		user=sc.nextLine();
		pwd=sc.nextLine();
		String cmd="select * from  users where username=? and password=?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlpractice","root","root");
			PreparedStatement pst=con.prepareStatement(cmd);
		    pst.setString(1, user);
		    pst.setString(2, pwd);
		    ResultSet rs=pst.executeQuery();
		    if(rs.next()){
		    	System.out.println("correct credentials...");
		    	
		    }else{
		    	System.out.println("Invalid credentials");
		    }
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeptInsert {
	public static void main(String[] args) {
		int deptno;
		String dname,loc,head;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter department no");
		deptno=Integer.parseInt(sc.nextLine());
		System.out.println("name of the department");
		dname=sc.nextLine();
		System.out.println("location ");
		loc=sc.nextLine();
		System.out.println("head ");
		head=sc.nextLine();
		
		
		
		String cmd="insert into department values(?,?,?,?)";
		Connection con=DaoConnection.getConnection();
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			pst.setInt(1, deptno);
			pst.setString(2, dname);
			pst.setString(3, loc);
			pst.setString(4, head);
			pst.executeUpdate();
			System.out.println("*** record inserted ***");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}

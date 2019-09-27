package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DepartmentUpdate {
	public static void main(String[] args) {
		int deptno;
		String dname,loc,head;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter department no");
		deptno=Integer.parseInt(sc.nextLine());
		System.out.println("enter department name ");
		dname=sc.nextLine();
		System.out.println("enter department location ");
		loc=sc.nextLine();
		System.out.println("head ");
		head=sc.nextLine();
		
		String cmd="update department set dname=?, loc=?, head=? where deptno=?";
        Connection con=DaoConnection.getConnection();
        try {
			PreparedStatement pst=con.prepareStatement(cmd);
			pst.setString(1, dname);
			pst.setString(2, loc);
			pst.setInt(3, deptno);
			pst.setString(4, head);
			pst.executeUpdate();
			System.out.println("*** record updated ***");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

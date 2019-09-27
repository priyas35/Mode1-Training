package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeptShow {
public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=
					DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlpractice","root","root");
			System.out.println("connected");
			Statement st=con.createStatement();
			ResultSet rs1=st.executeQuery("select * from dept");
			while(rs1.next()){
				System.out.println("department no "+rs1.getInt("deptno"));
				System.out.println("department name "+rs1.getString("dname"));
				System.out.println("location "+rs1.getString("loc"));
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

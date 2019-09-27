package com.hcl.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DepartmentSearch {
	private int deptno;

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
	public ResultSet departmentSearch(){
		Connection con=DaoConnection.getConnection();
		String cmd="select * from department where deptno=?";
		ResultSet rs=null;
		
		
		try {
			
		    PreparedStatement pst=con.prepareStatement(cmd);
		    pst.setInt(1, deptno);
		     rs=pst.executeQuery();
		    
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		
	return rs;
	}
	
	
	

}

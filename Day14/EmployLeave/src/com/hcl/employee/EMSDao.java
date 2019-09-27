package com.hcl.employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class EMSDao {

	PreparedStatement pst;
	 Connection con;
	
	
	public EmployeeDetails SearchEmp(int empno){
		con=DaoConnection.getConnection();
		EmployeeDetails obj=new EmployeeDetails();
		String cmd="select * from employee where empId=?";
		try {
			pst=con.prepareStatement(cmd);
			
			pst.setInt(1,empno);
			ResultSet rs = pst.executeQuery();
			if(rs.next()){
			obj.setEmpId(rs.getInt("empid"));
			obj.setEmpName(rs.getString("empName"));
			obj.setEmpEmail(rs.getString("empemail"));
			obj.setEmpMobNo(rs.getString("EMPMOBNO"));
			obj.setEmpDeptName(rs.getString("EMPDPTNAME"));
			obj.setEmpMgrId(rs.getInt("EMPMGRID"));
			obj.setD(rs.getDate("EMPDATEJOINED"));
			obj.setEmpLeaveBal(rs.getInt("EMPleavebalance"));}
			else{
				System.out.println("Empty");
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
			
		}
		return obj;
	}
	
	
	
	
	
	
	
	public String applyLeave(LeaveHistory leave){
		String result="";
		int count = 1;
			try {
				Date stDate1 = leave.getSd();
				Date endDate1=leave.getEd();
				System.out.println(stDate1);
				System.out.println(endDate1);
				Calendar c= Calendar.getInstance();
				if(stDate1.compareTo(endDate1)>0){
					result = "Start date can not be greatert than end Date";
				}
				else {
					
				
				while(stDate1.compareTo(endDate1)!= 0){
					c.setTime(stDate1);
					c.get(Calendar.DAY_OF_WEEK);
					c.add(Calendar.DATE, 1);
				if(c.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY && c.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {	
					count++;
				}
				stDate1 = c.getTime();
				}
				Connection con=DaoConnection.getConnection();
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
				
				String stDate=sdf.format(leave.getSd());
				String endDate=sdf.format(leave.getEd());
				Date dt=new Date();
				String appliedOn=sdf.format(dt);
				if(appliedOn.compareTo(stDate)<=0){
				LeaveType lt=LeaveType.EL;
				EmployeeDetails employ=SearchEmp(leave.getEmpId());
				LeaveStatus ls;
				if(employ.getEmpMgrId()==0) {
					ls=LeaveStatus.APPROVED;
				} else {
					ls=LeaveStatus.PENDING;
				}

				String cmd="Insert into LEAVEHISTORY(LEASTARTDATE, LEAENDDATE,LEANOOFDAYS,LEAREASON,"
					+ "LEATYPE,LEAAPPLIEDON,EMPID,LEASTATUS) VALUES(?,?,?,?,?,?,?,?)";

				System.out.println("Ins " +stDate);
				System.out.println("Ins " +endDate);

				PreparedStatement pst=con.prepareStatement(cmd);
				pst.setString(1, stDate);
				pst.setString(2, endDate);
				pst.setInt(3, count);
				pst.setString(4, leave.getReason());
				pst.setString(5, lt.toString()); 
				pst.setString(6,appliedOn);
				pst.setInt(7, leave.getEmpId());
				pst.setString(8, ls.toString());
				pst.executeUpdate();
				result="Leave Applied Successfully...";
				}
				else {result = "Leave can not be applied for the past Days";}
				}
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
		
				}
		
		return result;
	}
	
	
	
	
	
	
	
	public List<LeaveHistory> leaveHistory(int id){
		con=DaoConnection.getConnection();
		List<LeaveHistory> lh=new ArrayList<LeaveHistory>();
		String cmd="select * from leavehistory where EMPID=?";
		LeaveHistory h = null;
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			pst.setInt(1,id);
			ResultSet rs=pst.executeQuery();
			while(rs.next()){
			h=new LeaveHistory();
			h.setLeaId(rs.getInt("LEAID"));
			h.setSd(rs.getDate("LEASTARTDATE"));
			h.setEd(rs.getDate("LEAENDDATE"));
			h.setNoofDays(rs.getInt("LEANOOFDAYS"));
			h.setReason(rs.getString("LEAREASON"));
			h.setLeaveType(LeaveType.valueOf(rs.getString("LEATYPE")));
			h.setApplyDate(rs.getDate("LEAAPPLIEDON"));
			h.setMgrComments(rs.getString("LEAMGRCOMMENTS"));
			h.setEmpId(rs.getInt("EMPID"));
			h.setLeaveStatus(LeaveStatus.valueOf(rs.getString("LEASTATUS")));
			lh.add(h);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return lh;
	}
	
	
	public List<EmployeeDetails> SearchMgr(int empno){
		con=DaoConnection.getConnection();
		EmployeeDetails obj=new EmployeeDetails();
		String cmd="select * from employee where empmgrid=?";
		List<EmployeeDetails> lst = new ArrayList<EmployeeDetails>();
		EmployeeDetails obj1 = null;
		try {
			pst=con.prepareStatement(cmd);
			obj1 = new EmployeeDetails();
			pst.setInt(1,empno);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
			obj1=new EmployeeDetails();
			obj1.setEmpId(rs.getInt("empid"));
			obj1.setEmpName(rs.getString("empName"));
			obj1.setEmpEmail(rs.getString("empemail"));
			obj1.setEmpMobNo(rs.getString("EMPMOBNO"));
			obj1.setEmpDeptName(rs.getString("EMPDPTNAME"));
			obj1.setEmpMgrId(rs.getInt("EMPMGRID"));
			obj1.setD(rs.getDate("EMPDATEJOINED"));
			obj1.setEmpLeaveBal(rs.getInt("EMPleavebalance"));
			lst.add(obj1);
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lst;
	}
	
	public LeaveHistory ApplyDeny(int leaveid){
		con=DaoConnection.getConnection();
		String cmd="select * from leavehistory where leaID=?";
		LeaveHistory h = null;
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			pst.setInt(1,leaveid);
			ResultSet rs=pst.executeQuery();
			while(rs.next()){
			h=new LeaveHistory();
			h.setLeaId(rs.getInt("LEAID"));
			h.setSd(rs.getDate("LEASTARTDATE"));
			h.setEd(rs.getDate("LEAENDDATE"));
			h.setNoofDays(rs.getInt("LEANOOFDAYS"));
			h.setReason(rs.getString("LEAREASON"));
			h.setLeaveType(LeaveType.valueOf(rs.getString("LEATYPE")));
			h.setApplyDate(rs.getDate("LEAAPPLIEDON"));
			h.setMgrComments(rs.getString("LEAMGRCOMMENTS"));
			h.setEmpId(rs.getInt("EMPID"));
			h.setLeaveStatus(LeaveStatus.valueOf(rs.getString("LEASTATUS")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return h;
	}
	
}

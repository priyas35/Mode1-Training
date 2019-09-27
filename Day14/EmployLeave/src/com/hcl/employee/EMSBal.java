package com.hcl.employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class EMSBal {
	public static EmployeeDetails searchBal(int empno){
		return new EMSDao().SearchEmp(empno);
				
	}
	public static String applyLeaveBal(LeaveHistory leave) {
		return new EMSDao().applyLeave(leave);
	}
	public static List<LeaveHistory> leaveHistoryBal(int id) {
		return new EMSDao().leaveHistory(id);
	}
	public static List<EmployeeDetails> searchmgrBal(int empno) {
		return new EMSDao().SearchMgr(empno);
	}
	public static LeaveHistory approveDenyBal(int leaveid){
		return new EMSDao().ApplyDeny(leaveid);
	}
}
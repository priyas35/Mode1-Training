<%@page import="com.hcl.employee.LeaveHistory"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.List"%>
<%@page import="com.hcl.employee.EMSBal"%>
<%@page import="com.hcl.employee.EmployeeDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	int empId=Integer.parseInt((String)session.getAttribute("user"));
	List<EmployeeDetails> lst = EMSBal.searchmgrBal(empId);
	for(EmployeeDetails lst1 : lst){
%>
<form action = "ApproveDeny.jsp"><table border = "2">
	<tr>
			<th>Employee ID</th>
			<td><%=lst1.getEmpId() %></td>
			<th>Employee Name</th>
			<td><%=lst1.getEmpName() %></td>
			<th>Employee Leave Balance</th>
			<td><%=lst1.getEmpLeaveBal() %></td>
		</tr>
</table>
<%
		List<LeaveHistory> lh = EMSBal.leaveHistoryBal(lst1.getEmpId());
		for(LeaveHistory lh1 : lh) {  
%>
	<table border = "2">
		<tr>
			<th></th>
			<th>Leave ID</th>
			<th>No OF Days</th>
			<th>Start Date</th>
			<th>End Date</th>
			<th>Leave Type</th>
			<th>Leave Status</th>
			<th>Leave Reason</th>
			<th>Apply Status</th>
		</tr>
		<tr>
			<td></td>
			<td><%=lh1.getLeaId() %></td>
			<td><%=lh1.getNoofDays() %></td>
			<td><%=lh1.getSd() %></td>
			<td><%=lh1.getEd() %></td>
			<td><%=lh1.getLeaveType() %></td>
			<td><%=lh1.getLeaveStatus() %></td>
			<td><%=lh1.getReason() %></td>
			<td><input type = "checkbox" name = "applystatus" value = <%=lh1.getLeaId() %> /></td>
		</tr>
	</table>
<%}}%>
<br/><br/>
<input type="submit" value="Approve/Deny"/></form>
</body>
</html>
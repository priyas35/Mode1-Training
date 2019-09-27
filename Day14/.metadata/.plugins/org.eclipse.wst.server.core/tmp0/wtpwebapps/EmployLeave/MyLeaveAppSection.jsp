<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.hcl.employee.LeaveHistory"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.hcl.employee.EMSDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ApplyLeave.jsp" method="get">

<h1>My Leave Applications Section</h1>
<table border = "1">
<tr>
	<th>Leave ID : <% %></th>
	<th>Number Of Days</th>
	<th>Start Date</th>
	<th>End Date</th>
	<th>Leave Type</th>
	<th>Status</th>
	<th>Reason</th>
	<th>Applied On</th>
	<th>Manager Comments</th>
	</tr>
<%
int empId=Integer.parseInt((String)session.getAttribute("user"));
List<LeaveHistory> leavehistory = new EMSDao().leaveHistory(empId);
for(LeaveHistory l : leavehistory) {
%>
<tr>
	<td>
	<%=l.getLeaId() %>
	</td>
	<td>
		<%=l.getNoofDays() %>
	</td>
	<td>
		<%=l.getSd() %>
	</td>
	<td>
		<%=l.getEd() %>
	</td>
	<td>
		<%=l.getLeaveType() %>
	</td>
	<td>
		<%=l.getLeaveStatus() %>
	</td>
	<td>
		<%=l.getReason() %>
	</td>
	<td>
		<%=l.getApplyDate() %>
	</td>
	<td>
		<%=l.getMgrComments() %>
	</td>
</tr>
<%
}
%>
</table>

<input type="submit" value = "apply"/>
</form>
</body>
</html>
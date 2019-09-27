<%@page import="com.hcl.employee.EMSDao"%>
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
<form action="ApplyLeaveStatus.jsp" method="get">
<center>
<h1>Apply Leave</h1><br/><br/><br/>
</center>
<%
	int empId=Integer.parseInt((String)session.getAttribute("user"));
%>
<%-- <%  String str = new EMSDao().applyLeave(empId);
	out.print(str);
%> --%>

<table border = "0" >
<tr>
	<td>Emp ID : </td>
	<td border:1px><input type="text" name="empId" value="<%=empId%>" readonly="readonly"/></td>
</tr>
<tr>
	<td>Start Date : </td>
	<td border:1px><input type="Date" name="sd"/></td>
</tr>
<tr>
	<td>End Date :  </td>
	<td><input type="Date" name="ed"/></td>
</tr>
<tr>
	<td>Number of Days : </td>
	<td><input type ="text"  readonly= "readonly" name = "noofDays"/></td>
</tr>
<tr>
	<td>Leave Type : </td>
	<td><select name="leaveType">
  	<option value="EL">EL</option>
	</select></td>
</tr>
<tr>
    <td>Leave Reason : </td>
    <td><input type="text" name="reason"/></td>
</tr>
<tr>
     <td><input type="submit" value="Apply"/></td>
   
</tr>
</table>
</form>
</body>
</html>
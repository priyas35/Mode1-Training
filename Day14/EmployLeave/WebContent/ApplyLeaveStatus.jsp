<%@page import="java.util.concurrent.TimeUnit"%>
<%@page import="com.hcl.employee.EMSBal"%>
<%@page import="com.hcl.employee.EMSDao"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.hcl.employee.LeaveHistory"%>
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
	LeaveHistory leave=new LeaveHistory();
leave.setEmpId(Integer.parseInt(request.getParameter("empId")));
SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
Date stDate=sdf.parse(request.getParameter("sd"));
leave.setSd(stDate);
Date endDate=sdf.parse(request.getParameter("ed"));
leave.setEd(endDate);
leave.setReason(request.getParameter("reason"));
String res = EMSBal.applyLeaveBal(leave);
out.println(res);


//long diff = leave.getEd().getTime() - leave.getSd().getTime();
//String days="";
//days=days+TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
//int Days = Integer.parseInt(days);
//if (Days<0) {
///	out.println("Start Date Should be less than end Date");
//}else{
//		String res = EMSBal.applyLeaveBal(leave);
//		out.println(res);
//		}

%>
</body>
</html>
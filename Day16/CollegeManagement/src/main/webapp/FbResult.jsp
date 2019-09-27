<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.hcl.college.CollegeCRUD"%>
<%@page import="java.util.List"%>
<%@page import="com.hcl.college.FbResult"%>
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
	String instructor="hari";
	String subject="PC3";
	List<FbResult> lst=new CollegeCRUD().feedbackList(instructor, subject);
	for(FbResult fr : lst) {
		out.println(fr.getFbValue());
		out.println(fr.getCount());
	}
%>
</body>
</html>
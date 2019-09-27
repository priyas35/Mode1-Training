<%@page import="com.hcl.college.CollegeCRUD"%>
<%@page import="com.hcl.college.FbResult"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="3">
<tr>
  <th>Feedback Name</th>
  <th>Count</th>
</tr>
       <%
      
	String instructor=(String)session.getAttribute("instructor");
	String subject=(String)session.getAttribute("subject");
	List<FbResult> lst=new CollegeCRUD().feedbackList(instructor, subject);
	for(FbResult fr : lst) {
	%>
	<tr>
	<td> <%=fr.getFbValue() %></td>
	<td><%=fr.getCount() %> </td>
	<%
	}
%>
</tr>
</table>
</form>
</body>
</html>
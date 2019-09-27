<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.hcl.department.DaoConnection"%>
<%@page import="java.sql.Connection"%>
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
       int deptno=Integer.parseInt(request.getParameter("deptno"));
       Connection con=DaoConnection.getConnection();
       String cmd="delete from department where deptno=?";
       PreparedStatement pst=con.prepareStatement(cmd);
       pst.setInt(1, deptno);
	 pst.executeUpdate();
       
       %>
       <jsp:forward page="deptshow.jsp"/>

</body>
</html>
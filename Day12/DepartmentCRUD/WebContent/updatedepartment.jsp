<%@page import="java.sql.ResultSet"%>
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
       String cmd="select * from department where empno=?";
       PreparedStatement pst=con.prepareStatement(cmd);
       pst.setInt(1, deptno);
		ResultSet rs=pst.executeQuery();
		rs.next();
       
       %>
      <form method="get" action="updatedepartment.jsp">
      <center>
      Department No:
      <input type="text" name="deptno" readonly="readonly" value=<%=rs.getInt("deptno")%> /><br/><br/>
      Department Name:
      <input type="text" value=<%=rs.getString("dname") %> name="dname" /><br/><br/>
      Location:
      <input type="text" value=<%=rs.getString("loc")%> name="loc" /><br/><br/>
      Head:
      <input type="text" value=<%=rs.getString("head")%> name="head" /><br/><br/>
      
      <input type="submit" value="Update" /><br/><br/>
      </center>
      </form>
      
      <%
      if(request.getParameter("deptno") != null ){
    	  cmd="Update Department set dname=?,loc=?,head=? where deptno=?";
    	  pst=con.prepareStatement(cmd);
			pst.setString(1, request.getParameter("dname"));
			pst.setString(2,request.getParameter("loc"));
			pst.setString(3, request.getParameter("head"));
			pst.setInt(4, deptno);
		pst.executeUpdate();
		%>
		<jsp:forward page="deptshow.jsp"/>
		<% 
      }
      %>

</body>
</html>
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
         Connection con=DaoConnection.getConnection();
 		String cmd="select max(deptno)+1 deptno from department";
 		PreparedStatement pst=con.prepareStatement(cmd);
 		ResultSet rs=pst.executeQuery();
 		rs.next();
 		int deptno=rs.getInt("deptno");
         
         %>


      <form method="get" action="departmentinsert.jsp">
      <center>
      Department No:
      <input type="text" value="<%=deptno%>" readonly="readonly" name="deptno" /><br/><br/>
      Department Name:
      <input type="text" name="dname" /><br/><br/>
      Location:
      <input type="text" name="loc" /><br/><br/>
      Head:
      <input type="text" name="head" /><br/><br/>
     
      <input type="submit" value="Insert" /><br/><br/>
      </center>
      </form>
      <%
      if(request.getParameter("deptno") != null ){
          
    		cmd="Insert into Department values(?,?,?,?)";
    		pst=con.prepareStatement(cmd);
    		pst.setInt(1, Integer.parseInt(request.getParameter("deptno")));
			pst.setString(2, request.getParameter("dname"));
			pst.setString(3,request.getParameter("loc"));
			pst.setString(4, request.getParameter("head"));
			pst.executeUpdate();
    	          
    	  	%>
    	  	<jsp:forward page="deptshow.jsp" />
    	  	<%
      }
    	  	%>

</body>
</html>
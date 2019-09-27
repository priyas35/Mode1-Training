<%@page import="com.hcl.student.model.Student"%>
<%@page import="com.hcl.student.dao.StudentDAOImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="springForm" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<springForm:form method="post" commandname="student" action="searchStudent.jsp">
      
      Student No:
      <springForm:input path="rollNum" /><br/><br/>
       <input type="submit" value="Show" />
     
       <%
       
      int rollNum=Integer.parseInt(request.getParameter("rollNum"));
      StudentDAOImpl si=new StudentDAOImpl();
      Student s=si.searchStudent(rollNum);
      if(s != null){
    	  out.println("Name " +s.getsName() +"<br/>");
    	  out.println("Age " +s.getAge()+"<br/>");
    	  out.println("Gender " + s.getGender()+"<br/>");
    	  out.println("Country " +s.getCountry() +"<br/>");
    	  out.println("DateOfJoin " +s.getDateOfJoin() +"<br/>");
    	  out.println("Final Score " +s.getFinalScore() +"<br/>");
      }else{
    	  out.println("Student not found");
      }
      %>
     
    </springForm:form>   
</body>
</html>
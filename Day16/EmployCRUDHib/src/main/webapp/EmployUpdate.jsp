<%@page import="com.hcl.hib.Employ"%>
<%@page import="com.hcl.hib.EmployCRUD"%>
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
int empno=Integer.parseInt(request.getParameter("empno"));
EmployCRUD crud=new EmployCRUD();
Employ e=crud.searchEmploy(empno);
%>
     <form method="get" action="EmployUpdate.jsp">
      <center>
      Employ No:
      <input type="text" name="empno" readonly="readonly" value=<%=e.getEmpno()%> /><br/><br/>
      Employ Name:
      <input type="text" value=<%=e.getName()%> name="name" /><br/><br/>
      Department:
      <input type="text" value=<%=e.getDept()%> name="dept" /><br/><br/>
      Designation:
      <input type="text" value=<%=e.getDesig()%> name="desig" /><br/><br/>
      Salary:
      <input type="text" value=<%=e.getBasic()%> name="basic" /><br/><br/>
      <input type="submit" value="Update" /><br/><br/>
      </center>
      </form>
      <% if(request.getParameter("empno") != null && request.getParameter("name") != null && request.getParameter("dept") != null&& request.getParameter("desig") != null && request.getParameter("basic") != null){
    	  e=new Employ();
    	  e.setEmpno(Integer.parseInt(request.getParameter("empno")));
    	  e.setName(request.getParameter("name"));
    	  e.setDept(request.getParameter("dept"));
    	  e.setDesig(request.getParameter("desig"));
    	  e.setBasic(Integer.parseInt(request.getParameter("basic")));
    	  crud=new EmployCRUD();
    	  out.println(crud.updateEmploy(e));
    	  %>
    	  <jsp:forward page="EmployShow.jsp" />
    	<%  
      }
      %>

</body>
</html>
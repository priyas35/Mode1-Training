<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Management Screen</title>
</head>
<body>
	<div align="center">
		<h1>Employee List</h1>
		<form:form action="Search" modelAttribute="searchEmployee">
		<table border="2">
		<tr>
		<td>
		   Employee Name:<form:input path="empName" /><br/><br/></td>
		<td>   <form:label path = "band">Band</form:label>
               
                  <form:select path = "band">
                     <form:option value='0'>SELECT</form:option>
                     <form:options items = "${bandList}" />
                  </form:select> <br/><br/></td>    	
            <td> Salary Greater Than:<form:input path="salary" /><br/><br/></td>
		   <td><input type="submit" value="Search" />
		   </td>
		   </tr>
		   </table>
		   </form:form>
		  
		
		<h2>No of Employees:${listEmployee.size()}</h2>
		
		<table border="1">

			<th>Name</th>
			<th>Salary</th>
			<th>Band</th>
			<th>DateOfJoin</th>
			<!-- <th>Action</th> -->

			<c:forEach var="employee" items="${listEmployee}">
				<tr>

					<td>${employee.empName}</td>
					<td>${employee.salary}</td>
					<td>${employee.band}</td>
					<td>${employee.dateOfJoin}</td>
					 <%-- <td><a href="editEmployee?empNo=${employee.empNo}">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="deleteEmployee?id=${employee.id}">Delete</a></td> 
 --%>
				</tr>
			</c:forEach>
		</table>
		<!-- <h4>
			New Employee Register <a href="newEmployee">here</a>
		</h4>  -->
	</div>
</body>
</html>
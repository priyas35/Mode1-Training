<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit Contact</title>
</head>
<body>
    <div align="center">
        <h1>New/Edit Employee</h1>
        <form:form action="getEmployee" method="post" modelAttribute="employee">
        <table>
            <form:hidden path="empNo"/>
            <tr>
                <td>Employee Name:</td>
                <td><form:input path="empName" /></td>
            </tr>
           <%--  <tr>
                <td>Salary:</td>
                <td><form:input path="salary" /></td>
            </tr>
            <tr>
                <td>Band:</td>
                <td><form:input path="band" /></td>
            </tr>
            <tr>
                <td>DateOfJoin:</td>
                <td><form:input path="dateOfJoin" /></td>
            </tr>
            <tr> --%>
                <td colspan="2" align="center"><input type="submit" value="Search"></td>
            </tr>
        </table>
        </form:form>
    </div>
</body>
</html>
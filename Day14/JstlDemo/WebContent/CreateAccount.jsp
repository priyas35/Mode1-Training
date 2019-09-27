<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="conn"
      driver="com.mysql.jdbc.Driver"
url="jdbc:mysql://localhost:3306/bank"
user="root"
password="root"
/>

<sql:query var="accounts" dataSource="${conn}">
select max(accountNo)+1 accno from accounts
</sql:query>
<c:set var="accno" value="0"/>
<c:forEach var="account" items="${accounts.rows}">
<c:set var="accno" value="${account.accno}"/>
</c:forEach>
Account No:
<b>
<c:out value="${accno}"/></b>
<br/><br/>
<sql:update dataSource="${conn}" var="accounts">
Insert into accounts(accountNo,firstName,lastName,city,state,amount,cheqFacil,accountType) values(?,?,?,?,?,?,?,?)
<sql:param value="${accno}"/>
<sql:param value="${param.firstName}"/>
<sql:param value="${param.lastName}"/>
<sql:param value="${param.city}"/>
<sql:param value="${param.state}"/>
<sql:param value="${param.amount}"/>
<sql:param value="${param.cheqFacil}"/>
<sql:param value="${param.accountType}"/>
</sql:update>
<c:out value="account created successfully"></c:out>

</body>
</html>
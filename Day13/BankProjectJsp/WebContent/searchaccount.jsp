<%@page import="com.hcl.bank.Accounts"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <jsp:useBean id="bean1" class="com.hcl.bank.SearchAccountBean" />
     <jsp:setProperty property="*" name="bean1"/>
    <%
    	Accounts objAccounts=bean1.searchAccount();
    if(objAccounts!=null) {
    	out.println("first name " + objAccounts.getFirstName());
		out.println("last name " + objAccounts.getLastName());
	    out.println("city " + objAccounts.getCity());
		out.println("state " + objAccounts.getState());
		out.println("amount " + objAccounts.getAmount());
		out.println("cheq facil " + objAccounts.getCheqFacil());
		out.println("account type " + objAccounts.getAccountType());
		
	}else
	{
		System.out.println("!!! account not found !!!"
				+ "");
	
    }
    %>

</body>
</html>
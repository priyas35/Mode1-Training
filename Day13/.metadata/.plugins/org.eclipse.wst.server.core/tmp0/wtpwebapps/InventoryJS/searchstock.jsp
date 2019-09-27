<%@page import="com.hcl.inventory.Stock"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
         <jsp:useBean id="bean1" class="com.hcl.inventory.SearchStock" />
     <jsp:setProperty property="*" name="bean1"/>
     <%
     Stock stock=bean1.searchStock();
		if(stock != null){
			out.println("item name " + stock.getItemname());
			out.println("price " + stock.getPrice());
			out.println("quantity available " + stock.getQuantityavail());
			
		}else
		{
			out.println("!!! stackid not found !!!"
					+ "");
		}
     
     %>

</body>
</html>
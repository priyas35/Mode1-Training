<%@page import="com.hcl.hotel.HotelCRUD"%>
<%@page import="com.hcl.hotel.Room"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>


   <form method="get" action="show.jsp">
   
   Room Type:
   <select name="Type">
   <option value="single" >single</option>
   <option value="double" >double</option>
   </select>
   
   Cost Per Day:
   <input type="text" name="CostPerDay" />
   Status:
   <input type="text" name="Status" />
   <input type="submit" value="Show Room" />
   
   </form>
   
   

</body>
</html>
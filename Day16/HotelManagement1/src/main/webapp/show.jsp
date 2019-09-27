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


<% HotelCRUD h=new HotelCRUD();
String RoomID=h.generateRoomId();
session.setAttribute("RoomID", RoomID);
String Type=request.getParameter("Type");
String Status=request.getParameter("Status");
int CostPerDay=Integer.parseInt(request.getParameter("CostPerDay"));
   
%>


 <%=RoomID %>
<%=Type%>
<%=Status%>
<%=CostPerDay%>

      
      
Welcome
<% if(request.getParameter("RoomID") != null && request.getParameter("Type") != null && 
        request.getParameter("CostPerDay") != null && request.getParameter("Status") != null ){
    	  Room r=new Room();
    	 r.setRoomID(request.getParameter("RoomID"));
    	  r.setType(request.getParameter("Type"));
    	  r.setCostPerDay(Integer.parseInt(request.getParameter("CostPerDay")));
    	  r.setStatus(request.getParameter("Status"));
    	  
    	  
    	 HotelCRUD h1=new HotelCRUD();
    	  out.println(h1.insertRoom(r));
    	  
      }
      %> 
</body>
</html>
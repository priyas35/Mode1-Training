<%@page import="com.hcl.college.FeedBack"%>
<%@page import="java.util.List"%>
<%@page import="com.hcl.college.CollegeCRUD"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>

<%
	CollegeCRUD c=new CollegeCRUD();
	String fid=c.generateFId();
	session.setAttribute("fid", fid);
	
%>
    <form method="get" action="FeedBack.jsp" name="frmFeedback">
    FeedBack ID :
    <input type="text" name="fid" value="<%=fid %>" />
    Student Name :
    <input type="text" name="studentName"/><br/><br/>
    Instructor:
    <select name="instructor" onchange="change();">
    <option value="dropdown">Pls Select</option>
    <%
		List<String> lst=new CollegeCRUD().instructorList();
		for(String s : lst){
	%>
	
		<option value="<%=s%>"> <%=s%> </option>
		<%
		}
		%>
	
    </select>
    
    
   
   
    
   <%
    session.setAttribute("studentName",request.getParameter("studentName"));
  
    session.setAttribute("instructor",request.getParameter("instructor"));
  
%> 
   
     
    
    </form>
    
        
       


<h2>Please give your feedback:</h2>
<form method="get" action="FeedBackConfirm.jsp">

 Select Subject:
    <select name="subject">
    <option value="dropdown"></option>
    <%
    String ins=request.getParameter("instructor");
	
	session.setAttribute("instructor",ins);
	
	
	
		List<String> lst1=new CollegeCRUD().subjectList(ins);

		for(String s : lst1){
	%>
	
		<option value="<%=s%>"> <%=s%> </option>
	
	<%
		}
	%>
    </select>

<input type="radio" id="type1"
     name="feedback" value="Excellent">
    <label for="type1">Excellent</label>

    <input type="radio" id="type2"
     name="feedback" value="Good">
    <label for="type2">Good</label>

    <input type="radio" id="type3" 
     name="feedback" value="Adequate">
    <label for="type3">Adequate</label>

    <input type="radio" id="type4"
     name="feedback" value="Inadequate">
    <label for="type4">Inadequate</label>
	<input type="submit" value="Show" />
	
	
	</form>
	


	
	</center>
	<script>
        function change(){
         
           document.frmFeedback.submit();
     
        }
        </script>

</body>
</html>
<%@page import="com.hcl.college.CollegeCRUD"%>
<%@page import="com.hcl.college.FeedBack"%>
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
	String fid=(String)session.getAttribute("fid");
String studentName=(String)session.getAttribute("studentName");
String instructor=(String)session.getAttribute("instructor");

String subject=request.getParameter("subject");
String fbvalue=request.getParameter("feedback");

%>

<form method="get" action="FeedBackConfirm.jsp">
    FeedBack ID:
    <input type="text" value=<%=fid %> name="fid" />  
    Student Name:
    <input type="text"  value=<%=studentName %> name="studentName" readonly="readonly" />  
    Instructor:
    <input type="text" value=<%=instructor %> name="instructor" readonly="readonly" />  
    Subject:
    <input type="text" value=<%=subject %> name="subject" readonly="readonly" />   
    FeedBack:
    <input type="text" value=<%=fbvalue %> name="fbvalue" readonly="readonly" />   
    <input type="submit" value="Confirm" />  
    
      </form>
      
      <% if(request.getParameter("fid") != null && request.getParameter("fbvalue") != null && 
        request.getParameter("instructor") != null && request.getParameter("studentName") != null&& request.getParameter("subject") != null ){
    	  FeedBack fb=new FeedBack();
    	  CollegeCRUD in=new CollegeCRUD();
    	  fb.setSubject(request.getParameter("subject"));
    	  fb.setFid(request.getParameter("fid"));
    	  fb.setInstructor(request.getParameter("instructor"));
    	  fb.setStudentName(request.getParameter("studentName"));
    	  fb.setFbvalue(request.getParameter("fbvalue"));
    	  
    	 
    	  out.println(in.insertFeedBack(fb));
    	  
    	  
      }
      %>
</body>
</html>
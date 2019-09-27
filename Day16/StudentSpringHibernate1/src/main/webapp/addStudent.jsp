<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="com.hcl.student.dao.StudentDAOImpl"%>
<%@page import="com.hcl.student.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="springForm" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<springForm:form method="post" commandName="student" action="addStudent.jsp">
        Roll No:
        <springForm:input path="rollNum" />
        Student Name:
        <springForm:input path="sName" />
        Age:
        <springForm:input path="age" />
        Gender:
       <springForm:radiobutton path="gender" value="Male"/>  
       <springForm:radiobutton path="gender" value="Female"/>  
        
      Country: 
      <springForm:select path="country" id="dropdown" >
                
                <springForm:option value="India">India</springForm:option> 
                 <springForm:option value="America">America</springForm:option> 
                  <springForm:option value="US">US</springForm:option> 
                   <springForm:option value="China">China</springForm:option> 
                   </springForm:select>
                  Date Of Join:
                   <springForm:input path="dateOfJoin" /> 
                   Final Score:
                    <springForm:input path="finalScore" />
                    
                    <input type="submit" value="Submit" />
                    
                    
                    <% if(request.getParameter("rollNum") != null && 
        request.getParameter("sName") != null && request.getParameter("dateOfJoin")!= null && request.getParameter("age") != null&& request.getParameter("gender") != null && request.getParameter("country") != null && request.getParameter("finalScore") != null){
    	  Student s=new Student();
    	  
    	  s.setRollNum(Integer.parseInt(request.getParameter("rollNum")));
    	  s.setsName(request.getParameter("sName"));
    	  s.setAge(Integer.parseInt(request.getParameter("age")));
    	  s.setGender(request.getParameter("gender"));
    	  s.setCountry(request.getParameter("country"));
    	  String date_updated=request.getParameter("dateOfJoin");
    	  SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			Date date=sdf.parse(date_updated);
			s.setDateOfJoin(date);
			
    	 s.setFinalScore(Float.parseFloat(request.getParameter("finalScore")));
    	  
    	 
    	  
    	 StudentDAOImpl si=new StudentDAOImpl();
    	  out.println(si.addStudent(s));
    	  
      }
      %>
                   
                    
                    
</springForm:form>

</body>
</html>
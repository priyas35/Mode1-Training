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
<form method="POST"  action="addStudent.jsp">
        Roll No:
        <input type="text" name="rollNum" />
        Student Name:
        <input type="text" name="sName" />
        Age:
        <input type="text" name="age" />
        Gender:
        

        <input type="radio" 
     name="gender" value="Male">
    <label >Male</label>
    <input type="radio" 
     name="gender" value="Female">
    <label >Female</label>
      
      Country: 
      <select name="country" id="dropdown" >
                
                <option value="India">India</option> 
                 <option value="America">America</option> 
                  <option value="US">US</option> 
                   <option value="China">China</option> 
                   </select>
                  Date Of Join:
                   <input type="date" name="dateOfJoin" /> 
                   Final Score:
                    <input type="text" name="finalScore" />
                    
                    <input type="submit" value="Submit" />
                    

</body>
</html>
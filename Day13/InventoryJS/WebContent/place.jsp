<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="menu.jsp"></jsp:include>

            <form method="get" action="placeorder.jsp" >
      <center>
      Stock Id:
      <input type="text" name="stockId" /><br/><br/>
      Quantity:
      <input type="text" name="qtyord" /><br/><br/>
      <input type="submit" value="Place Order" /><br/><br/>
      </center>
      </form>
       

</body>
</html>
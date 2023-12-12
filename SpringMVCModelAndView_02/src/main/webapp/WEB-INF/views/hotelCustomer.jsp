<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Integer id=(Integer)request.getAttribute("id");
String firstName=(String)request.getAttribute("firstName");
String lastName=(String)request.getAttribute("lastName");
Long ContactNumber=(Long)request.getAttribute("contactNumber");
String location=(String)request.getAttribute("location");


out.println(id);
out.println(firstName);
out.println(lastName);
out.println(contactNumber);
out.println(location);



%>

</body>
</html>
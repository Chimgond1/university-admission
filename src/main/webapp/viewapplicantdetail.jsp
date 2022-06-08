<%@page import="com.ty.dto.Applicant"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>




<table border="2px solid black">

<thead>
<tr>
<th>ID</th>
<th>NAME</th>
<th>EMAIL</th>
<th>PHONE</th>
<th>AGE</th>
<th>GENDER</th>
<th>CHOICE</th>
<th>PUC</th>
</tr>

<% Applicant applicant=(Applicant) request.getAttribute("apple");

%>
<tr>
ID :<td><%=applicant.getId()%> </td>
NAME: <td><%=applicant.getName() %></td>
EMAIL: <td><%=applicant.getEmail() %></td>
PHONE:<td><%=applicant.getPhone() %></td>
AGE:<td><%=applicant.getAge() %></td>
GENDER:<td><%=applicant.getGender() %></td>
CHOICE:<td><%=applicant.getChoice() %></td>
PUC:<td><%=applicant.getPuc() %></td>




</tr>



</thead>
</table>



















</body>
</html>
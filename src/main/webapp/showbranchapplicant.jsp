<%@page import="com.ty.dto.Applicant"%>
<%@page import="java.util.List"%>
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

<% List<Applicant> applicants=(List<Applicant>) request.getAttribute("listofapplicant");

%>
<% for(Applicant applicant:applicants){ %>

<tr>
<td><%=applicant.getId()%> </td>
 <td><%=applicant.getName() %></td>
 <td><%=applicant.getEmail() %></td>
<td><%=applicant.getPhone() %></td>
<td><%=applicant.getAge() %></td>
<td><%=applicant.getGender() %></td>
<td><%=applicant.getChoice() %></td>
<td><%=applicant.getPuc()%></td>



<%} %>


</tr>


</body>
</html>
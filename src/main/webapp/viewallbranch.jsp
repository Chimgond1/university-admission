<%@page import="com.ty.dto.Branch"%>
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

<table border="5px solid black">

<thead>
<tr>
<th>ID</th>
<th>BRANCH NAME</th>
<th>link</th>


</tr>
<% List<Branch>  branchs=(List<Branch>)request.getAttribute("allbranch");%>
<tr>
<% for(Branch branch:branchs){ %>
<td><%=branch.getId()%> </td>
 <td><%=branch.getBranchName() %></td>
 <td><a href="aplicantregistaion.jsp?id=<%=branch.getId()%>" >admission</a></td>

</tr>
<%} %>
</table>

</body>
</html>
<%@page import="com.ty.service.BranchService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1>SELECT BRANCH</h1>
<%BranchService branchService=new BranchService(); 

%>
<a href="aplicantregistaion.jsp?id="<%branchService.getBranchById(1);%> value="readonly">Computer Science Engineering</a><br><br>
<a href="aplicantregistaion.jsp?id="<%branchService.getBranchById(2);%>>Electronic and Communication Engineering</a><br><br>
<a href="aplicantregistaion.jsp?id="<%branchService.getBranchById(3);%>>Information Technology Engineering</a><br><br>



</body>
</html>
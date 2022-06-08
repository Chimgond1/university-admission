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
<form action="applicantRegistation">
<h1>applicant regitation form</h1>
BRANCH ID<input type="number" name="BranchId" readonly="readonly" value="<%=request.getParameter("id")%>"><br><br>
NAME<input type="text" name="name"><br><br>
EMAIL:<input type="text" name="email"><br><br>
PHONE:<input type="text" name="phone"><br><br>
AGE:<input type="number" name="age" ><br><br>
PUC:<input type="text" name="puc"><br><br><br>
GENDER:<input type="radio" name="gender" value="male" id="gender">Male
        <input type="radio" name="gender" value="female" id="gender">Female 

<br><br><br>

<input type="submit" value="submit">
</form>



</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	response.setCharacterEncoding("UTF-8");
	response.setContentType("text/plain");
	String msg = (String) request.getAttribute("msg2");
	msg += "진짜짜";
	%>

	<h3><%=msg%></h3>


</body>
</html>
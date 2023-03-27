<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>여기는 result2.jsp 파일이여</h1>

	<%
	response.setCharacterEncoding("UTF-8");
	response.setContentType("text/plain"); // 평문
	String msg = (String) request.getAttribute("msg2");
	msg += "<<<";
	out.println(msg);
	%>
</body>
</html>
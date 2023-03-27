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
	String imgDir;
	String testServerIp;
	String realServerIp;

	imgDir = application.getInitParameter("imgDir");
	testServerIp = application.getInitParameter("testServerIp");
	realServerIp = application.getInitParameter("realServerIp ");
	%>

	<p>imgDir : <%=imgDir%></p>
	<p>testServerIp : <%=testServerIp%></p>
	<p>realServerIp : <%=realServerIp%></p>
	<div>
		<img alt="배너이미지" src="/demo6_1<%=imgDir%>/a.png">
	</div>
</body>
</html>
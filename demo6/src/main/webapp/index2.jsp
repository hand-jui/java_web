<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 만약 이 페이지에서 오류가 발생한다면 다른 곳으로 이동시키기 -->
<%@ page errorPage="errorPage.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String str = null;
	out.print(str.split("/"));
	
	%>
</body>
</html>
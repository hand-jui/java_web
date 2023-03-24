<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
Cookie[] cookies = request.getCookies();
String[] inCart = new String[cookies.length - 1];
if (cookies != null) {
	for (Cookie c : cookies) {
		if (c.getName().equals("fruits")) {
			for (int i = 0; i < inCart.length; i++) {
				inCart[i] = c.getValue();
			}
		}
	}
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>여기야~</h1>
	<%
	for (int i = 0; i < inCart.length; i++) {
	%>
	<%=inCart[i]%>
	<%
	}
	%>
	<input type="submit" value="삭제">
</body>
</html>
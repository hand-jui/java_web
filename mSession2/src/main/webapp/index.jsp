<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
String sessionUserName = (String) session.getAttribute("username");
// !!로그인이 안돼있으면 login.jsp 페이지로 이동시키쇼
if (sessionUserName == null) {
	response.sendRedirect("login.jsp");
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인 상태여야만 이 페이지를 보여줍니디.</h1>
	<h1>ㅀ구허웃하는 기는ㅇ</h1>
	<form action="logout.jsp">
		<input type="submit" value="로그아웃">
	</form>
</body>
</html>
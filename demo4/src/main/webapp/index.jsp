<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Example</title>
</head>
<body>
	<form action="login.jsp" method="post">
		<label> 사용자 이름 : </label>
		<input type="text" id="username" name="username"> 
		<label> 비밀번호 : </label>
		<input type="password" id="password" name="password">
		<input type="submit" value="로그인">
	</form>

	<%-- 세션 클래스에 사용자 이름이 저장되어 있으면 로그인 상태를 유지합니다. --%>
	<%if (session.getAttribute("username") != null) {%>
	
		<p>
		현재 로그인 상태입니다.
		사용자 이름 : <%=session.getAttribute("username") %>
		 </p>
	<%}%>
	
	<% for(int i = 0; i < 10; i++) { %>
		 <p><%= i %></p>
	<% } %>
</body>
</html>
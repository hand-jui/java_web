<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인 폼 양식을 만들어서 제출하는 코드를 작성</h1>
	<form action="loginProc.jsp" method="post">
		<label>로그인 : </label>
		<input type="text" id="username" name="username" value="admin1" required="required">
		<label>비밀번호 : </label>
		<input type="password" id="password" name="password" value="1234" required="required">
		<input type="submit" value="제출">
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
// 넘겨 받은 값 username 과 password 를 확인해서
// admin1 과 1234 값이 같다면 로그인 처리하는 코드를 작성
// 아이디와 비번이 틀리다면 login.jsp 헤이지로 이동하는 코드 작성

String username = request.getParameter("username");
String password = request.getParameter("password");

if (username != null && password != null) {
	if (username.equals("admin1") && password.equals("1234")) {
		session.setAttribute("username", username);
		response.sendRedirect("index.jsp");
	} else {
		response.sendRedirect("login.jsp");
	}
}
%>

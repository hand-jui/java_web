<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
String username = request.getParameter("username");
String password = request.getParameter("password");

if (username!=null&&password!=null){
	
	if(username.equals("admin")&&password.equals("1234")){
		session.setAttribute("username", username);

		response.sendRedirect("index2.jsp");
		
	}else{
		
		out.print("<p>로그인 다시하렴~~</p>");
	}
	
	
}
%>










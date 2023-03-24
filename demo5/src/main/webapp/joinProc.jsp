<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.sql.*"%>




<%
request.setCharacterEncoding("UTF-8");
String username = request.getParameter("username");
String password = request.getParameter("password");
String email = request.getParameter("email");

try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url = "jdbc:mysql://localhost:3306/demo5?serverTimezone=Asia/Seoul&characterEncoding=UTF-8";
	String dbUser = "root";
	String dbPw = "1234";
	Connection conn = DriverManager.getConnection(url, dbUser, dbPw);
	String sql = " INSERT INTO user(username, password, email) VALUES(?, ?, ?) ";
	PreparedStatement pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, username);
	pstmt.setString(2, password);
	pstmt.setString(3, email);
	pstmt.executeUpdate();

	conn.close();
	response.sendRedirect("joinOk.jsp");

} catch (Exception e) {
	e.printStackTrace();
}
%>

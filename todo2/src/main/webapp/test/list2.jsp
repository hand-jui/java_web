<%@ page import="com.tenco.todo.dto.CategoryDTO"%>
<%@ page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>Name</th>
			<th>ID</th>
		</tr>
		<c:forEach var="category" items="${list2}">
			<tr>
				<td>${category.name}</td>
				<td>${category.id}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
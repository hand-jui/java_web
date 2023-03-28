<%@ page import="com.tenco.todo.dto.TodoDTO"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>TodoList</h2>
	<table>
		<tr>
			<th>ID</th>
			<th>Title</th>
			<th>Description</th>
			<th>Priority</th>
			<th>Completed</th>
			<th>CreatedAt</th>
			<th>Category_ID</th>
		</tr>
		
		<c:forEach var="todoList" items="${list}">
			<tr>
				<td>${todoList.id}</td>
				<td>${todoList.title}</td>
				<td>${todoList.description}</td>
				<td>${todoList.priority}</td>
				<td>${todoList.completed}</td>
				<td>${todoList.createdAt}</td>
				<td>${todoList.categoryId}<button><a href="/todo2/todoTest?action=delete&tid=${todoList.id}">delete</a></button></td>
				
				
			</tr>
		</c:forEach>
	</table>
</body>
</html>
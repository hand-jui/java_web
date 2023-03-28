<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>할일 수정 </title>
</head>
<body>
	<h1>todoList update form</h1>
	<form action="/todo2/todoTest?action=update" method="post">
		<label>id</label><input type="text" name="id">
		<label>title</label><input type="text" name="title" required="required">
		<label>description</label><input type="text" name="description">
		<label>priority</label><input type="number" name="priority">
		<label>completed</label><input type="number" name="completed">
		<label>category</label><input type="number" name="categoryId">
		<input type="submit" value="할일 저장">
	</form>
</body>
</html>
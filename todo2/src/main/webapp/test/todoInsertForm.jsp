<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>할일 정보 저장하기</title>

</head>
<body>
	<h1>todoList insert form</h1>
	<form action="/todo2/todoTest?action=insert" method="post">
		<label>title</label><input type="text" name="title" required="required">
		<label>description</label><input type="text" name="description">
		<label>priority</label><input type="number" name="priority" value="0">
		<label>completed</label><input type="number" name="completed" value="0">
		<label>CreatedAt</label><input type="datetime-local" name="createdAt" value="now" id="currentTime">
		<label>category</label><input type="number" name="categoryId">
		<input type="submit" value="할일 저장">
	</form>
<script type="text/javascript">
	document.getElementById('currentTime').value= new Date().toISOString().slice(0, 16);
</script>
</body>
</html>
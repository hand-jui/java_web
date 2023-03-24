<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
	flex-direction: column;
}

form {
	display: flex;
	flex-direction: column;
	padding: 30px;
	align-items: center;;
}

div {
	margin: 10px;
}

input[type="submit"] {
	padding: 8px;
	border-radius: 5px;
	margin-top: 30px;
	background-color: green;
	width: 100px;
	heigh: 50px;
	border: none;
}

label {
	font-weight: bold;
}
</style>
</head>
<body>
	<h1>카트라이더 카트인줄..</h1>
	<form action="cartProc.jsp" method="post">
		<div>
			<input type="checkbox" id="apple" name="fruits" value="사과"> <label for="apple">사과 </label>
		</div>
		<div>
			<input type="checkbox" id="banana" name="fruits" value="바나나"> <label for="banana">바나나</label>
		</div>
		<div>
			<input type="checkbox" id="orange" name="fruits" value="오렌지"> <label for="orange">오렌지</label>
		</div>
		<input type="submit" value="담기">
	</form>
</body>
</html>
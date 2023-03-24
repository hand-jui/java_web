<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.3/dist/jquery.slim.min.js"></script>

<!-- Popper JS -->
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
<style type="text/css">
body {
	margin: 20px;
	height: 100vh;
	padding: 10px;
	display: flex;
	justify-content: center;
	align-content: center;
}

form {
	border: 1px solid black;
	width: 500px;
	height: 400px;
	padding: 15px;
	border-radius: 10px;
}
</style>
</head>
<body>
	<!-- 주소는 절대경로와 상대경로 설정할 수 있다.
			/ 있으면<-- 절대 경로로 시작
			/ 없으면 <-- 상대 경로
	 -->
	<form action="/demo2/loginProc" method="post">
		<div class="form-group">
			<label for="email">Email Address : </label> 
			<input type="email" class="form-control" placeholder="Enter email" id="email" name="email" value="a@nate.com">
		</div>
		<div class="form-group">
			<label for="password">Password : </label> 
			<input type="password" class="form-control" placeholder="Enter password" id="password" name="password" value="asd123">
		</div>
		<div class="form-group">
			<input type="checkbox" id="isRemember" name="isRemeber"> 
			<label for="isRemember">Remember me</label>
		</div>
		<div class="form-group">
			<label for="hobby">취미</label> <select name="hobby">
				<option value="코딩">코딩</option>
				<option value="공부">공부</option>
				<option value="프로젝트" selected="selected">프로젝트</option>
				<option value="운동">운동</option>
				<option value="술마시기">술마시기</option>
			</select>
		</div>
		<div>
			<p>좋아하는 동물</p>
			<input type="checkbox" name="like" value="cat" id="cat"> 
			<label for="cat">고양이</label> 
			<input type="checkbox" name="like" value="dog" id="dog"> 
			<label for=dog>강아지</label> 
			<input type="checkbox"name="like" value="lion" id="lion">
			<label for="lion">사자</label>
		</div>
		<button type="submit" class="btn btn-success">Submit</button>
	</form>
</body>
</html>
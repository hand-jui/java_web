<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
display:flex;
height: 100vh;
justify-content: center;
align-items: center;

}
.moo p{
	margin: 0px;
	padding: 0px;
}
</style>
</head>
<body>
	<%
	String errImgDir;

	errImgDir = application.getInitParameter("errImgDir");
	%>

	<div class="moo">
		<p>.⠀⢰⠒⠒⠒⢲⠆⠀⠀⢀⠤⢤⡀⠀⡴⠀⠀⢀⣀⣀⣰⣀⣀⡀⠀⠀⠀⠀⠀</p>
		<p>⠀⠀⣎⣀⣀⣀⡜⠀⠀⢰⠃⠀⢠⠇⢰⠓⠂⠀⢀⠔⠒⠒⠲⡄⠀⠀⠀⠀⠀⠀</p>
		<p>⠤⠤⠤⣤⠤⠤⠤⠄⠀⣇⠀⢀⠞⢀⡯⠤⠀⠀⠹⠤⡤⠤⠞⠁⠀⢠⠔⢤⣀⠆</p>
		<p>⠀⠀⢀⡏⠀⠀⠀⠀⠀⠈⠉⠁⠀⡸⠀⠀⠠⠤⠤⠴⠧⠤⠤⠄⠀⠀⠀⠀⠀</p>
	</div>

	<h2>에러 나부렀다</h2>

	<div>
		<img alt="에러이미지" src="/demo6_1<%=errImgDir%>/error.png">
	</div>
</body>
</html>
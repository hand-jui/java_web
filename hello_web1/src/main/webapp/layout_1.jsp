<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
* {
	box-sizing: border-box;
}

h1, h2, h3, h4, h5, h6 {
	margin: 0;
}

body {
	display: flex;
	justify-content: center;
}

section {
	width: 1300px;
	margin: 40px 20px;
	padding: 20px;
	background-color: #fff;
	display: flex;
}

article.main {
	flex: 3;
	order: 2;
	justify-content: center;
	display: flex;
	flex-direction: column;
}

article.main img {
	flex: 1;
}

article.side1 {
	flex: 1;
	order: 1;
	text-align: left;
}

article.side2 {
	flex: 1;
	order: 3;
	text-align: right;
}
</style>
</head>
<body>
	<section>
		<article class="main">
			<img alt="" src="images/main_img.jpg">
			<h2>Main Content</h2>
			<p>"Neque porro quisquam est qui dolorem ipsum quia dolor sit
				amet, consectetur, adipisci velit..." "There is no one who loves
				pain itself, who seeks after it and wants to have it, simply because
				it is pain..."</p>
		</article>
		<article class="side1">
			<h2>Side Content1</h2>
			Lorem Ipsum is simply dummy text of the printing and typesetting
			industry. Lorem Ipsum has been the industry's standard dummy text
			ever since the 1500s, when an unknown printer took a galley of type
			and scrambled it to make a type specimen book. It has survived not
			only five centuries, but also the leap into electronic typesetting,
			remaining essentially unchanged. It was popularised in the 1960s with
			the release of Letraset sheets containing Lorem Ipsum passages, and
			more recently with desktop publishing software like Aldus PageMaker
			including versions of Lorem Ipsum.
		</article>
		<article class="side2">
			<h2>Side Content2</h2>
			Lorem Ipsum is simply dummy text of the printing and typesetting
			industry. Lorem Ipsum has been the industry's standard dummy text
			ever since the 1500s, when an unknown printer took a galley of type
			and scrambled it to make a type specimen book. It has survived not
			only five centuries, but also the leap into electronic typesetting,
			remaining essentially unchanged. It was popularised in the 1960s with
			the release of Letraset sheets containing Lorem Ipsum passages, and
			more recently with desktop publishing software like Aldus PageMaker
			including versions of Lorem Ipsum.
		</article>
	</section>
</body>
</html>
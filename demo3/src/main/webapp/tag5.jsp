<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="/layout/header.jsp" />
<style>
	main {
		height: 300px;
		display: flex;
		flex-direction: column;
		justify-content: flex-start;
		align-items: flex-start;
		padding: 20px;
	}
	
	h1 {
		margin-top: 30px;
		margin-bottom: 10px;
		font-size: 28px;
		font-weight: bold;
		text-align: center;
	}
</style>

<main>
	<h1>덧셈 게임</h1>
	<%
	int num1 = (int) (Math.random() * 10) + 1;
	int num2 = (int) (Math.random() * 10) + 1;
	int answer = num1 + num2;
	%>

	<p><%=num1%> + <%=num2%> = ?</p>
	<form action="/demo3/result.jsp" method="post">
		<input type="hidden" name="answer" value="<%=answer%>">
		<input type="number" name="guess" required="required">
		<input type="submit" value="정답제출">
	</form>
</main>

<jsp:include page="/layout/footer.jsp" />

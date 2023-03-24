<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<jsp:include page="/layout/header.jsp" />
<style>
main {
	display: flex;
	padding: 20px;
	flex-direction: column;
	align-items: center;
	justify-content: flex-start;
}

main pre {
	width: 100%;
	border: 1px solid black;
	padding: 20px;
}

table {
	border-collapse: collapse;
	width: 400px;
	font-size: 14px;
	margin: 20px;
}

td {
	background-color: #f2f2f2;
	border: 1px solid #ccc;
	text-align: center;
}
</style>

<main>
	<h1>구구단 예제</h1>
	<table>

		<%
		for (int i = 2; i < 10; i++) {
		%>

		<tr>
			<td><%=i%>단 시작</td>
		</tr>
		<%
		for (int j = 1; j < 10; j++) {
		%>
		<tr>
			<td><%=i%> X <%=j%> = <%=i * j%></td>
		</tr>
		<%
		}
		%>
		<tr>
			<td>&nbsp;</td>
		</tr>

		<%
		}
		%>

	</table>
	<br>
	<pre>
		스크립트 릿과 표현식을 잘 구분해 봅시다.
	</pre>
</main>

<jsp:include page="/layout/footer.jsp" />

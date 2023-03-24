<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
response.setCharacterEncoding("UTF-8");
String[] fruits = request.getParameterValues("fruits");
String[] names = {"사과", "오렌지", "바나나"};
// 방어적 코드

	// 사용자가 과일을 하나이상 선택했을 때
//	for (String fruit : fruits) {
		//String countParam = fruit + ":count";
		//out.println(fruit);
//	}
Cookie[] fruitsCookie = new Cookie[fruits.length];
if (fruits != null && fruits.length > 0) {
	// 사용자가 과일을 하나이상 선택한 경우
	
	for (int i = 0; i < fruits.length; i++) {
		fruitsCookie[i] = new Cookie(names[i], fruits[i]);
		fruitsCookie[i].setMaxAge(60 * 60 * 24);
		response.addCookie(fruitsCookie[i]);
		out.println(fruitsCookie[i].getValue());
	}
} 
else {
	Cookie[] cookies = request.getCookies();
	if (cookies != null) {
		for (Cookie c : cookies) {
			if (c.getName().equals("fruits")) {
				c.setMaxAge(0);
				response.addCookie(c);
				break;
			}
		}
	}
}

response.sendRedirect("cart.jsp");

%>
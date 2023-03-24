package com.tenco.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//URL - http://localhost:8080/blog/index.html
//URI - http://localhost:8080/blog/boardcontroller

//web.xml 환경설정에서 해야하는 부분
//web.xml 파일은 웹 서버가 동작 시 한번만 로딩되기 때문에 서버를 재시작해야한다
@WebServlet("/boardcontroller")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BoardController() {
		super();
	}

//	METHOD : GET
//	http://localhost:8080/blog/boardcontroller?name=kim
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("boardController 동작");
		System.out.println("contextPath : " + request.getContextPath());
		System.out.println("cookies : " + request.getCookies());
		System.out.println("session : " + request.getSession());
//		JSESSIONID 라는 것은 사용자가 웹서버ㅇㅔ 최초 요청하고 응답시에 값을 남구 보나더ㅣ.
		System.out.println("p_names : " + request.getParameterNames());
		System.out.println("test : " + request.getParameter("name"));

//		response 객체
		response.addCookie(new Cookie("mycookie", "asd123"));
		response.getWriter();
		response.getStatus();
		response.sendRedirect("/usercontroller");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

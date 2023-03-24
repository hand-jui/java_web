package com.tenco;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/uc")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UserController() {
		super();
		System.out.println("UserController 생성자 호출");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("UserController doGet 매서드 호출");
		PrintWriter out = response.getWriter();
//		HTTP 메세지 - http 메세지 헤더 정의가 된다.
//		ContentType --> text/html, application/json
//		ContentType 이란 응답 보낼 데이터 타입의 형식이다
//		웹 표준기술인 MIME TYPE 이런 것이 정해져 있다
		response.setContentType(getServletInfo());
	}

//	주소 경로는 doGet과 같지만 METHOD 선정에 따라 구분할 수 있다 -> 서버는
//	http://localhost:8080/myWeb1/uc
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("METHOD 방식 중 POST 요청 방식을 확인하고 응답 처리해보자");
//		doPost 동작 시키기 위해서는 METHOD : post 방식을 이해해야한다
//		MIME TYPE : text/plain
//		MIKE 문자열을 응답 처리
		PrintWriter writer = response.getWriter();
		response.setContentType("text/plain; charset=UTF-8;");
		writer.print("MIKE");
	}
}

package com.tenco.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/inc")
public class IndexController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public IndexController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		http://localhost:8080/demo10/inc?name=홍길동&pw=1234
		String username = request.getParameter("name");
		String pw = request.getParameter("pw");

//		GET 방식에 대한 복습
//		1. 한글 안깨짐
		System.out.println("username : " + username);
		System.out.println("pw : " + pw); 
//		index.jsp

//		2. 응닶 시 한글 깨짐 (해결 방법 - setContentType 설정하기)
//		response.setContentType("text/html; charset=UTF-8;");
//		PrintWriter out = response.getWriter();
//		out.println("username :" + username);
//		out.println("pw:" + pw);

//		path : URI 개념 (URL)
//		docBase = 폴더 경로  --> 루트 경로 : webapp -> WEB-INF -> index.jsp

//		보안상으로 바로 접근할 수 없어서 forward 방식으로 처리를 한다
		request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
//		POST 방식일 때
//		1. 요청으로 들어온 값 콘솔창 한글 깨짐(해결 방안 - setChracterEncoding("UTF-8");
//		2. 응답시 한글 깨짐(해경 방안)
//		request.setCharacterEncoding("UTF-8");
		
		String username = request.getParameter("username");
		String pw = request.getParameter("pw");
	
		System.out.println("username : " + username);
		System.out.println("pw : " + pw); 
		
//		응답처리
		response.setContentType("text/html; charset=UTF-8;");
		PrintWriter out = response.getWriter();
		out.println("사용자 이름 : " + username);
		out.println("비먼 : " + pw);
		
		
	}

}

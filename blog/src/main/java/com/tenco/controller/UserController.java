package com.tenco.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/usercontroller")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UserController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		2. JSON 형식으로 name = 홍길동, age = 10 을 return
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		response.setContentType("application/json; character=UTF-8;");
		out.write("{\n");
		out.write("\t\"name\":\"홍길동\"\n");
		out.write("\t\"age\":10\n");
		out.write("}");
	}

//	METHOD : POST
//	http://localhost:8080/blog/usercontroller
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		form 태그에서 넘어오는 값들을 받아보고 연산해서 응답처리 해보기
//		요청 시 파라미터로 넘겨온 키 값을 확인해서 값을 추출하는 기술을 알아보자.

		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String pwd = request.getParameter("password");

		System.out.println("name : " + name);
		System.out.println("pwd : " + pwd);
		
//		응답처리
//		1. MIME TYPE text/html 방식 -> 이름과 비번을 확인하였습니다.
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html; character=utf-8");
		writer.write("<!DOCTYPE html>");
		writer.write("<html>");
		writer.write("<head>");
		writer.write("</head>");
		writer.write("<body>");
		writer.write("<section>");
		writer.write("<h1>");
		writer.write("name OK pwd OK");
		writer.write("</h1>");
		writer.write("</section>");
		writer.write("</body>");
		writer.write("</html>");
	}

}

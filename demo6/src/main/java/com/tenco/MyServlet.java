package com.tenco;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MyServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		내장 객체 config 활용해서 초기 파라미터 값 확인하기
		String adminId = getServletConfig().getInitParameter("adminId");
		String adminPw = getServletConfig().getInitParameter("adminPw");
		System.out.println("adminId : " + adminId);
		System.out.println("adminPw : " + adminPw);
		String imgDir = getServletContext().getInitParameter("imgDir");
		String testServerIp = getServletContext().getInitParameter("testServerIp");
		String realServerIp = getServletContext().getInitParameter("realServerIp");
		System.out.println("imgDir : " + imgDir);
		System.out.println("testServerIp : " + testServerIp);
		System.out.println("realServerIp : " + realServerIp);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

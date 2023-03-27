package com.tenco;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet2")
public class MyServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MyServlet2() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String message = "안녕 include() 방식";
		request.setCharacterEncoding("UTF-8");
		request.setAttribute("msg2", message);
		
		// RequestDispatcher 를 이용하여 JSP를 포함 시킴
		RequestDispatcher dispatcher = request.getRequestDispatcher("result2.jsp");
		
		dispatcher.include(request, response);
	
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

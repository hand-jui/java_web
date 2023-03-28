package com.tenco.todo.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tenco.todo.dto.TodoDTO;
import com.tenco.todo.repository.TodoDAO;

@WebServlet("/todoTest")
public class TodoTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TodoTest() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		TodoDAO dao = new TodoDAO();
		String action = request.getParameter("action");
		if ("delete".equals(action)) {
			String tid = request.getParameter("tid");
			dao.delete(Integer.parseInt(tid));
			response.sendRedirect("/todo2/todoTest");
		} else {
			ArrayList<TodoDTO> resultList = dao.select();
			request.setAttribute("list", resultList);
			RequestDispatcher dispatcher = request.getRequestDispatcher("test/todoList.jsp");
			dispatcher.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String id = request.getParameter("id");
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		String priority = request.getParameter("priority");
		String completed = request.getParameter("completed");
		String createdAt = request.getParameter("createdAt");
		String categoryId = request.getParameter("categoryId");

		TodoDTO dto = new TodoDTO(Integer.valueOf(id) != null ? Integer.valueOf(id) : 0, title, description, Integer.parseInt(priority),
				Integer.parseInt(completed), createdAt, Integer.parseInt(categoryId));
		TodoDAO todoDAO = new TodoDAO();

		String action = request.getParameter("action");
		int responseCount = 0;
		if (action.equals("insert")) {
			responseCount = todoDAO.insert(dto);
		} else if (action.equals("update")) {
			responseCount = todoDAO.update(dto);
		}
		response.setContentType("text/plain; UTF-8;");
		PrintWriter out = response.getWriter();
		out.print("저장된 수 확인 : " + responseCount);

	}

}

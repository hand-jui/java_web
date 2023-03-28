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

import com.tenco.todo.dto.CategoryDTO;
import com.tenco.todo.repository.CategoryDAO;

@WebServlet("/cTest")
public class CategoryTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
//		todo-DB 연결확인 후 삭제 예정
//		DBHelper dbHelper = new DBHelper();
//		dbHelper.getConnection();  // DB 연결완료

	}

	public CategoryTest() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		CategoryDAO dao = new CategoryDAO();
//		주소 설계
//		http://localhost:8080/todo/cTest?action=delete&cid=1
		String action = request.getParameter("action");
		if ("delete".equals(action)) {
			String cid = request.getParameter("cid");
			dao.delete(Integer.parseInt(cid));
			response.sendRedirect("/todo/cTest");
		} else {
			ArrayList<CategoryDTO> resultList = dao.select();
//		a 링크 <-- get
			request.setAttribute("list", resultList); // request 객체에 값 세팅
			RequestDispatcher dispatcher = request.getRequestDispatcher("test/categoryList.jsp");
			// request, response -->categoryList.jsp
			dispatcher.forward(request, response);
		}

//		목적지 list2.jsp -> jstl 사용해서 출력
//		request.setAttribute("list2", resultList);
//		RequestDispatcher dispatcher2 = request.getRequestDispatcher("test/list2.jsp");
//		dispatcher2.forward(request, response);

//		System.out.println(result.toString());
//		PrintWriter out = response.getWriter();
//		out.println(result.toString());

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String name = request.getParameter("name");
		String id = request.getParameter("id");
		CategoryDAO categoryDAO = new CategoryDAO();

//		쿼리 파라메터 방식 데이터 받아 보기
//		insert, update
		String action = request.getParameter("action");
		int responseCount = 0;
		if (action.equals("update")) {
//			id --> String
			responseCount = categoryDAO.update(Integer.parseInt(id), name);
		} else if (action.equals("insert")) {
//			method - post 요청시에 동작하는 메서드
			responseCount = categoryDAO.insert(name);
		}
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();
		out.print("저장된 갯수 확인 : " + responseCount);
	}
}

package com.tenco.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println(">>>필터 초기화<<<");
	}
	
//	doFilter 기억
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		System.out.println("---1---");
		request.setCharacterEncoding("UTF-8");
//		Filter --> Servlet 보낼려면
		chain.doFilter(request, response);
		
//		구현된 서블릿에서 직접 응답 처리를 지정하는 것이 좋다.
//		response.setContentType("text/plain; charset=UTF-8");
		System.out.println("---3---");
	}

	@Override
	public void destroy() {
		System.out.println(">>>필터 destroy<<<");
	}
	
	
	
}

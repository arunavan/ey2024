package com.ey;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/rose")
public class MyFirstServlet extends GenericServlet implements Servlet {
	public void init(ServletConfig config) throws ServletException {
		System.out.println("serlet intitialized");
	}
	public void destroy() {
		System.out.println("serlet intitialized");
	}
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println(" Welcome to Servlet");
		out.println("<h1> Welcome to generic Servlet</h1>");
		
		
		
	}

}

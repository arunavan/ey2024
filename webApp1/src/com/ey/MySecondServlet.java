package com.ey;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/lilly")
public class MySecondServlet extends HttpServlet {
	public void init(ServletConfig config) throws ServletException {
	}
	public void destroy() {
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("<h1> Welcome to Http Servlet </h1>");
		String id=request.getParameter("id");
		String pwd=request.getParameter("pwd");
		if(id.equals("ey") && pwd.equals("ey"))
			out.println( "Login success, valid credentials");
		else
			out.println(" Login failue , try again");
	}
}
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@include file="client.html" %>
    
    <%
     out.println("welcome to JSP");
    String id=request.getParameter("id");
	String pwd=request.getParameter("pwd");
	if(id.equals("ey") && pwd.equals("ey"))
		out.println( "<bR><h1>Login success,in JSP.............</h1>");
	else
		out.println("<br><h1> Login failue ,in JSP .............</h1>");
     %>
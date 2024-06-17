<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h1>   first page : Home  </h1>

<jsp:forward page="dashboard.jsp">

  <jsp:param name="pid" value="101"/>
</jsp:forward>
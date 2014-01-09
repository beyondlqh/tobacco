<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.io.File"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%
	String pid = (String) request.getAttribute("PID");
%>
<body>
	<img src=<%=request.getContextPath() + File.separator + pid + ".gif"%> alt="">
	<input type="button" value="打印" onclick="window.print()">
</body>
</html>
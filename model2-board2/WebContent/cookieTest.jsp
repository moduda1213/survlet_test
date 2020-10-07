<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Cookie cookie = new Cookie("id","admin");
		cookie.setMaxAge(60*60*24);
		response.addCookie(cookie);	
	%>
	<a href ="cooke_read.jsp">[쿠키읽기]</a>
</body>
</html>
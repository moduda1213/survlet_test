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
	Cookie[] cookies = request.getCookies();
	for(int i=0;i<cookies.length;i++){
		if(cookies[i].getName().equals("id")){
			Cookie c = new Cookie("id","");
			c.setMaxAge(0);
			response.addCookie(c);
%>
쿠키id 삭제
<%
		}else if(cookies[i].getName().equals("pw")){
			Cookie c = new Cookie("pw","");
			c.setMaxAge(0);
			response.addCookie(c);
%>
			쿠키pw삭제
<%
		}
	}
%>
</body>
</html>
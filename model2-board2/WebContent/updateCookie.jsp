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
		if(cookies[i].getName().equals("pw")){
			Cookie c = new Cookie("pw","5678");
			response.addCookie(c);
%>
			쿠키(pw)가 수정되었습니다.
<%
		}
	}
%>
</body>
</html>
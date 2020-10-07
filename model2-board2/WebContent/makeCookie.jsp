<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">

<title>Insert title here</title>
</head>
<body>
<%
	Cookie c1 = new Cookie("id","zeroDay");
	response.addCookie(c1);
	Cookie c2 = new Cookie("pw","1234");
	response.addCookie(c2);
	
%>
쿠키 (zeroDay/1234)가 저장되었습니다.
</body>
</html>
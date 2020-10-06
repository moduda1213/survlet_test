<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<title>boardList</title>
</head>
<body>
	<div class ="container">
		<table class="table">
			<thead>
				<tr>
					<th>board_no</th>
					<th>board_title</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="b" items="${list}"> <!-- ${} session, attribute 데이터를 가져온다 -->
					<tr>
						<td>${b.boardNo}</td> <!-- 필드에는 private로 잠겨져있지만 ${}표현식은 원 모습 그대로의 변수를 써야한다 -->
						<td>${b.boardTitle}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
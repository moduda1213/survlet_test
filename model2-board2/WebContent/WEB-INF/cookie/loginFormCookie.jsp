<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table, tr, td{
		border : 1px solid #000000;
	}
	table{
		margin:0 auto;
	}
	.center{
		text-align:center;
	}
</style>
</head>
<body>
	
<form method="post" action ="${pageContext.request.contextPath}/LoginAction">
<div class="center">
	<table>
		<tr>
			<td>ID</td>
			<td>
				<input type="text" name ="id">
			</td>
			<td rowspan="2">
				<input type="submit" value="login">
			</td>
		</tr>
		
		<tr>
			<td>PW</td>
			<td><input type="password" name="pw"></td>
		</tr>
		
		<tr>
			<td colspan="3">
				<input type="checkbox" name="save">ID/PW 저장
			</td>
		</tr>
	</table>
</div>
</form>
</body>
</html>
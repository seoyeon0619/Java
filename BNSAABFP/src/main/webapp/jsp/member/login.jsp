<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="LoginController" method="post" 
		name="loginForm" onsubmit="return loginCheck();">
		<table id="loginTbl">
			<tr>
				<td align="center">
					<input name="id" placeholder="id" maxlength="10" autocomplete="off">
				</td>
			</tr>
			<tr>
				<td align="center">
					<input name="pw" placeholder="pw" maxlength="10" type="password">
				</td>
			</tr>
			<tr>
				<td align="center">
					<button>�α���</button>
					<a href="JoinController">ȸ������</a>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
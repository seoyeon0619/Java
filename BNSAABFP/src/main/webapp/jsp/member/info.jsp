<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
		<table id="joinTbl">
	<form action="MemberInfoController" method="post"
		enctype="multipart/form-data"
	 	name="memberUpdateForm" onsubmit="return memberUpdateCheck();">
			<tr>
				<th>
					<input name="id" value="${sessionScope.loginMember.id }" class="boxType3" placeholder="id" readonly="readonly">
				</th>
			</tr>
			<tr>
				<td align="center">
					<input name="pw" value="${sessionScope.loginMember.pw }" class="boxType" placeholder="pw" type="password" maxlength="10">
				</td>
			</tr>
			<tr>
				<td align="center">
					<input name="pwChk" value="${sessionScope.loginMember.pw }" class="boxType" placeholder="pwȮ��" type="password" maxlength="10">
				</td>
			</tr>
			<tr>
				<td align="center">
					<input name="name" value="${sessionScope.loginMember.name }" class="boxType" placeholder="�̸�" maxlength="10" autocomplete="off">
				</td>
			</tr>
			<tr>
				<td align="center">
					�������
					<select name="y" class="selectType">
						<option>${year }</option>
						<c:forEach var="yy" begin="${curYear - 50 }" end="${curYear }">
							<option>${yy }</option>
						</c:forEach>
					</select>��&nbsp;&nbsp;
					<select name="m" class="selectType">
						<option>${month }</option>
						<c:forEach var="mm" begin="1" end="12">
							<option>${mm }</option>
						</c:forEach>
					</select>��&nbsp;&nbsp;
					<select name="d" class="selectType">
						<option>${day }</option>
						<c:forEach var="dd" begin="1" end="31">
							<option>${dd }</option>
						</c:forEach>
					</select>��
				</td>
			</tr>
			<tr>
				<td align="center">
					<input name="addr1" value="${addr1 }" class="boxType" placeholder="�����ȣ"><br>
					<input name="addr2" value="${addr2 }" class="boxType" placeholder="�ּ�"><br>
					<input name="addr3" value="${addr3 }" class="boxType" placeholder="���ּ�">
				</td>
			</tr>
			<tr>
				<td align="center">
					<table id="pSaUpdateTbl">
						<tr>
							<td align="center" rowspan="2" class="td1">����</td>
							<td class="td2">
								<img src="img/${sessionScope.loginMember.photo }">
							</td>
						</tr>
						<tr>
							<td><input name="photo" type="file" class="boxType4"></td>						
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td align="center">
					<button style="width:40%;">��������</button>
	</form>
					<button onclick="bye();" style="width:40%;">Ż��</button>
				</td>
			</tr>
		</table>
</body>
</html>
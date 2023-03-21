<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>���ü�� ��Ʈ��ũ ������ ������ AI ���� ��� Ǯ���� ������ ī��</title>
<link rel="stylesheet" href="css/index.css">
<link rel="stylesheet" href="css/member.css">
<link rel="stylesheet" href="css/sns.css">
<script type="text/javascript" src="js/kwonValidChecker.js"></script>
<script type="text/javascript" src="js/bnsaabfpCheck.js"></script>
<script type="text/javascript" src="js/bnsaabfpMove.js"></script>
</head>
<body>
	<table id="siteTitleArea">
		<tr>
			<td align="center">
				<table>
					<tr>
						<td>
							<a href="HomeController">
								<span class="bigTitle">���ü�� ��Ʈ��ũ</span> ������ ������ <span class="bigTitle">AI</span> ���� ��� <span class="bigTitle">Ǯ���� ������</span> ī�� <span id="v">v1.0</span>
							</a>
						</td>
					</tr>
					<tr>
						<td align="right" id="result">
							${r }&nbsp;
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
	<table id="siteContentArea">
		<tr>
			<td align="center">
				<jsp:include page="${contentPage }"></jsp:include>
			</td>
		</tr>
	</table>
	<table id="siteMenuArea">
		<tr>
			<td align="center" id="startBtn">
				<img src="img/window.png">
			</td>
			<td>
				<jsp:include page="${subMenuPage }"></jsp:include>
				<jsp:include page="${loginMenuPage }"></jsp:include>
			</td>
		</tr>
	</table>
	<table id="siteMenuArea2">
		<tr>
			<td align="center" colspan="2">
				<jsp:include page="${loginPage }"></jsp:include>
			</td>
		</tr>
		<tr class="menuTr">
			<td class="td1" align="center">
				<img src="img/dataroom.png">
			</td>
			<td class="td2">�ڷ��</td>
		</tr>
		<tr class="menuTr">
			<td class="td1" align="center">
				<img src="img/gallery.png">
			</td>
			<td class="td2">������</td>
		</tr>
		<tr class="menuTr">
			<td class="td1" align="center">
				<img src="img/brush.png">
			</td>
			<td class="td2">����</td>
		</tr>
		<tr>
			<td align="right" colspan="2" style="padding-right: 7px; padding-bottom: 15px; font-size: 11pt;">Programmed by<br>
			�Ǳ��</td>
		</tr>
	</table>
</body>
</html>
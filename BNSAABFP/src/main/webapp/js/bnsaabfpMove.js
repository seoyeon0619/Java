function bye() {
	var really = prompt("��¥ Ż���ҰŸ� ������� �Է��Ͻÿ�.");
	if (really == "����") {
		location.href = "ByeController";
	}
}

function snsPageChange(p) {
	location.href = "SNSPageController?p=" + p;
}

function snsMsgDelete(no) {
	var really = confirm("��¥?");
	if (really) {
		location.href = "SNSDeleteController?no=" + no;
	}
}

function snsMsgUpdate(no, txt, p) {
	txt = prompt("������ ����", txt);
	if (txt != null && txt.length > 0 && txt.length < 450) {
		location.href = "SNSUpdateController?no=" + no + "&txt=" + txt + "&p=" + p;
	}
}

function snsReplyDelete(no, p) {
	var really = confirm("��¥?");
	if (really) {
		location.href = "SNSReplyDeleteController?no=" + no + "&p=" + p;
	}
}












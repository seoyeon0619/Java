package com.kwon.bnsaabfp.member;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;

import com.kwon.bnsaabfp.home.DateManager;
import com.kwon.bnsaabfp.sns.SNSDAO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import kiung.kwon.db.manager.KwonDBManager;

public class MemberDAO {
	private static final MemberDAO MDAO = new MemberDAO();

	public static MemberDAO getMdao() {
		return MDAO;
	}

	private MemberDAO() {
		// TODO Auto-generated constructor stub
	}

	public void bye(HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = KwonDBManager.hi("kwonPool");
			Member m = (Member) req.getSession().getAttribute("loginMember");
			String sql = "delete from bnsaabfp_member where m_id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, m.getId());

			// Ż�� ���� ���� �������
			int memberMsgCount = SNSDAO.getSdao().getMemberMsgCount(m.getId());

			if (pstmt.executeUpdate() == 1) { // �� ����� �� ���� �ڵ����� �� ����
				req.setAttribute("r", "����");
				// Ż�� �����ϸ� �׸�ŭ ���
				SNSDAO.getSdao().setAllMsgCount(memberMsgCount);

				String path = req.getSession().getServletContext().getRealPath("img");
				String photo = URLDecoder.decode(m.getPhoto(), "euc-kr");
				new File(path + "/" + photo).delete();
			} else {
				req.setAttribute("r", "Ż�� ����");
			}
		} catch (Exception e) {
			req.setAttribute("r", "Ż�� ����");
		}
		KwonDBManager.bye(con, pstmt, null);
	}

	public void getInfo(HttpServletRequest req) {
		Member m = (Member) req.getSession().getAttribute("loginMember");
		DateManager.getDate(m.getBirthday(), req);

		String[] addr = m.getAddr().split("!");
		req.setAttribute("addr1", addr[2]);
		req.setAttribute("addr2", addr[0]);
		req.setAttribute("addr3", addr[1]);
	}

	public boolean isLogined(HttpServletRequest req) {
		Member m = (Member) req.getSession().getAttribute("loginMember");
		if (m != null) {
			req.setAttribute("loginPage", "member/welcome.jsp");
			req.setAttribute("loginMenuPage", "member/welcomeMenu.jsp");
			return true;
		}
		req.setAttribute("loginPage", "member/login.jsp");
		req.setAttribute("loginMenuPage", "member/loginMenu.jsp");
		return false;
	}

	public void join(HttpServletRequest req) {
		String path = req.getSession().getServletContext().getRealPath("img");

		MultipartRequest mr = null;
		try {
			mr = new MultipartRequest(req, path, 10485760, "euc-kr", new DefaultFileRenamePolicy());
		} catch (Exception e) {
			req.setAttribute("r", "���� ����[����]");
			return;
		}

		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = KwonDBManager.hi("kwonPool");

			String id = mr.getParameter("id");
			String pw = mr.getParameter("pw");
			String name = mr.getParameter("name");
			String y = mr.getParameter("y"); // "1988"
			String m = mr.getParameter("m"); // "1"
			int m2 = Integer.parseInt(m); // 1
			String d = mr.getParameter("d"); // "3"
			int d2 = Integer.parseInt(d); // 3
			String birthday = String.format("%s%02d%02d", y, m2, d2); // "19880103"
			String addr1 = mr.getParameter("addr1"); // "12345"
			String addr2 = mr.getParameter("addr2"); // "����� ������ ������� 119"
			String addr3 = mr.getParameter("addr3"); // "�������� 5��"
			String addr = addr2 + "!" + addr3 + "!" + addr1;
			// "����� ������ ������� 119-123!�������� 5��!12345"

			String photo = mr.getFilesystemName("photo");
			photo = URLEncoder.encode(photo, "euc-kr").replace("+", " ");

			String sql = "insert into bnsaabfp_member values(?, ?, ?, to_date(?, 'YYYYMMDD'), ?, ?)";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, name);
			pstmt.setString(4, birthday);
			pstmt.setString(5, addr);
			pstmt.setString(6, photo);

			if (pstmt.executeUpdate() == 1) {
				req.setAttribute("r", "���� ����");
			} else {
				req.setAttribute("r", "���� ����");
			}
		} catch (Exception e) {
			req.setAttribute("r", "���� ����[DB]");

			// �̹� ���ε� �Ǿ����� �������� ����[�� java��]
			new File(path + "/" + mr.getFilesystemName("photo")).delete();
		}
		KwonDBManager.bye(con, pstmt, null);
	}

	public void login(HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = KwonDBManager.hi("kwonPool");

			req.setCharacterEncoding("euc-kr");
			String id = req.getParameter("id");
			String pw = req.getParameter("pw");

			String sql = "select * from bnsaabfp_member where m_id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				String dbPW = rs.getString("m_pw");
				if (pw.equals(dbPW)) {
					Member m = new Member(id, pw, rs.getString("m_name"), rs.getDate("m_birthday"),
							rs.getString("m_addr"), rs.getString("m_photo"));

					req.getSession().setAttribute("loginMember", m);
					req.getSession().setMaxInactiveInterval(15 * 60);
				} else {
					req.setAttribute("r", "�α��� ����[PW]");
				}
			} else {
				req.setAttribute("r", "�α��� ����[�̰���ID]");
			}
		} catch (Exception e) {
			req.setAttribute("r", "�α��� ����[DB]");
		}
		KwonDBManager.bye(con, pstmt, rs);
	}

	public void logout(HttpServletRequest req) {
		// ���� ����
		// req.getSession().setMaxInactiveInterval(-1);
		req.getSession().setAttribute("loginMember", null);
	}

	public void update(HttpServletRequest req) {
		String path = req.getSession().getServletContext().getRealPath("img");

		MultipartRequest mr = null;
		try {
			mr = new MultipartRequest(req, path, 10485760, "euc-kr", new DefaultFileRenamePolicy());
		} catch (Exception e) {
			req.setAttribute("r", "���� ��������[����]");
			return;
		}

		Member member = (Member) req.getSession().getAttribute("loginMember");
		String oldPhoto = member.getPhoto();
		String newPhoto = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = KwonDBManager.hi("kwonPool");

			String id = mr.getParameter("id");
			String pw = mr.getParameter("pw");
			String name = mr.getParameter("name");
			String y = mr.getParameter("y");
			String m = mr.getParameter("m");
			int m2 = Integer.parseInt(m);
			String d = mr.getParameter("d");
			int d2 = Integer.parseInt(d);
			String birthday = String.format("%s%02d%02d", y, m2, d2);
			String addr1 = mr.getParameter("addr1");
			String addr2 = mr.getParameter("addr2");
			String addr3 = mr.getParameter("addr3");
			String addr = addr2 + "!" + addr3 + "!" + addr1;
			newPhoto = mr.getFilesystemName("photo");
			if (newPhoto == null) {
				newPhoto = oldPhoto;
			} else {
				newPhoto = URLEncoder.encode(newPhoto, "euc-kr").replace("+", " ");
			}

			String sql = "update bnsaabfp_member " + "set m_pw = ?, m_name = ?, "
					+ "m_birthday = to_date(?, 'YYYYMMDD'), m_addr = ?, m_photo = ? " + "where m_id = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, pw);
			pstmt.setString(2, name);
			pstmt.setString(3, birthday);
			pstmt.setString(4, addr);
			pstmt.setString(5, newPhoto);
			pstmt.setString(6, id);

			if (pstmt.executeUpdate() == 1) {
				req.setAttribute("r", "���� ����");
				if (!oldPhoto.equals(newPhoto)) {
					oldPhoto = URLDecoder.decode(oldPhoto, "euc-kr");
					new File(path + "/" + oldPhoto).delete();
				}
				SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
				Member newMember = new Member(id, pw, name, sdf.parse(birthday), addr, newPhoto);
				req.getSession().setAttribute("loginMember", newMember);
			} else {
				req.setAttribute("r", "���� ����");
				if (!oldPhoto.equals(newPhoto)) {
					newPhoto = URLDecoder.decode(newPhoto, "euc-kr");
					new File(path + "/" + newPhoto).delete();
				}
			}
		} catch (Exception e) {
			req.setAttribute("r", "���� ����[DB]");
			if (!oldPhoto.equals(newPhoto)) {
				try {
					newPhoto = URLDecoder.decode(newPhoto, "euc-kr");
					new File(path + "/" + newPhoto).delete();
				} catch (UnsupportedEncodingException e1) {
				}
			}
		}
		KwonDBManager.bye(con, pstmt, null);

	}
}

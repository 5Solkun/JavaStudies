package miniProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class memberDAO {
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "dev";
	String pass = "dev";

	Connection conn;
	Statement stmt = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	String sql;
	public void conclose() {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void connect() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, user, pass);
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("에러발생.");
			e.printStackTrace();
		}
	}
// C(reate), R(ead), U(pdate), D(elete) 처리.

	// 목록조회.
	public List<Map<String, Object>> empList() {
		sql = "select * from BJ_MEMBER";
		connect();
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Map<String, Object> map = new HashMap<>();
				map.put("member_num", rs.getInt("member_num"));
				map.put("member_id", rs.getString("member_id"));
				map.put("member_pw", rs.getString("member_pw"));
				map.put("money", rs.getInt("money"));
				list.add(map);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		conclose();
		return list;
		
	}

	// List<Map<String, Object>> 비교.
	public List<MemberForm> memVoList() {
		connect();
		sql = "select * from BJ_MEMBER";
		List<MemberForm> list = new ArrayList<>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				MemberForm mem = new MemberForm();
				mem.setMemberID(rs.getString("member_id"));
				mem.setMoney(rs.getInt("money"));
				list.add(mem);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		conclose();
		return list;
	}

	// 단건조회.
	public MemberForm getMem(String id) {
		sql = "select * from bj_member where member_id ='" + id + "'";
		connect();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				MemberForm mem = new MemberForm();
				mem.setMemberID(rs.getString("member_id"));
				mem.setMoney(rs.getInt("money"));
				conclose();
				return mem;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		conclose();
		return null; // 조회된 데이터 없음.
	}

	// 입력.
	public int addMem(MemberForm mem) {
		connect();
		sql = "insert into BJ_MEMBER (member_id,member_pw) " //
				+ "values(?, ?)";
		int r = 0;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, mem.getMemberID());
			psmt.setString(2, mem.getMemberPW());
			r = psmt.executeUpdate(); // 처리된 건수.
		} catch (SQLException e) {
			//e.printStackTrace();
		}
		conclose();
		return r;
	}

	// 수정.
	public int updateEmp(String id, int bet, boolean win) {
		connect();
		sql = "select * from bj_member where member_id ='" + id + "'";
		int r = 0;
		int money = 0;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
			money = rs.getInt("money");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		sql = "update BJ_MEMBER set money = ? where member_ID = ?";
		try {
			psmt = conn.prepareStatement(sql);
			if (win)
				psmt.setInt(1, money + bet);
			else
				psmt.setInt(1, money - bet);
			psmt.setString(2, id);
			r = psmt.executeUpdate(); // 처리된 건수.
		} catch (SQLException e) {
			e.printStackTrace();
		}
		conclose();
		return r;

	}

	public boolean login(String id, String pw) {
		sql = "select * from bj_member where (member_id ='" + id + "')AND (member_pw = '" + pw + "')";
		connect();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				conclose();
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		conclose();
		return false; // 조회된 데이터 없음.
	}

	public int deleteEmp(int id) {
		connect();
		sql = "delete from BJ_Member where member_ID = ?";
		int r = 0;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, id);
			r = psmt.executeUpdate(); // 처리된 건수.
		} catch (SQLException e) {
			e.printStackTrace();
		}
		conclose();
		return r;

	}

	// 삭제.

}

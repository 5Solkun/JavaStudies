package miniProject;

import java.util.List;
import java.util.Scanner;

public class RunBlackJack {
	public static void run() {
		Scanner scn = new Scanner(System.in);
		memberDAO dao = new memberDAO();
		String currentID = null;
		while (true) {
			BigText.print("CLS");
			BigText.print("T");
			System.out.println("====================================================================================================================");
			System.out.println("|1|로그인 \t|2|내정보 보기 \t|3|회원가입 \t|4|게임하기 \t|5|플레이어 목록 \t|8|로그아웃 \t|9|종료");
			System.out.println("=====================================================================================================================");
			int menu = Integer.parseInt(scn.nextLine());

			if (menu == 1) {
				BigText.print("CLS");
				BigText.print("LOGIN");
				System.out.println("ID>> ");
				String id = scn.nextLine();
				System.out.println("PW>> ");
				String pw = scn.nextLine();

				if (dao.login(id, pw)) {
					System.out.println("로그인 성공!!");
					currentID = id;
					System.out.println("환영합니다" + currentID + "님");
				} else {
					System.out.println("처리중에러!! 아이디와 비밀번호를 다시 확인해주세요!");
				}
				scn.nextLine();

			} else if (menu == 8) {
				currentID = null;
				BigText.print("CLS");
				BigText.print("LOGOUT");
				scn.nextLine();
			}

			else if (menu == 4) {
				if (currentID != null) {
					System.out.println("배팅금액>>");
					int bet = Integer.parseInt(scn.nextLine());
					char wdl = BlackJack.game();
					if (wdl == 'w') {
						if (dao.updateEmp(currentID, bet, true) > 0) {
							System.out.println(+bet + "획득");

						} else {
							System.out.println("처리중에러!!");
						}
					}
					if (wdl == 'l') {
						if (dao.updateEmp(currentID, bet, false) > 0) {
							System.out.println(-bet + "손실");

						} else {
							System.out.println("처리중에러!!");
						}
					}
				} else
					System.out.println("로그인 먼저해주세요!");
				scn.nextLine();

			} else if (menu == 3) { // 회원가입
				BigText.print("CLS");
				BigText.print("SIGN");
				System.out.println("ID>> ");
				String id = scn.nextLine();
				System.out.println("PW>> ");
				String pw = scn.nextLine();

				MemberForm mem = new MemberForm();
				mem.setMemberID(id);
				mem.setMemberPW(pw);

				if (dao.addMem(mem) > 0) {
					System.out.println("가입 성공!!");
				} else {
					System.out.println("처리중에러!! 길이가너무길거나 아이디가 중복됩니다");
				}
				scn.nextLine();

			} else if (menu == 2) {
				// 단건조회.
				
				String uid = currentID;
				// 사용자 입력값을 받아서 처리.

				MemberForm mem = dao.getMem(uid);
				if (mem == null) {
					System.out.println("조회된 정보 없음!! 로그인해주세요!!");
					scn.nextLine();
					continue;
				} // 반환유형: EmpVO
				System.out.println("결과: " + mem);
				scn.nextLine();

			} else if (menu == 5) {
				BigText.print("CLS");
				BigText.print("PLAYERS");
				List<MemberForm> list = dao.memVoList();
				for (MemberForm mem : list) {
					System.out.println(mem.toString());
				}
				scn.nextLine();

			} else if (menu == 9) {
				// 종료.
				break;
			}
		} // end of while()
		BigText.print("CLS");
		BigText.print("GB");
	}
}

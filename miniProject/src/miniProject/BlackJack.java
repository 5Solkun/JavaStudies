package miniProject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BlackJack {
//	public static void main(String[] args) {
//		game();
//	}
	public static char game() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> dealer = new ArrayList<Integer>();
		ArrayList<Integer> player = new ArrayList<Integer>();
		dealer.add(drawCard(player, dealer));
		player.add(drawCard(player, dealer));
		player.add(drawCard(player, dealer));
		printTable(player, dealer);
		while (!gameOverCheck(player)) {
			System.out.println("| HIT : ENTER | STAY :아무키나 입력후 ENTER |");
			String sel = sc.nextLine();
			if (sel == "") {
				player.add(drawCard(player, dealer));
				printTable(player, dealer);
			} else {
				break;
			}
		}
		while (handScore(dealer) < 17) {
			dealer.add(drawCard(player, dealer));
		}
		printTable(player, dealer);
		return winLose(player, dealer);
	}

	public static char winLose(ArrayList<Integer> player, ArrayList<Integer> dealer) {
		if (handScore(player) == 21 && handScore(dealer) == 21) { // 둘다블랙잭
			BigText.print("DR");
			return 'd';
		} else if (handScore(player) == 21) { // 플레이어만 블랙잭
			BigText.print("BJ");
			return 'w';
		}
		if (handScore(player) > 21 && handScore(dealer) > 21) { // 둘다 버스트
			BigText.print("DR");
			return 'd';
		} else if (handScore(player) > 21 && handScore(dealer) <= 21) { // 플레이어만 버스트
			BigText.print("PB");
			return 'l';
		} else if (handScore(player) <= 21 && handScore(dealer) > 21) { // 딜러만 버스트
			BigText.print("DB");
			return 'w';
		} else if (handScore(player) > handScore(dealer)) { // 점수비교 승리
			BigText.print("WIN");
			return 'w';
		} else if (handScore(player) == handScore(dealer)) { // 점수비교 무승부
			BigText.print("DR");
			return 'd';
		} else if (handScore(player) < handScore(dealer)) { // 점수비교 패배
			BigText.print("LOSE");
			return 'l';
		} else
			return 'd';

	}

	public static boolean gameOverCheck(ArrayList<Integer> player) {
		if (handScore(player) == 21 || handScore(player) > 21) {
			return true;
		} else
			return false;

	}

	public static void printTable(ArrayList<Integer> player, ArrayList<Integer> dealer) {
		BigText.print("CLS");
		System.out.println("======딜러의 카드=====");
		printHand(dealer);
		System.out.println("딜러의 점수:" + handScore(dealer));
		System.out.println("====플레이어의 카드====");
		printHand(player);
		System.out.println("딜러의 점수:" + handScore(dealer));
		System.out.println("플레이어의 점수:" + handScore(player));

	}


	public static void printHand(ArrayList<Integer> hand) {
		for (int i : hand) {
			Cards.PrintCard(Cards.Deck[i]);
		}
	}

	public static int handScore(ArrayList<Integer> hand) {
		int score = 0;
		for (int i : hand) {
			String t[] = Cards.Deck[i].split("-");
			int b = Integer.parseInt(t[1]);
			if (b > 10) {
				score += 10;
			} else
				score += b;

		}
		return score;
	}

	public static int drawCard(ArrayList<Integer> player, ArrayList<Integer> dealer) {// 중복이 없는 랜덤 인덱스값 찾아서 출력
		while (true) {
			boolean overlap = false;
			int indexDeck = (int) (Math.random() * 51);
			for (int i : player) {
				if (i == indexDeck) {
					overlap = true;
				}
			}
			for (int i : dealer) {
				if (i == indexDeck) {
					overlap = true;
				}
			}
			if (overlap == false) {
				return indexDeck;
			}
		}
	}
}

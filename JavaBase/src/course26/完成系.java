package course26;

import java.util.Random;
import java.util.Scanner;

public class 完成系 {
	public static void main(String[] args) {
		int gamecount = 0;
		int losecount = 0;
		int wincount = 0;
		int syoji = 1000;
		syojikinn(syoji);
		int kard = caer1();
		int kard2 = caer2();
		System.out.println("現在のカードは" + kard + "です");
		Scanner stdIn = new Scanner(System.in);
		System.out.println("次のカードの数値は低い(2)か、そろとも高い(1)か。");
		int moji = stdIn.nextInt();
		System.out.println("現在のカード：" + kard);
		System.out.println("次のカード：" + kard2);
		String shouhai = shouhai(kard, kard2, moji);
		if (shouhai.equals("WIN")) {
			gamecount = gamecount + 1;
			wincount = wincount + 1;
		} else {
			gamecount = gamecount + 1;
			losecount = losecount + 1;
		}
		System.out.println(shouhai);
		int shoritu = syoritu1(gamecount, wincount);
		System.out.println("勝率は" + shoritu + "%です");
		dispResult(gamecount, wincount, losecount);
		System.out.println("終わるなら9999、続けるならそれ以外の数字を入力してください");
		int keizoku = stdIn.nextInt();
		if (keizoku == 9999) {
			System.out.println("END");
		} else {
			System.out.println("CONT");
		}
		System.out.println(syoji);
	}

	static void syojikinn(int b) {
		System.out.println("現在の所持金は" + b + "です");
	}

	static int caer1() {
		Random rnd = new Random();
		int b = rnd.nextInt(13) + 1;
		return b;
	}

	static int caer2() {
		Random rnd = new Random();
		int d = rnd.nextInt(13) + 1;
		return d;
	}

	static String shouhai(int x, int y, int z) {
		String hantei = "";
		if (x < y) {
			if (z == 1) {
				hantei = "WIN";
			} else {
				hantei = "LOSE";
			}
		} else {
			if (z == 2) {
				hantei = "WIN";
			} else {
				hantei = "LOSE";
			}
		}
		return hantei;
	}

	static int syoritu1(int game, int win) {
		int syoritu2 = win / game;
		int syoritu3 = syoritu2 * 100;
		return syoritu3;
	}

	static void dispResult(int game, int win, int lose) {
		System.out.println("ゲーム数は" + game + "です");
		System.out.println("勝利数は" + win + "です");
		System.out.println("敗北数は" + lose + "です");
	}
}
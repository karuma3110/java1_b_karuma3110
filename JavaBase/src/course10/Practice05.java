package course10;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);
		System.out.println("xの値を入力してね。");
		int x = stdIn.nextInt();
		System.out.println("yの値を入力してね。");
		int y = stdIn.nextInt();

		if (x > y) {
			System.out.println("xの方がでかい！なぜならxは" + x + "でyは" + y + "だから");
		}

		else if (x < y) {
			System.out.println("yの方がでかい！なぜならyは" + y + "でxは" + x + "だから");
		}

		else if (x == y) {
			System.out.println("おなじ～");
		}
	}

}

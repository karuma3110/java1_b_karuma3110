package course57;

import java.util.Random;
import java.util.Scanner;

public class Kakiko {
	public static void main(String[] args) {

		Random rnd = new Random();
		int ransu = rnd.nextInt(100) + 1;

		for (int i = 1; i <= 999; i++) {
			System.out.println("現在のカウントは" + i);
			Scanner stdIn = new Scanner(System.in);
			System.out.println("数値を入力してね！");
			int a = stdIn.nextInt();
			if (ransu < a) {
				System.out.println("答えはもっと小さい数値");
			}
			if (ransu > a) {
				System.out.println("答えはもっと大きい数値");
			}
			if (ransu == a) {
				System.out.println("当たり！答えは" + ransu + "です");
				i = 999;
			}
		}
	}
}

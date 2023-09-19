package course10;

import java.util.Scanner;

public class Practice08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);
		System.out.println("1つ目の数値を入力してね。");
		int a = stdIn.nextInt();
		System.out.println("2つ目の数値を入力してね。");
		int b = stdIn.nextInt();
		System.out.println("3つ目の数値を入力してね。");
		int c = stdIn.nextInt();

		if (a > b && b > c) {
			System.out.println(a + "が1番大きい数値です。");
			System.out.println(b + "が2番大きい数値です。");
			System.out.println(c + "が3番大きい数値です。");
		} else if (a > b && b < c) {
			System.out.println(c + "が1番大きい数値です。");
			System.out.println(a + "が2番大きい数値です。");
			System.out.println(b + "が3番大きい数値です。");
		} else if (a < c && c < b) {
			System.out.println(b + "が1番大きい数値です。");
			System.out.println(c + "が2番大きい数値です。");
			System.out.println(a + "が3番大きい数値です。");
		}
	}
}
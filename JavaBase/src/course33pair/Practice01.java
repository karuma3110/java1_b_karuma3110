package course33pair;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);

		String moji = "私はJavaを勉強中です";
		System.out.println(moji);

		String a = stdIn.next();
		System.out.println(a);

		//C
		/*if (b > 49) {
			System.out.println("50以上です。");
		} else {
			System.out.println("49以下です。");
		}*/

		int x = stdIn.nextInt();
		int[] variable = new int[x];

		int z = calc(100, 50);
		System.out.println(z);

	}

	static int calc(int x, int y) {
		return x + y;
	}

}

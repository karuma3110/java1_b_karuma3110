package course10;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("私はJavaを勉強中です。");

		int x = 50;
		int y = 100;
		int z = x * y;
		System.out.println(z);

		Scanner stdIn = new Scanner(System.in);
		System.out.println("数値を入力してね。");
		int a = stdIn.nextInt();
		int b = 100;
		System.out.println(a * b);

		System.out.println("文字を入力してね。");
		String c = stdIn.next();
		String d = ("と入力しました");
		System.out.println(c + d);

	}

}

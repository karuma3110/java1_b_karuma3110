package course26;

import java.util.Random;

public class Eカードパーツ {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int a = caer1();
		System.out.println(a);
		int c = caer2();
		System.out.println(c);
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
}

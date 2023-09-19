package course55;

import java.util.Scanner;

public class TyphoonControll {
	static Typhoon[] typhoonList = new Typhoon[15];

	public static void main(String[] args) {

		Typhoon kaze1 = new Typhoon(1, "2022年4月8日", "マラカス");
		Typhoon kaze2 = new Typhoon(2, "2022年4月10日", "メーギー");
		Typhoon kaze3 = new Typhoon(3, "2022年6月30日", "チャバ");
		Typhoon kaze4 = new Typhoon(4, "2022年7月1日", "アイレー");
		Typhoon kaze5 = new Typhoon(5, "2022年7月28日", "ソングダー");
		Typhoon kaze6 = new Typhoon(6, "2022年7月31日", "トローセス");
		Typhoon kaze7 = new Typhoon(7, "2022年8月9日", "ムーラン");
		Typhoon kaze8 = new Typhoon(8, "2022年8月12日", "メアリー");
		Typhoon kaze9 = new Typhoon(9, "2022年8月22日", "マーゴン");

		typhoonList[0] = kaze1;
		typhoonList[1] = kaze2;
		typhoonList[2] = kaze3;
		typhoonList[3] = kaze4;
		typhoonList[4] = kaze5;
		typhoonList[5] = kaze6;
		typhoonList[6] = kaze7;
		typhoonList[7] = kaze8;
		typhoonList[8] = kaze9;

		Scanner stdIn = new Scanner(System.in);
		for (int a = 0; a <= 100; a++) {
			System.out.println("0:今までの台風情報");
			System.out.println("55:新規モード");
			System.out.println("99:編集モード");
			System.out.println("100:終了");

			int b = stdIn.nextInt();
			if (b == 0) {

				for (int i = 0; i < 9; i++) {
					System.out.println(typhoonList[i].getAsiaName());
				}
			}
			if (b == 99) {
				System.out.println("台風番号を指定してね！");
				int c = stdIn.nextInt();
				c--;
				System.out.println("台風の名前を入れてね！");
				String d = stdIn.next();
				typhoonList[c].setAsiaName(d);
			}
			if (b == 55) {
				System.out.println("台風番号を指定してね！");
				int e = stdIn.nextInt();
				e--;
				System.out.println("台風番号を入力してね！");
				int f = stdIn.nextInt();
				System.out.println("台風発生日を入力してね！");
				String g = stdIn.next();
				System.out.println("台風名を入力してね！");
				String h = stdIn.next();
				Typhoon newkaze = new Typhoon(f, g, h);
				typhoonList[9] = newkaze;
				typhoonList[10] = newkaze;
				typhoonList[11] = newkaze;
				typhoonList[12] = newkaze;
				typhoonList[13] = newkaze;
				typhoonList[14] = newkaze;
				typhoonList[15] = newkaze;
			}
			if (b == 100) {
				a = 101;
			}
		}
	}
}

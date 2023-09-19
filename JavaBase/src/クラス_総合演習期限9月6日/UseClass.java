package クラス_総合演習期限9月6日;

import java.util.Scanner;

public class UseClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Trainer trainer = new Trainer();
		trainer.name = "kk";
		Scanner stdIn = new Scanner(System.in);
		Pocketon pokemon = new Pocketon("", "", 0, 0);
		for (int i = 1; i <= 99;) {
			System.out.println("メニューを選んでください！");
			System.out.println("1:捕獲");
			System.out.println("2:図鑑を見る");
			System.out.println("3:バトル");

			int a = stdIn.nextInt();
			if (a == 1) {
				System.out.println("ポケトンの名前を入れてね！");
				pokemon.name = stdIn.next();
				System.out.println("ポケトンのタイプを火or水or地面or草から選んでね！");
				pokemon.type = stdIn.next();
				System.out.println("ポケトンの戦闘力を入れてね！");
				pokemon.power = stdIn.nextInt();
				System.out.println("捕獲難易度を入力してね！");
				pokemon.diffcult = stdIn.nextInt();
				trainer.capture(pokemon);
				trainer.display();
			} else if (a == 2) {
				trainer.display();
			} else if (a == 3) {
				try {
					if (pokemon.getted >= 2) {
						System.out.println("1匹目の名前を入れてね！");
						String b = stdIn.next();
						System.out.println("2匹目の名前を入れてね！");
						String c = stdIn.next();
						int t;
						for (t = 0; (!(b.equals(trainer.myPockes[t].name))) && t < pokemon.getted; t++) {
						}
						int s;
						for (s = 0; (!(c.equals(trainer.myPockes[s].name))) && s < pokemon.getted; s++) {
						}
						Battle sentou = new Battle();
						String winner = sentou.doBattle(trainer.myPockes[t], trainer.myPockes[s]);
						System.out.println(winner + "が勝ちました！！");
					}
				} catch (Exception e) {
					System.out.println("そのポケトンは手持ちに居ません！");
				}

			} else if (a == 99) {
				i = 999;
			}

		}
	}
}
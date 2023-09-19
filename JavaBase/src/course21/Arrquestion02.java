package course21;

import java.util.Scanner;

public class Arrquestion02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] quake = { 153, 127, 130, 109, 118, 164, 130, 103, 103, 104, 123, 141 };
		int[] rain = { 20, 58, 107, 87, 114, 187, 200, 59, 169, 441, 158, 94 };
		int[] typhooon = { 1, 1, 0, 0, 0, 1, 4, 5, 6, 4, 6, 1 };

		Scanner stdIn = new Scanner(System.in);
		System.out.println("見たい情報を選んでください。");
		System.out.println("1:地震件数 2:台風件数 3:降水量 4:全て");
		int a = stdIn.nextInt();

		System.out.println("年別か月別かを選んでください。");
		System.out.println("1:年別 2:月別 3:年別(大きい順に表示) 4:全て");
		int b = stdIn.nextInt();
		if (a == 1) {
			if (b == 1) {
				//地震の件数年別
				int sum = 0;
				for (int i = 0; i < 12; i++) {
					sum = sum + quake[i];
				}
				System.out.println("1年間に起こった地震の総合計は" + sum + "件です");
			} else if (b == 2) {
				//地震の月別
				System.out.println("見たい月を入力してください");
				int c = stdIn.nextInt();
				System.out.println(c + "月の地震件数は" + quake[c - 1] + "です。");
			}
		}
		if (a == 2) {
			if (b == 1) {
				//台風の件数の年別
				int sum = 0;
				for (int x = 0; x < 12; x++) {
					sum = sum + typhooon[x];
				}
				System.out.println("1年間に起こった台風の総合計は" + sum + "件です");
			} else if (b == 2) {
				//台風の月別
				System.out.println("見たい月を入力してください");
				int c = stdIn.nextInt();
				System.out.println(c + "月の台風件数は" + typhooon[c - 1] + "です。");
			}
		}
		if (a == 3) {
			if (b == 1) {
				//降水量の件数の年別
				int sum = 0;
				for (int z = 0; z < 12; z++) {
					sum = sum + rain[z];
				}
				System.out.println("1年間に起こった降水量の総合計は" + sum + "件です");
			} else if (b == 2) {
				//降水量の月別
				System.out.println("見たい月を入力してください");
				int c = stdIn.nextInt();
				System.out.println(c + "月の降水量件数は" + rain[c - 1] + "です。");
			}
		}
		if (a == 4) {
			if (b == 4) {
				for (int t = 0; t < 12; t++) {
					System.out.println((t + 1) + "月の地震は" + quake[t] + "件です。");
					System.out.println((t + 1) + "月の台風は" + typhooon[t] + "件です。");
					System.out.println((t + 1) + "月の降水量は" + rain[t] + "件です。");
				}

			}
		}
	}
}
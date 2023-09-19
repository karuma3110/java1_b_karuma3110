package 制作課題;

import java.util.Scanner;

public class 席 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);
		/*i,jに数値（１～３６）を入れる
		 * 被りがあってはいけない
		 * 被っているならもっかい入力
		 * ３６の席全て入力したら繰り返し処理の終了
		 */
		int[][] chair = new int[6][6];
		int[] banngou = new int[36];
		for (int a = 1; a <= banngou.length; a++) {
			banngou[a - 1] = a;
		}

		try {
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 6; j++) {
					System.out.println("数値を入力してね");
					int q = stdIn.nextInt();
					//１～３６であること確認する
					while (q < 1 || q > 36) {
						System.out.println("１～３６以外を入れないでね");
						q = stdIn.nextInt();
					}
					q--;
					//「banngou」配列に入ってる文字が０出ないこと確認する
					while (banngou[q] == 0) {
						System.out.println("数値を入力してね");
						q = stdIn.nextInt();
						//入れる数値が１～３６であること確認する
						while (q < 1 || q > 36) {
							System.out.println("１～３６以外を入れないでね");
							q = stdIn.nextInt();
							q--;
						}
					}
					chair[i][j] = banngou[q];
					//入れた番号はもう入れないように０に置き換える
					banngou[q] = 0;
				}
			}
		} catch (Exception e) {
			System.out.println("エラー検出したよ！！");
			System.out.println(e);
			e.printStackTrace();

		}
	}
}

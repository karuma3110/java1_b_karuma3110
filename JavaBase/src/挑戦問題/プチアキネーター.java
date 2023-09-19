package 挑戦問題;

import java.util.Scanner;

public class プチアキネーター {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);

		System.out.println("性別を入力してね。1.男性 2.女性");
		String a = stdIn.next();
		System.out.println("営業職かエンジニアか？ 1.営業職 2.エンジニア");
		String c = stdIn.next();
		System.out.println("魚か肉どちらが好きか？ 1.魚が嫌い 2.魚が好き 3.魚は嫌いだが肉は好き");
		String e = stdIn.next();
		System.out.println("夏と冬どちらが好きか？ 1.夏より冬が好き 2.冬より夏が好き");
		String h = stdIn.next();
		System.out.println("猫派か犬派か？ 1.犬派 2.猫派");
		String j = stdIn.next();

		String q = a + c + e + h + j;

		if (q.equals("11112")) {
			System.out.println("あなたが思い浮かべたのはAさんです。");

		} else if (q.equals("12211")) {
			System.out.println("あなたが思い浮かべたのはBさんです。");

		} else if (q.equals("11312")) {
			System.out.println("あなたが思い浮かべたのはCさんです。");

		} else if (q.equals("22221")) {
			System.out.println("あなたが思い浮かべたのはDさんです。");

		} else if (q.equals("22222")) {
			System.out.println("あなたが思い浮かべたのはEさんです。");

		} else if (q.equals("21311")) {
			System.out.println("あなたが思い浮かべたのはFさんです。");

		} else {

			System.out.println("あなたが思い浮かべた人は居ませんでした。");
		}
	}
}

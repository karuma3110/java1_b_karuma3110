package course30;

import java.util.Scanner;

public class UseClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Drink naiyou = new Drink(100, "初期データ");
		naiyou.display();
		System.out.println("飲み物の内容を入力してね");
		Scanner stdIn = new Scanner(System.in);
		naiyou.name = stdIn.next();
		System.out.println("値段を入力してね");
		naiyou.price = stdIn.nextInt();

		naiyou.display();
		System.out.println("個数を入力してね");
		int a = naiyou.calcSum(naiyou.price, stdIn.nextInt());
		System.out.println("合計は" + a + "円");
	}

}

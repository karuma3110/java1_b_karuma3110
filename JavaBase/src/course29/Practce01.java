package course29;

import java.util.Scanner;

public class Practce01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Character me = new Character();
		System.out.println("プレイヤー１のパラメータを入力してね");
		Scanner stdIn = new Scanner(System.in);
		System.out.println("名前は？");
		me.name = stdIn.next();
		System.out.println("HPは？");
		me.hp = stdIn.nextInt();
		System.out.println("strは？");
		me.str = stdIn.nextInt();
		System.out.println("dexは？");
		me.dex = stdIn.nextInt();
		System.out.println("agiは？");
		me.agi = stdIn.nextInt();
		System.out.println("defは？");
		me.def = stdIn.nextInt();

		Character tonari = new Character();
		System.out.println("プレイヤー２のパラメータを入力してね");
		System.out.println("名前は？");
		tonari.name = stdIn.next();
		System.out.println("HPは？");
		tonari.hp = stdIn.nextInt();
		System.out.println("strは？");
		tonari.str = stdIn.nextInt();
		System.out.println("dexは？");
		tonari.dex = stdIn.nextInt();
		System.out.println("agiは？");
		tonari.agi = stdIn.nextInt();
		System.out.println("defは？");
		tonari.def = stdIn.nextInt();
		me.viewStatus();
		tonari.viewStatus();
		me.battle(me, tonari);
	}

}

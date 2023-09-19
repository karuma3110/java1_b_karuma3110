package course14;

import java.util.Random;
import java.util.Scanner;

public class Pea01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int syojikinn = 10000;

		while (syojikinn > 0 && syojikinn < 50000) {
			Scanner stdIn = new Scanner(System.in);

			System.out.println("掛け金を入れてね");
			int a = stdIn.nextInt();

			//所持金から掛け金をひく。
			syojikinn = syojikinn - a;

			Random rnd = new Random();

			int saikoro1 = rnd.nextInt(7) + 1;
			int saikoro2 = rnd.nextInt(7) + 1;
			int saikoro3 = rnd.nextInt(7) + 1;
			
			System.out.println(saikoro1);
			System.out.println(saikoro2);
			System.out.println(saikoro3);
			
			if (saikoro1 == 1 && saikoro2 == 1 && saikoro3 == 1) {
				System.out.println("1 1 1 5倍");
				a = a * 5;
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 2 && saikoro2 == 2 && saikoro3 == 2) {
				System.out.println("2 2 2 3倍");
				a = a * 3;
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 3 && saikoro2 == 3 && saikoro3 == 3) {
				System.out.println("3 3 3 3倍");
				a = a * 3;
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 4 && saikoro2 == 4 && saikoro3 == 4) {
				System.out.println("4 4 4 3倍");
				a = a * 3;
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 5 && saikoro2 == 5 && saikoro3 == 5) {
				System.out.println("5 5 5 3倍");
				a = a * 3;
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 6 && saikoro2 == 6 && saikoro3 == 6) {
				System.out.println("6 6 6 3倍");
				a = a * 3;
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 4 && saikoro2 == 5 && saikoro3 == 6) {
				System.out.println("4 5 6 2倍");
				a = a * 2;
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 4 && saikoro2 == 6 && saikoro3 == 5) {
				System.out.println("4 6 5 2倍");
				a = a * 2;
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 5 && saikoro2 == 4 && saikoro3 == 6) {
				System.out.println("5 4 6 2倍");
				a = a * 2;
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 5 && saikoro2 == 6 && saikoro3 == 4) {
				System.out.println("5 6 4 2倍");
				a = a * 2;
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 6 && saikoro2 == 5 && saikoro3 == 4) {
				System.out.println("6 5 4 2倍");
				a = a * 2;
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 6 && saikoro2 == 4 && saikoro3 == 5) {
				System.out.println("6 4 5 2倍");
				a = a * 2;
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 1 && saikoro2 == 2 && saikoro3 == 3) {
				System.out.println("1 2 3 2倍");
				a = a * 2;
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 1 && saikoro2 == 3 && saikoro3 == 2) {
				System.out.println("1 3 2 2倍");
				a = a * 2;
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 2 && saikoro2 == 1 && saikoro3 == 3) {
				System.out.println("2 1 3 2倍");
				a = a * 2;
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 2 && saikoro2 == 3 && saikoro3 == 1) {
				System.out.println("2 3 1 2倍");
				a = a * 2;
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 3 && saikoro2 == 2 && saikoro3 == 1) {
				System.out.println("3 2 1 2倍");
				a = a * 2;
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 3 && saikoro2 == 1 && saikoro3 == 2) {
				System.out.println("3 1 2 2倍");
				a = a * 2;
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 1 && saikoro2 == 1 && saikoro3 == 6) {
				System.out.println("1 1 6 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 1 && saikoro2 == 1 && saikoro3 == 5) {
				System.out.println("1 1 5 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 1 && saikoro2 == 1 && saikoro3 == 4) {
				System.out.println("1 1 4 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 1 && saikoro2 == 1 && saikoro3 == 3) {
				System.out.println("1 1 3 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 1 && saikoro2 == 1 && saikoro3 == 2) {
				System.out.println("1 1 2 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 1 && saikoro2 == 6 && saikoro3 == 1) {
				System.out.println("1 6 1 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 6 && saikoro2 == 1 && saikoro3 == 1) {
				System.out.println("6 1 1 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 1 && saikoro2 == 5 && saikoro3 == 1) {
				System.out.println("1 5 1 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 5 && saikoro2 == 1 && saikoro3 == 1) {
				System.out.println("5 1 1 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 1 && saikoro2 == 4 && saikoro3 == 1) {
				System.out.println("1 4 1 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 4 && saikoro2 == 1 && saikoro3 == 1) {
				System.out.println("4 1 1 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 1 && saikoro2 == 3 && saikoro3 == 1) {
				System.out.println("1 3 1 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 3 && saikoro2 == 1 && saikoro3 == 1) {
				System.out.println("3 1 1 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 1 && saikoro2 == 2 && saikoro3 == 1) {
				System.out.println("1 2 1 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 2 && saikoro2 == 1 && saikoro3 == 1) {
				System.out.println("2 1 1 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 2 && saikoro2 == 2 && saikoro3 == 6) {
				System.out.println("2 2 6 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 2 && saikoro2 == 6 && saikoro3 == 2) {
				System.out.println("2 6 2 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 6 && saikoro2 == 2 && saikoro3 == 2) {
				System.out.println("6 2 2 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 2 && saikoro2 == 2 && saikoro3 == 5) {
				System.out.println("2 2 5 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 2 && saikoro2 == 5 && saikoro3 == 2) {
				System.out.println("2 5 2 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 5 && saikoro2 == 2 && saikoro3 == 2) {
				System.out.println("5 2 2 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 2 && saikoro2 == 2 && saikoro3 == 4) {
				System.out.println("2 2 4 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 2 && saikoro2 == 4 && saikoro3 == 2) {
				System.out.println("2 4 2 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 4 && saikoro2 == 2 && saikoro3 == 2) {
				System.out.println("4 2 2 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 2 && saikoro2 == 2 && saikoro3 == 3) {
				System.out.println("2 2 3 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 2 && saikoro2 == 3 && saikoro3 == 2) {
				System.out.println("2 3 2 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 3 && saikoro2 == 2 && saikoro3 == 2) {
				System.out.println("3 2 2 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 3 && saikoro2 == 3 && saikoro3 == 2) {
				System.out.println("3 3 2 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 3 && saikoro2 == 2 && saikoro3 == 3) {
				System.out.println("3 2 3 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 2 && saikoro2 == 3 && saikoro3 == 3) {
				System.out.println("2 3 3 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 3 && saikoro2 == 3 && saikoro3 == 4) {
				System.out.println("3 3 4 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 3 && saikoro2 == 4 && saikoro3 == 3) {
				System.out.println("3 4 3 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 4 && saikoro2 == 3 && saikoro3 == 3) {
				System.out.println("4 3 3 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 3 && saikoro2 == 3 && saikoro3 == 5) {
				System.out.println("3 3 5 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 3 && saikoro2 == 5 && saikoro3 == 3) {
				System.out.println("3 5 3 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 5 && saikoro2 == 3 && saikoro3 == 3) {
				System.out.println("5 3 3 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 2 && saikoro2 == 2 && saikoro3 == 1) {
				System.out.println("2 2 1 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 2 && saikoro2 == 1 && saikoro3 == 2) {
				System.out.println("2 1 2 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 1 && saikoro2 == 2 && saikoro3 == 2) {
				System.out.println("1 2 2 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 4 && saikoro2 == 4 && saikoro3 == 1) {
				System.out.println("4 4 1 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 4 && saikoro2 == 4 && saikoro3 == 1) {
				System.out.println("4 1 4 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 4 && saikoro2 == 4 && saikoro3 == 1) {
				System.out.println("1 4 4 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 4 && saikoro2 == 4 && saikoro3 == 1) {
				System.out.println("4 4 1 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 4 && saikoro2 == 4 && saikoro3 == 1) {
				System.out.println("4 4 2 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 4 && saikoro2 == 4 && saikoro3 == 1) {
				System.out.println("4 2 4 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 4 && saikoro2 == 4 && saikoro3 == 1) {
				System.out.println("2 4 4 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 4 && saikoro2 == 4 && saikoro3 == 1) {
				System.out.println("4 4 3 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 4 && saikoro2 == 4 && saikoro3 == 1) {
				System.out.println("4 3 4 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 4 && saikoro2 == 4 && saikoro3 == 1) {
				System.out.println("3 4 4 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 4 && saikoro2 == 4 && saikoro3 == 1) {
				System.out.println("4 4 5 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 4 && saikoro2 == 4 && saikoro3 == 1) {
				System.out.println("4 5 4 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 4 && saikoro2 == 4 && saikoro3 == 1) {
				System.out.println("5 4 4 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 4 && saikoro2 == 4 && saikoro3 == 1) {
				System.out.println("4 4 6 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 4 && saikoro2 == 4 && saikoro3 == 1) {
				System.out.println("4 6 4 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 4 && saikoro2 == 4 && saikoro3 == 1) {
				System.out.println("6 4 4 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 4 && saikoro2 == 4 && saikoro3 == 1) {
				System.out.println("5 5 1 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 4 && saikoro2 == 4 && saikoro3 == 1) {
				System.out.println("5 1 5 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 4 && saikoro2 == 4 && saikoro3 == 1) {
				System.out.println("1 5 5 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 4 && saikoro2 == 4 && saikoro3 == 1) {
				System.out.println("5 5 2 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 4 && saikoro2 == 4 && saikoro3 == 1) {
				System.out.println("5 2 5 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 4 && saikoro2 == 4 && saikoro3 == 1) {
				System.out.println("2 5 5 出した分もらう");
				syojikinn = syojikinn + a;
			} else if (saikoro1 == 7 && saikoro2 == 7 && saikoro3 == 7) {
				System.out.println("7 7 7 出した分払う");
			} else {
				System.out.println("出した分払う");
			}
			System.out.println(syojikinn);
		}
		if (syojikinn <= 0) {
			System.out.println("1050年地下行き");
		} else {
			System.out.println("ゲームクリア");
		}
	}
}

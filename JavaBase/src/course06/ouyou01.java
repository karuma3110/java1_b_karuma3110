package course06;

import java.util.Scanner;

public class ouyou01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("値を入力してください。");
		
		int x = stdIn.nextInt();
		
		if(x >= 10){
			System.out.println("入力した数値は10以上です。");
		} else {
			System.out.println("10未満です。");
		}
	}

}

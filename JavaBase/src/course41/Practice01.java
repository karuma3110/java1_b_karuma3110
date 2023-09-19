package course41;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//1
		String moji = "模擬テスト。100点取ります。";
		System.out.println(moji);
		//2
		int x = 50;
		int y = 100;
		int z = x * y;
		System.out.println(z);
		//3
		Scanner stdIn = new Scanner(System.in);
		String aa = stdIn.next();
		System.out.println(aa);
		//4
		for (int a = 1; a <= 5; a++) {
			System.out.println(a+"回目のループです");
		}
		//5
		int b = stdIn.nextInt();
		if(b>=50) {
			System.out.println("50以上です。");
		}else if(b<=49) {
			System.out.println("49以下です。");
		}
		//6
		boolean isRaining = true;
		if(isRaining==true) {
			System.out.println("傘をもってけーーー");
		}else{
			System.out.println("良い1日を！");
		}
		//7
		int[] numArr = new int[5];
		numArr[0]=10;
		numArr[1]=50;
		numArr[2]=30;
		numArr[3]=20;
		numArr[4]=40;
		//8
		for(int c = 0; c <= 4; c++) {
			System.out.println(numArr[c]);
		}
		//9
		
	}
}
package course41;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//10
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		int[] variable = new int[x];
		//EX
		
		//11
		mogi();
		//12
		int a =10;
		int b =11;
		calc(a,b);
	}
	static void mogi() {
		System.out.println("メソッド問題");
	}
	static void calc(int c,int d) {
		System.out.println(c+d);
	}
}

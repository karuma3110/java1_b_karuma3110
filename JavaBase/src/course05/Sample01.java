package course05;

import java.util.Scanner;

public class Sample01 {
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		System.out.println("xとyとzを加算します");

		System.out.println("xの値を入力してください");

		//変数「x」に入力された内容が
		//格納される。
		//nextdouble()にすると小数点の計算が可能になる
		//next()にすると文字の計算ができる
		
		double x = stdIn.nextDouble();

		System.out.println("yの値を入力してください");

		double y = stdIn.nextDouble();
		
		System.out.println("zの値を入力してください");
		
		int z = stdIn.nextInt();

		System.out.println("x + y  =" + (x + y ));
	}
}

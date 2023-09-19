package course19;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//慣れよう問題①
		String[] mygroup = new String[3];
		mygroup[0] = "さかもと";
		mygroup[1] = "ふじひら";
		mygroup[2] = "いとう(そら)";

		//慣れよう問題②
		int[] mygroupnum = new int[3];
		mygroupnum[0] = 10;
		mygroupnum[1] = 24;
		mygroupnum[2] = 2;

		//慣れよう問題③
		int[] myNum = new int[3];
		myNum[0] = 10;
		myNum[1] = 50;
		myNum[2] = myNum[0] + myNum[1];

		//慣れよう問題④
		Scanner stdIn = new Scanner(System.in);
		System.out.println("数字を打ってね");
		int[] myNumScan = new int[3];
		myNumScan[0] = 10;
		myNumScan[1] = stdIn.nextInt();
		myNumScan[2] = myNumScan[0] + myNumScan[1];
		System.out.println(myNumScan[2]);
	}
}

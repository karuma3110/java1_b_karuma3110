package course22;

import java.util.Arrays;

public class Practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//練習問題①
		String[][] arr = { { "o", "x", "o" }, { "x", "o", "x" }, { "o", "o", "o" } };
		System.out.println(arr[2][1]);
		//練習問題②
		System.out.println(Arrays.deepToString(arr));
		//練習問題③

		int count = 0;
		for (int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println("現在の要素は" + arr[i][j]);
				if(arr[i][j].equals("o")) {
					count = count + 1;
				}
			}
			System.out.println(count);
		}
	}

}

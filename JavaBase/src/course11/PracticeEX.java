package course11;

public class PracticeEX {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int i = 0;
		while (i <= 100) {

			int x = i % 10;

			if (x == 0) {
				System.out.println("10の倍数です。");
			}
			System.out.println(i);
			i++;
		}
	}

}

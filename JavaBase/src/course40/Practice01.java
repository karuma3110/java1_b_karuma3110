package course40;

public class Practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//if1
		int number = 15;
		if (number > 10) {
			System.out.println("でか！！！");
		}
		//if2
		int age = 20;
		if (age > 18) {
			System.out.println("大人っすね！");
		} else {
			System.out.println("キッズだね＾＾");
		}
		//if3
		int score = 85;
		if (score > 90) {
			System.out.println("Excellent");
		} else if (score >= 80 && score <= 90) {
			System.out.println("Good");
		} else {
			System.out.println("勉強しましょう。");
		}
		//if4
		boolean isRaining = true;
		if (isRaining == true) {
			System.out.println("傘をもってけーーー");
		} else {
			System.out.println("良い１日を！");
		}
		//if5
		int num = 3;
		int a = num % 2;
		if (a == 0) {
			System.out.println("偶数でっせ");
		} else {
			System.out.println("奇数だよ");
		}
		//for1
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		//for2
		for (int b = 1; b <= 100; b++) {
			if (b % 2 == 0) {
				System.out.println("現在" + b + "回目のループです。" + "偶数です");
			}
		}
		//for3
		for (int c = 10; c >= 1; c--) {
			System.out.println(c);
		}
		//for4
		int sum = 0;
		for (int d = 1; d <= 100; d++) {
			sum = sum + d;
			System.out.println(sum);
		}
		//配列1
		int[] numbers = new int[5];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
		for (int e = 0; e <= 4; e++) {
			System.out.println(numbers[e]);
		}
		//配列2
		String[] cities = new String[5];
		cities[0] = "東京";
		cities[1] = "大阪";
		cities[2] = "千葉";
		cities[3] = "神奈川";
		cities[4] = "埼玉笑";
		for (int f = 0; f <= 4; f++) {
			System.out.println(cities[f]);
		}
		//配列3
		int sum1 = 0;
		int[] numbers2 = new int[5];
		numbers2[0] = 10;
		numbers2[1] = 20;
		numbers2[2] = 30;
		numbers2[3] = 40;
		numbers2[4] = 50;
		for (int g = 0; g <= 4; g++) {
			numbers2[sum1] = numbers2[sum1] + numbers2[g];
			System.out.println(numbers2[sum1]);
		}
		//配列4
		int[] numbers3 = new int[5];
		numbers3[0] = 10;
		numbers3[1] = 20;
		numbers3[2] = 30;
		numbers3[3] = 40;
		numbers3[4] = 50;
		for (int h = 0; h <= 4; h++) {
			if (numbers3[h] >= 50) {
				System.out.println(numbers3[h]);
			}
			//配列5
			int[] numbers4 = new int[5];
			numbers4[0] = 11;
			numbers4[1] = 20;
			numbers4[2] = 31;
			numbers4[3] = 40;
			numbers4[4] = 51;
			for (int j = 0; j <= 4; j++) {
				if (numbers4[j] % 2 == 0) {
				} else {
					System.out.println(numbers4[j]);
				}
			}
		}
	}
}

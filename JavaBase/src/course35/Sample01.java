package course35;

public class Sample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		calc();
		calc(50, 100);
		calc("t");
		a(50);
	}

	static void calc() {
		System.out.println("計算したいときは、引数を2つ渡して");
	}

	static void calc(int a, int b) {
		System.out.println("計算結果は" + (a + b));
	}
	static void calc(String c) {
		System.out.println("渡された文字は"+ c +"です");
	}
	static void a(int a) {
		System.out.println("受け取った値は" + a + "です");

	}
}
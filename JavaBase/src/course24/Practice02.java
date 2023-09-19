package course24;

public class Practice02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int a = 30;
		String c=("引数だよー");
		int e =50;
		int f =40;
		int tensu = 100;
		bai(a);
		moji(c);
		niko(e,f);
		calledMethod(tensu);
	}

	static void bai(int b) {
		System.out.println(b * 2);
	}
	static void moji(String d) {
		System.out.println(d);
	}
	static void niko(int g,int h) {
		System.out.println(g+h);
	}
	static void calledMethod(int tensu) {
		System.out.println("引数で受け取った値は"+ tensu + "です。");
	}
}

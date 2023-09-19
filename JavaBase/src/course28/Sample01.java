package course28;

public class Sample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//インスタンス
		//「hu1」はHumanのインスタンス(実体)
		//インスタンスに対してパラメータを設定する。

		Human hu1 = new Human();
		hu1.name = "坂本";
		hu1.kotoba = "ラブ＆ピース";

		hu1.hp = 50;
		hu1.neru();
		System.out.println(hu1.name);

		chr numata = new chr();
		numata.attck = 200;
		numata.def = 0;
		numata.spd = 30;
		numata.love = 20;
		numata.hp = 50;
		numata.mp = 200;

		chr kajima = new chr();
		kajima.attck = 500;
		kajima.def = 0;
		kajima.spd = 250;
		kajima.love = 100;
		kajima.hp = 100;
		kajima.mp = 50;

		kajima.naguru(kajima.attck, numata.def, numata.hp);
	}
}

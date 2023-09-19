package クラス_総合演習期限9月6日;

public class Pocketon {

	String name;
	String type;
	int power;
	int diffcult;
	int getted;

	Pocketon(String n, String t, int p, int d) {
		name = n;
		type = t;
		power = p;
		diffcult = d;
		getted = 0;
	}

	void display() {
		System.out.println("ポケトンの名前は" + name);
		System.out.println("ポケトンのタイプは" + type);
		System.out.println("ポケトンの攻撃力は" + power);
		System.out.println("ポケトンの捕まりやすさは" + diffcult + "%でゲット");
		System.out.println(getted);
	}
}

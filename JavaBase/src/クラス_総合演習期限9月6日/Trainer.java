package クラス_総合演習期限9月6日;

import java.util.Random;

public class Trainer {
	static int hiki = 0;
	String name;
	Pocketon[] myPockes;

	Trainer() {
		name = "";
		myPockes = new Pocketon[6];
	}

	void capture(Pocketon pocke) {
		Random rnd = new Random();
		int a = rnd.nextInt(10) + 1;

		if (pocke.diffcult < a) {
			System.out.println("捕獲成功！");
			Pocketon pocke3 = new Pocketon(pocke.name, pocke.type, pocke.power, pocke.diffcult);
			myPockes[pocke.getted] = pocke3;
			pocke.getted++;
			hiki = pocke.getted;

		} else {
			System.out.println("捕獲失敗！");
		}
	}

	void display() {
		for (int a = 0; a < hiki; a++) {
			System.out.println(myPockes[a].name);
			System.out.println();
		}

	}
}
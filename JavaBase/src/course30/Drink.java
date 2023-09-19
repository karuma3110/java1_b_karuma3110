package course30;

public class Drink {

	int price;
	String name;

	//コンストラクタ追加
	//コンストラクタはメインクラスでnewをした時に自動的に発動する。
	Drink(int p, String n) {
		price = p;
		name = n;
	}

	void display() {
		System.out.println("値段は" + price + "円");
		System.out.println("商品名" + name);
	}

	int calcSum(int price, int suryo) {
		int sum = price * suryo;
		return sum;
	}
}
package course36;

public class UseClass2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Kaden nakami = new Kaden();
		nakami.name = "冷蔵庫";
		nakami.price = 10000;

		Kaden nakami2 = new Kaden();
		nakami2.name = "炊飯器";

		nakami.display();
		nakami2.display();
	}
}
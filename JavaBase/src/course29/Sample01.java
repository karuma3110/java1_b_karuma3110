package course29;

public class Sample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Human human1 = new Human();
		Human me = new Human();

		me.name = "安田敦斗";
		me.address = "千葉市";
		me.hobby = "ゲーム、アニメ、音楽鑑賞、映画鑑賞";

		human1.name = "システム太郎";
		human1.hobby = "基数変換";
		human1.address = "サーティファイ本社";

		Human human2 = new Human();

		human2.name = "システム花子";
		human2.hobby = "パック10進数";
		human2.address = "国際理工学園182号館";

		human1.talk();
		human2.talk();
	}

}

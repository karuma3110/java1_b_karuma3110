package course39;

public class UseClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Student namae1 = new Student();
		namae1.name = "安田敦斗";
		namae1.no = 26;

		Student namae2 = new Student();
		namae2.name = "藤平陸仁";
		namae2.no = 24;

		Student[] myfriend = new Student[2];
		myfriend[0] = namae1;
		myfriend[1] = namae2;

		for (int i = 0; i < myfriend.length; i++) {
			System.out.println(myfriend[i].name);
		}
		//💮
	}
}
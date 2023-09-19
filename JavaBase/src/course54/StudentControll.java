package course54;

public class StudentControll {
	public static void main(String[] args) {

		Student tonari = new Student(2, "伊東 輝空");
		Student me = new Student(26, "安田敦斗");

		Student[] mymen = new Student[2];
		mymen[0] = tonari;
		mymen[1] = me;
		//get～～()で取り出せる！
		System.out.println(mymen[1].getName());
		mymen[0].setName("臼井 優太朗");
	}
}

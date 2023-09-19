package course56;

public class StudentControoll {
	public static void main(String[] args) {

		Student stu1 = new Student();
		
		stu1.setName("安田 敦斗");
		stu1.setSyussekibango(26);
		stu1.study();
		
		PoPocke pika = new PoPocke();
		
		pika.setName("ピカチュウ");
		pika.setZukanNo(25);
		pika.setType("電気");
		pika.setKotaichi(6);
		pika.setNickname("ピカピカ");
	}
}
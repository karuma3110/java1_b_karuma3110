package course41;

public class UseClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Product pro1 = new Product();
		pro1.no="A001";
		pro1.name = "Item";
		pro1.price =200;
		pro1.quantity = 10;
		pro1.display();
		
		Food a = new Food();
		a.name ="k";
		a.price =10;
		a.display();
		
		Food b = new Food();
		a.name ="f";
		a.price =10;
		
		Food c = new Food();
		a.name ="g";
		a.price =10;
		
		Food d = new Food();
		a.name ="j";
		a.price =10;
		
		Food e = new Food();
		a.name ="l";
		a.price =10;
		
		Food[] menu = new Food[4];
		menu[0]=b;
		menu[1]=c;
		menu[2]=d;
		menu[3]=e;
		for(int w = 0; w <= 4; w++) {
			System.out.println(menu[w]);
	}
}

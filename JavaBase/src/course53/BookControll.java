package course53;

public class BookControll {
	public static void main(String[] args) {
		//コンストラクタが呼び出される↓
		Book book1 = new Book();

		Book book2 = new Book("ITワールド");
		
		Book book3 = new Book("ITワールド", 10);
		
		System.out.println(book3.getPrice());
		System.out.println(book3.getTitle());
	}
}

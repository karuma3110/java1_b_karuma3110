package course53;

public class Book {
	private String title;
	private int price;

	//引数なしはデフォルトコンストラクタ！
	//コンストラクタ↓
	public Book() {
		System.out.println("動いたよ。");
	}

	//オーバーロード
	//ここにタイトルと価格をセットするコンストラクタを書いてみよう////
	public Book(String userInputTitle) {
		this.title = userInputTitle;
		System.out.println("タイトルに初期値として" + userInputTitle + "をセットしました。");
	}
    //クラス名↓    引数、引数↓
	public Book(String userInputTitle, int userInputPrice) {
		
	}
	//////////////////////////////////////////////////////////////////

	////////////////以下getter及びsetter(今日は無視してOK）/////////////
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	////////////////以下getter及びsetter(今日は無視してOK）/////////////
}

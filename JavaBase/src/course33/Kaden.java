package course33;

public class Kaden {

	//P242-P243
	private String name;
	private int price;
	private String category;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (!(name.equals("マウス"))) {
			this.name = "設定NG";
		} else {
			this.name = name;
		}
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		if (category.equals("大型")) {
			this.category = category;
		} else {
			this.category = "設定NG";
		}
	}
}
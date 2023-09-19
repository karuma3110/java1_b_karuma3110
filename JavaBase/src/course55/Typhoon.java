package course55;

public class Typhoon {
	private int typhoonbango;
	private String hasseibi;
	private String asiaName;
	//デフォルトコンストラクタ
	public Typhoon() {
	}
	//引数有りコンストラクタ
	public Typhoon(int userInputtyphoon,String userInputhasseibi,String userInputasiaName) {
		this.typhoonbango = userInputtyphoon;
		this.hasseibi = userInputhasseibi;
		this.asiaName = userInputasiaName;
	}
	//getter,setter
	public int getTyphoonbango() {
		return typhoonbango;
	}
	public void setTyphoonbango(int typhoonbango) {
		this.typhoonbango = typhoonbango;
	}
	public String getHasseibi() {
		return hasseibi;
	}
	public void setHasseibi(String hasseibi) {
		this.hasseibi = hasseibi;
	}
	public String getAsiaName() {
		return asiaName;
	}
	public void setAsiaName(String asiaName) {
		this.asiaName = asiaName;
	}
	
}

package course19;

public class Sample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String a = "さかもと";
		String b = "いとう(そら)";
		String c = "ふじひら";
		String d = "やすだ";
		String e = "いの";
		String f = "すずき";
		String g = "かけがわ";
		String h = "いとう";

		//配列の鉄板構文
		//[]の事を
		String[] nameList = new String[10]; //[]の中身の数が小さな箱の数
		nameList[0] = "さかもと";
		nameList[1] = "いとう(そら)";
		nameList[2] = "ふじひら";
		nameList[3] = "やすだ";
		nameList[4] = "いの";
		nameList[5] = "すずき";
		nameList[6] = "かけがわ";
		nameList[7] = "いとう";

		for (int i = 0; i < 3; i++) {
			System.out.println("俺の友達の名前は" + nameList[i] + "だ。");
			System.out.println( nameList[0] +"君"+"の漢字を教えてよ");
		}
	}

}

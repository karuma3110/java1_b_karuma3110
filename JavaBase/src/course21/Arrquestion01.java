package course21;

public class Arrquestion01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int[] typhooon = {1,1,0,0,0,1,4,5,6,4,6,1};
		
		System.out.println("7月の台風は"+typhooon[6]+"件です。");
		
		//()を使うとその中だけ計算される。
		for (int i = 0; i < 12; i++) {
			System.out.println( (i + 1) +"月の台風は"+typhooon[i]+"件です。");
		}
	}
}
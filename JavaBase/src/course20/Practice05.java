package course20;

public class Practice05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String[] arr = { "x","y","x","y","x" };
		int x = 1;
		for (String num2 : arr){
			if ("x".equals(num2)) {
				System.out.println("x");
			} else {
				System.out.println("y");
			}
		}
	}
}

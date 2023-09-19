package course58;

import java.util.Scanner;

public class Practice03 {
	public static void main(String[] args) {
		JavaMaker jm = new JavaMaker();
		Scanner stdIn = new Scanner(System.in);
		System.out.println("作りたいプログラムを選んでね！");
		String startCode = "public class HelloWorld { public static void main(String[] args){"
				+ " for(int i = 0 ; i < 10; i++) System.out.println(\"Hello\");"
				+ ""
				+ "}}";
		jm.javaCodeStart(startCode);
	}
}
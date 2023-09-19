package course32;

public class Computer {

	String name;
	String cpu;
	int memory;
	String gurabo;
	int price;

	Computer(String n, String c, int m, String g, int p) {
		name = n;
		cpu = c;
		memory = m;
		gurabo = g;
		price = p;
	}

	void display() {
		System.out.println("このPCの名前は" + name);
		System.out.println("このCPUは" + cpu);
		System.out.println("このメモリーは" + memory);
		System.out.println("このグラボは" + gurabo);
		System.out.println("このPCの値段は" + price);
	}

	int nebiki(int nebikigaku) {
		int a = price - nebikigaku;
		return a;
	}

	int chonebiki(int nebikigaku) {
		int b = price - nebikigaku * 3;
		return b;
	}
}

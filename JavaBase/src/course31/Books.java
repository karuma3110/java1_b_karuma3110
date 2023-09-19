package course31;

public class Books {

	String name;
	int page;
	String author;
	Books(String n,int p,String a){
		name = n;
		page = p;
		author = a;
		}
	void display() {
		System.out.println("本の名前は"+ name);
		System.out.println("ページ数は"+ page);
		System.out.println(author);
	}
}

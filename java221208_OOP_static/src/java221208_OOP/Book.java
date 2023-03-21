package java221208_OOP;

public class Book {
	// 1. 속성 생각해서 멤버변수들 배치
	String title;
	String author;
	int price;

	// 2. 기본생성자
	public Book() {
		// TODO Auto-generated constructor stub
	}

	// 3. 오버로딩 된 생성자
	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	// 4. 기타 메소드
	public void printInfo() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(price);
	}

}

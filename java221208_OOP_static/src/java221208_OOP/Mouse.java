package java221208_OOP;

public class Mouse {
	String name;
	int price;
	static String MAKER = "Samsung";
	// 공통 속성
	
	// 생성자
	public Mouse() {
		System.out.println("입고됨");
	}
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(MAKER);
	}
	
	//MAKER만 출력 
	public static void printMaker() {
		System.out.println(MAKER);
	}
}

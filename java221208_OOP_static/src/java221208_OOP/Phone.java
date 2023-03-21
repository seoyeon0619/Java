package java221208_OOP;

public class Phone {
	String name;
	int price;
	String telecom;
	public Phone() {
		System.out.println("<HandPhoneInfo>");
	}
	
	public Phone(String name, int price, String telecom) {
		this.name = name;
		this.price = price;
		this.telecom = telecom;
	}
	
	//멤버변수 사용하고 싶을 때 this 사용
	public void test() {
		String name = "asd";
		System.out.println(this.name);
	}
	public void printInfo() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(telecom);
	}
}

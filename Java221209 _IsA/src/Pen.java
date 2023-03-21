// Product : 상위 클래스(Super Class) / 부모 클래스(Parent Class)
// Pen : 하위 클래스(Sub Class) / 자식 클래스

// Pen is a Product
public class Pen extends Product{
	String color;
	
	public Pen() {
	}
	// 생성자 만들때 설정해서 만들기
	public Pen(String name, int price, String color) {
		super(name, price);
		this.color = color;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println(color);
	}
	
}

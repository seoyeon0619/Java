package java221208_OOP;

public class Pen {
	String color;
	int price;
	
	public Pen() {
	}
	
	public Pen(String color, int price) {
		super();
		this.color = color;
		this.price = price;
	}
	
	public void printInfo() {
		System.out.println(color);
		System.out.println(price);
	}

}

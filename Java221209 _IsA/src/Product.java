// 실제 상속 : Object - Product - Computer - Notebook
public class Product /* extends Object */{
	String name;
	int price;

	public Product() {
		System.out.println("Product");
	}
	
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public void printInfo() {
		System.out.println(name);
		System.out.println(price);
	}
}

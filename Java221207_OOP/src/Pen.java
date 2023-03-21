
public class Pen {
	String name;
	String company;
	String color;
	int price;
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(company);
		System.out.println(color);
		System.out.printf("%d원\n", price);
	}
}

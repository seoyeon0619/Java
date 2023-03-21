
public class Marker extends Product{
	String color;
	
	public Marker() {
		// TODO Auto-generated constructor stub
	}

	
	public Marker(String name, int price, String color) {
		super(name, price);
		this.color = color;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println(color);
	}
}

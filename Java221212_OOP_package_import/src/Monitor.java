
public class Monitor extends Product {
	int size;
	
	public Monitor() {
		// TODO Auto-generated constructor stub
	}


	public Monitor(String name, int price, int size) {
		super(name, price);
		this.size = size;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println(size);
	}
}

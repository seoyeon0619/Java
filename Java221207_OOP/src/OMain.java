
public class OMain {
	public static void main(String[] args) {
		String name = "후추";
		System.out.println(name);
		int age = 3;
		System.out.println(age);
		System.out.println("---------");

		
		Dog d = new Dog();
		d.name = "후추";
		d.age = 3;
		d.bark();
		d.printInfo();
		System.out.println("----------");

		
		Pen p = new Pen();
		p.name = "모나미153";
		p.company = "모나미";
		p.color = "빨강";
		p.price = 500;
		p.printInfo();
		System.out.println("------------");

		
		Calculator c = new Calculator();
		c.printSum(10, 20);
		System.out.println("------------");
		
	}
}

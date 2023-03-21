
public class OMain2 {
	public static void main(String[] args) {
		Pen p = new Pen();
		p.name = "모나미153";
		p.price = 500;
		p.color = "빨강";
		p.printInfo();
		System.out.println("-----");
		
		Pen p2 = new Pen("모나미123", 300, "검정");
		p2.printInfo();
		System.out.println("-----");
		
		Computer c = new Computer();
		c.name = "매직스테이션123";
		c.price = 1000000;
		c.cpu = "i7-1234";
		c.ram = 16;
		c.hdd = 500;
		c.printInfo();
		System.out.println("-----");
		
		NoteBook n = new NoteBook();
		n.name = "그램123";
		n.price = 100000;
		n.cpu = "i7-123";
		n.ram = 16;
		n.hdd = 250;
		n.weight = 5;
		n.printInfo();
		System.out.println("-----");

		Snack s = new Snack("새우깡", 1500, 221210);
		s.printInfo();
		System.out.println("-----");
		
		Shoes sh = new Shoes("에어맥스123", 10000000);
		sh.printInfo();
		System.out.println("-----");
	}
}

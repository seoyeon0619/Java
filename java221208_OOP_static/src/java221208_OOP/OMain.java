package java221208_OOP;

public class OMain {
	public static void main(String[] args) {
		Computer com = new Computer();
		com.cpu = "i7-1234";
		com.ram = 8;
		com.printInfo();
		System.out.println("-----");
		
		Inch.toInch(30);
		// static의 정석 방식
		System.out.println(Math.PI);
		// final로 바꾸지 못하게 한 것
		// 대문자
		Gejang.test();
		System.out.println("-----");
		//객체 없어도 사용할 수 있음
		System.out.println(Gejang.MADE);
		System.out.println("-----");
		
		Gejang g = new Gejang();
		g.name = "설날특선간장게장세트";
		g.weight = 5;
		g.price = 39900;
		//g.MADE = "김수미"; 
		g.printInfo();
		System.out.println("-----");
		
		Gejang g2 = new Gejang();
		g2.name = "X-max특성간장게장세트";
		g2.weight = 3;
		g2.price = 59900;
		//g2.made = "김수미";
		g2.printInfo();
		System.out.println("-----");
		
		Mouse.printMaker();
		
		Mouse m = new Mouse();
		m.name = "ask1234";
		m.price = 10000;
		m.printInfo();
		System.out.println("-----");
		
		Mask ma = new Mask();
		ma.name = "coronaMask";
		ma.price = 2000;
		ma.level = "KF94";
		ma.printInfo();
		System.out.println("-----");
		
		Phone p = new Phone();
		p.name = "z플립";
		p.price = 1000000;
		p.telecom = "kt";
		p.printInfo();
		System.out.println("-----");
		
		Phone p2 = new Phone("폴드", 1000, "Lg");
		p2.printInfo();
		System.out.println("-----");
		
		Pen pen = new Pen("빨강", 500);
		pen.printInfo();
		System.out.println("-----");
		
		Book b = new Book("자바", "잉", 10000);
		b.printInfo();
		System.out.println("-----");
	}// main

}

import java.util.Scanner;

public class OMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("품명 : ");
		String name = input.next();
		System.out.print("가격 : ");
		int price = input.nextInt();
		System.out.print("사이즈 : ");
		int size = input.nextInt();
		System.out.println("-----");
		
		Monitor mo = new Monitor(name, price, size);
		mo.printInfo();
		System.out.println("-----");
		
		Marker ma = new Marker("화이트보드마카", 1000, "검은색 보드마카");
		ma.printInfo();
		System.out.println("-----");
		
		//Scanner s = new Scanner("캐논123", 50);
		//s.printInfo();
		//System.out.println("-----");
		
		
		

	}
}

import java.util.Scanner;

public class OMain {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("x : ");
		int x = keyboard.nextInt();

		System.out.print("y : ");
		int y = keyboard.nextInt();

		System.out.println("-----");
		System.out.printf("x는 %d, y는 %d\n", x, y);

		// 연산자
		int a = x + y;
		int b = x - y;
		int c = x * y;
		int d = x / y;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println("-----");

		String s = "똥";
		String e = x + s;
		System.out.println(e);

		double f = x / (double) y;
		System.out.println(f);

		int g = x % y;
		System.out.println(g);

		// x= x+3
		x += 3;
		System.out.println(x);

		// y = y-2
		y -= 2;
		System.out.println(y);
		System.out.println("-----");
		
		//x값 1만큼 올리기 
		//x = x+1;
		//x += 1;
		x++;
		System.out.println(x);
	}
}

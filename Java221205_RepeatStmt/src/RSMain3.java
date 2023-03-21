import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class RSMain3 {
	public static void main(String[] args) {
		// 1 ~ 30까지의 합
		int a = 0;
		for (int i = 1; i < 31; i++) {
			a += i;
		}
		System.out.println(a);
		System.out.println("-----");

		// n까지 더한 합이 >= 200되는 n을 구하라
		int b = 0;
		int i = 0;
		while (b < 200) {
			i++;
			b += i;
		}
		System.out.println(b);
		System.out.println(i);
		System.out.println("-----");
		
		//랜덤한 숫자 출력 4나오면 그만
		Random r = new Random();
		int x = r.nextInt(10); //0 ~ (10-1)사이의 무작위 수 추출
		System.out.println(x);
		
		while (x != 4) {
			x = r.nextInt(10);
			System.out.println(x);
		}
		System.out.println("-----");
		
		//입력받기
		Scanner k = new Scanner(System.in);
		System.out.print("숫자 : ");
		int z = k.nextInt();
		System.out.println(z);
		do {
			System.out.print("숫자 : ");
			z = k.nextInt();
			System.out.println(z);
		} while (z != -1);
		
		System.out.println("-----");
		
		// do-while문을 사용하지 않고 while문에 조건식 잘쓰면 된다
		
	}// main
}// class

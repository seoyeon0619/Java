
public class RSMain {
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			System.out.println("ㅎ");
		}
		System.out.println("---------");

		// 3~5
		for (int i = 3; i < 6; i++) {
			System.out.println(i);
		}
		System.out.println("---------");

		// 1~5
		for (int i = 1; i < 6; i++) {
			System.out.println(i);
		}

		System.out.println("----------");

		// 1 3 5 7 9
		for (int i = 1; i < 10; i += 2) {
			System.out.println(i);
		}

		System.out.println("-----------");

		// 10 ~ 1
		for (int i = 10; i > 0; --i) {
			System.out.println(i);
		}
		System.out.println("-----------");

		// 1 ~ 10까지의 합
		int a = 0; // 변수 생성
		for (int i = 1; i < 11; i++) {
			a += i; // 반복 생성되는 변수를 i로 지정하여 변수가 바뀌도록
		}
		System.out.println(a);
		System.out.println("-----------");
		
		// 1~21까지의 합
		int b = 0;
		for (int i = 1; i < 22; i++) {
			b += i;
		}
		System.out.println(b);
		System.out.println("-----------");
		
		// 1 - 2 + 3 - 4 + ... - 10
		int c = 0;
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 1) {
				c += i;
			} else {
				c -= i;
			}
		}
		System.out.println(c);
		System.out.println("------------");
		
		int d = 0;
		for (int i = 1; i < 11; i++) {
			d += (i % 2 == 1) ? i : -i;
		}
		System.out.println(d);
		System.out.println("------------");
		
		int e = 0;
		int ee = 1;
		for (int i = 1; i < 11; i++) {
			ee *= -1;
			e += (i * ee);
		}
		System.out.println(e);
		System.out.println("------------");
		
		// 5!
		int f = 1;
		for (int i = 1; i < 6; i++) {
			f *= i;
		}
		System.out.println(f);
		System.out.println("-------------");
		
	}
}

import java.util.Scanner;

public class OMain2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("이름 : ");
		String name = keyboard.next();

		System.out.print("키 : ");
		double height = keyboard.nextDouble();

		System.out.print("나이 : ");
		int age = keyboard.nextInt();

		System.out.println("-----------");
		System.out.printf("이름은 %s, 키는 %.1fcm, 나이는 %d살\n", name, height, age);

		// 키가 150이상
		boolean a = (height >= 150); // 가독성을 위해 괄호 사용 가능
		System.out.println(a);

		// 나이가 5살만
		boolean b = (age == 5);
		System.out.println(b);

		// 키가 200미만
		boolean c = (height < 200);
		System.out.println(c);

		// 나이가 짝수
		boolean d = (age % 2 == 0);
		System.out.println(d);

		// 홍길동만
		boolean e = (name.equals("홍길동"));
		System.out.println(e);

		boolean f = (name == "홍길동");
		System.out.println(f);

		// 키가 150이상이고(and), 나이가 3살 이상
		boolean g = (height >= 150) && (age >= 3);
		System.out.println(g);

		// 키가 200이상이거나(or), 나이가 5살이상
		// 첫 번째 조건이 잘 없는 경우 검사횟수는 대부분 2번
		// 순서 변경
		// boolean h = (height >= 200) || (age >= 5);
		boolean h = (age >= 5) || (height >= 200);
		System.out.println(h);

		// 키가 180 넘든지 나이가 3살 넘든지
		// 둘 중 하나
		boolean i = (age > 3) ^ (height > 180);
		System.out.println(i);

		// i가 아닌 것만(i의 반대)
		boolean j = !i;
		System.out.println(j);
		
		// 5 <= 나이 <= 10만 → 확률 낮은 조건을 앞으로
		boolean k = (age <= 10) && (age >= 5);
		System.out.println(k);
		
		// 키가 150넘고, 키가 180넘으면 → 180넘기라는 의미 
		boolean l = (height > 180);
		System.out.println(l);
		
		
	}
}

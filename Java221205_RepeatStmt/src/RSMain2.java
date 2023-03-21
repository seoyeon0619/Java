
public class RSMain2 {
	public static void main(String[] args) {
		for (int dan = 2; dan < 10; dan++) {
			System.out.println(dan);
			for (int i = 1; i < 10; i++) {
				System.out.printf("%d x %d = %d\n", dan, i, dan * i);
		}
		}
		
		System.out.println("-------------------");
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
			System.out.printf("%d x 1 = %d\t ", j, i, j *i);
			}
			System.out.println();
		}
		System.out.println("-----------------");
		
		for (int i = 0; i < 6; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("-----------------");
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5-i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		System.out.println("-----------------");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i ; j++) {
				System.out.print("  ");
			}
			System.out.println("★");
		}
		System.out.println("-----------------");
		
		String c;
		
		for (int i = 0; i < 5; i++) {
			c = (i % 2 == 0) ? "ㅋ" : "ㅎ";
			for (int j = 0; j <= (i*2); j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	} // main
} // class

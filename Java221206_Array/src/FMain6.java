//기본형
//		int
//참조형
//		배열

//어려움
//     int[] b			int a
//Call by Reference, Call by Value
//b는 원본에 타격이 감
public class FMain6 {
	public static void test(int a, int[] b, int[] c) {
		System.out.println(a);
		System.out.println(b[0]);
		System.out.println(c[0]);
		a = 100;
		b[0] = 100;
		System.out.println(a);
		System.out.println(b[0]);
		System.out.println(c[0]);
	}

	public static void main(String[] args) {
		int a = 10;
		int[] b = { 10, 20 };
		int[] c = { 10, 20 };
		test(a, b, c); // 10 10	10 100 100 10 출력
		System.out.println(a); // 10 출력
		System.out.println(b[0]); // 100 출력 (위에 함수 호출 안하면 10)
		System.out.println(c[0]); // 10 출력
		// System.out.println(b); // 배열이 있는 실제 주소 -> [I@6504e3b2 이런식으로 출력
	}
}

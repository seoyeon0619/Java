//재귀함수
public class FMain2 {
	// 정수 n까지의 합
	public static int getTotalSum(int a) {
		return (a == 1) ? 1 : (getTotalSum(a - 1) + a);
	}

	// 정수 n까지의 Factorial
	public static int getTotalMul(int a) {
		return (a == 1) ? 1 : (getTotalMul(a - 1) * a);
	}

	// 정수 하나 입력하면 피보나치수열값 구하는 함수
	// 1 2 3 4 5 6 7  8  9
	// 1 1 2 3 5 8 13 21 24
	public static int getFibo(int a) {
		return (a < 3) ? 1 : (getFibo(a - 2) + getFibo(a - 1));
	}

	public static void main(String[] args) {
		System.out.printf("정수 n까지의 합 : %d\n", getTotalSum(4));
		System.out.printf("정수 n까지의 곱 : %d\n", getTotalMul(4));
		System.out.printf("피보나치 수열 값 : %d\n", getFibo(5));
	}

}

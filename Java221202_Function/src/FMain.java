import java.util.Scanner;

public class FMain {
	// 함수 정의(관련기능들을 묶어놓고)
	// public static 자료형 함수명(자료형 변수명, 자료형 변수명, ,,,)
	public static void yaDambae() {
		System.out.println("10000원 받아라");
		System.out.println("동네 슈퍼 가서");
		System.out.println("한라산 한갑 달라고 해라");
		System.out.println("남는 돈은 과자 하나 사먹고");
		System.out.println("한라산은 가져와");
	}

	// 정수 2개 넣으면 더 큰 숫자 출력하는 함수
	public static void printSum(int a, int b) {
		System.out.println(a + b);
	}

	// 정수 2개 넣으면 더 큰 숫자 출력하는 함수
	public static void printBigger(int a, int b) {
		System.out.println(a > b ? a : b);
	}

	// 정수 2개 넣으면 그 곱을 출력하는 함수
	public static void printMul(int a, int b) {
		System.out.print("정수 2개 : ");
		System.out.println(a * b);
	}

	// 정수 3개 넣으면 그 곱을 출력하는 함수
	public static void printMul(int a, int b, int c) {
		System.out.print("정수 3개 : ");
		System.out.println(a * b * c);
	}

	// 정수 1개 넣으면 *1000 구하기
	// 초 → 1000분의 1초(밀리초) 단위로 바꿔주는 함수
	public static int convertMilliSec(int second) {
		int milliSec = second * 1000;
		return milliSec;
		// return은 함수 종료를 의미 하므로 return 아래로는 쓰지 않음
	}

	// 정수 1개 넣으면 홀/짝 인지 구해주는 함수
	public static String getOddEven(int n) {
		return (n % 2) == 1? "홀" : "짝";
	}

	
	public static void main(String[] args) throws InterruptedException {
		// 2) 함수 호출(필요할때마다 호출해서 사용)
		yaDambae();
		System.out.println("----------");
		printSum(30, 10);
		printBigger(10, 10);
		System.out.println("----------");
		printMul(10, 10);
		printMul(10, 10, 10);
		
		System.out.println("----------");
		int ms = convertMilliSec(3);
		Thread.sleep(ms);
		
		String result = getOddEven(ms);
		System.out.println(result);

	}
}

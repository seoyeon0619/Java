import java.util.Scanner;

public class CSMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("중간고사 점수 : ");
		int a = input.nextInt();
		System.out.print("기말고사 점수 : ");
		int b = input.nextInt();
		double m = (a + (double) b) / 2;
		// double m = (a + b) / 2.0;

		System.out.println("-----------");
		System.out.printf("평균 : %.2f점\n", m);

		// 80점 이상이면 잘했다
		// 아니면 야!
		// 70점 이상이면 노력좀
		if (m >= 90) {
			System.out.println("수");
		} else if (m >= 80) {
			System.out.println("우");
		} else if (m >= 70) {
			System.out.println("미");
		} else if (m >= 60) {
			System.out.println("양");
		} else
			System.out.println("가");
	}
}

import java.util.Scanner;
// 단위에 신경쓰기
// 유지보수에 좋게 나눠서
// 통일성

public class Fmain4 {

	public static String getName() {
		Scanner input = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = input.next();
		return input.next();
	}

	public static double getHeight() {
		Scanner input = new Scanner(System.in);
		System.out.print("키 : ");
		double height = input.nextDouble();

		return (height < 3) ? getHeight() : height;
	}

	public static double getWeight() {
		Scanner input = new Scanner(System.in);
		System.out.print("몸무게 : ");
		return input.nextDouble();
	}

	public static double getStdWeight(double height) {
		return (height - 100) * 0.9;
	}

	public static double getBmi(double weight, double stdWeight) {
		return (weight / stdWeight) * 100;
	}

	public static String getResult(double bmi) {
		return (bmi > 120) ? "운동좀" : "정상";
	}

	public static void showResult(String name, double stdWeight, double bmi, String result) {
		System.out.printf("표준체중 : %.1fkg\n", stdWeight);
		System.out.printf("비만도 : %.1f%%\n", bmi);
		System.out.printf("%s님은 %s\n", name, result);
	}

	public static void main(String[] args) {
		String name = getName();
		double height = getHeight();
		double weight = getWeight();
		System.out.println("--------------");
		double stdWeight = getStdWeight(height);
		double bmi = getBmi(weight, stdWeight);
		String result = getResult(bmi);
		showResult(name, stdWeight, bmi, result);

	}
}

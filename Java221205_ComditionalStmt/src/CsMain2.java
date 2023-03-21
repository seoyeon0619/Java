import java.util.Scanner;

public class CsMain2 {

	public static String getName() {
		Scanner input = new Scanner(System.in);
		System.out.print("이름 : ");
		return input.next();
	}

	public static double getHeight() {
		Scanner input = new Scanner(System.in);
		System.out.print("키 : ");
		double height = input.nextDouble();
		return (height < 3) ? height : getHeight();
	}

	public static double getWeight() {
		Scanner input = new Scanner(System.in);
		System.out.print("몸무게 : ");
		return input.nextDouble();
	}

	public static double getBmi(double height, double weight) {
		return weight / (height * height);
	}

	public static String getResult(double bmi) {
		if (bmi >= 35) {
			return "고도비만";
		} else if (bmi >= 30) {
			return "중도비만";
		} else if (bmi >= 25) {
			return "경도비만";
		} else if (bmi >= 23) {
			return "과체중";
		} else if (bmi >= 18.5) {
			return "정상";
		} 
			return "저체중";
	}

	public static void showResult(String name, double bmi, String result) {
		System.out.printf("%s님 비만도 %.1f%%\n", name, bmi);
		System.out.printf("BMI결과 %s입니다\n", result);
	}

	public static void main(String[] args) {
		String name = getName();
		double height = getHeight();
		double weight = getWeight();
		System.out.println("----------");
		double bmi = getBmi(height, weight);
		String result = getResult(bmi);
		showResult(name, bmi, result);
		
	}

}

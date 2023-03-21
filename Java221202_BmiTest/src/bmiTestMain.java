import java.util.Scanner;

public class bmiTestMain {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = keyboard.next();
		
		System.out.print("키 : ");
		double height = keyboard.nextDouble();
		
		System.out.print("몸무게 : ");
		double weight = keyboard.nextDouble();
		
		double stdWeight = (height - 100) * 0.9;
		double bmi = (weight/stdWeight) * 100;
		
		System.out.println("----------");
		System.out.printf("표준체중 = %.1fkg, 비만도 = %.1f%%\n", stdWeight, bmi);
		System.out.printf("%s님은 %s\n", name, (bmi > 120) ? "운동좀하세요!" : "정상");
		
		System.out.print("아무거나 쓰면 종료 : ");
		keyboard.next(); // 변수가 필요없는 상황히 변수 선언하지 않음
	}

}

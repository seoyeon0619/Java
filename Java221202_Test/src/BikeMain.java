import java.util.Scanner;

public class BikeMain {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("<자전거 이동거리 계산>");
		System.out.print("바퀴 둘레 (앞뒤 같음) : ");
		double wheel = keyboard.nextDouble();

		System.out.print("앞 기어 톱니 수 : ");
		int gearCount_1 = keyboard.nextInt();
		
		System.out.print("뒷 기어 톱니 수 : ");
		int gearCount_2 = keyboard.nextInt();
		
		System.out.print("발 구른 횟수 : ");
		int count = keyboard.nextInt();
		
		double dist = (gearCount_1/(double)gearCount_2)*wheel*count;
		System.out.println("----------------------");
		System.out.printf("이동거리 : %.2fm", dist);
	}
}

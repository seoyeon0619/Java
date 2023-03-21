import java.util.Scanner;

public class PriceMain {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("구매한 금액: ");
		int buy = keyboard.nextInt();
		
		System.out.print("지불한 금액 : ");
		int me = keyboard.nextInt();
		
		System.out.println("------------");
		int calculate_back = (me-buy);
		
		int money = 50000;
		int count = calculate_back / money;
		System.out.printf("%d원짜리 %d개\n", money, count);
		
		calculate_back %= money;
		
		int money_10000 = 10000;
		int count_10000 = calculate_back / money;
		System.out.printf("%d원짜리 %d개\n", money, count);
		
		
		

	}

}

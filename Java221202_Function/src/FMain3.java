import java.util.Scanner;

// recursive : 원하는 값을 입력할 때까지 물고 늘어지게

public class FMain3 {
	//홀수만 입력가능하고, 짝수 입력 시 재입력 하도록
	public static int getOnlyOdd() {
		Scanner input = new Scanner(System.in);
		System.out.print("x : ");
		int a = input.nextInt();
		return (a % 2 == 1) ? a : getOnlyOdd();
	}

	public static void main(String[] args) {
		int b = getOnlyOdd();
		System.out.println("---------");
		System.out.printf("x는 %d", b);
	}
}

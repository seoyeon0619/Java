import java.util.Random;
import java.util.Scanner;

public class PPSMain4 {
	
	public static void printRule(String[] handTable) {
		for (int i = 1; i < handTable.length; i++) {
			System.out.printf("%d. %s\n", i, handTable[i]);
		}
		System.out.println("--------");		
	}
	
	public static int printCom() {
		Random r = new Random();
		return r.nextInt(3) + 1; // 0부터 시작하므로 + 1
	}
	
	public static int printUser() {
		Scanner k = new Scanner(System.in);
		System.out.print("user : ");
		int userHand = k.nextInt();
		return (userHand < 1 || userHand >3) ? printUser() : userHand;
	}
	
	public static void printHand(String[] handTable, int comHand, int userHand) {
		System.out.printf("Com : %s\n", handTable[comHand]); 
		System.out.printf("User : %s\n", handTable[userHand]);
	}
	
	// 판정 결과가 main으로 전달되어야 함
	public static int judge(int comHand, int userHand) {
		int t = userHand - comHand;
		if (t == 0) {
			System.out.println("비겼습니다!");
			return 0;
		} else if (t == 2 || t == -1) {
			System.out.println("졌습니다!");
			return -1;
		} else {
			System.out.println("이겼습니다!");
			return 1;
		}
	}
	
	public static void printResult(int win) {
		System.out.printf("%d연승", win);
	}
	public static void main(String[] args) {
		String[] handTable = { "엥", "가위", "바위", "보" };
		printRule(handTable);
		
		int comHand;
		int userHand;
		int win = 0; 
		int count = 0;
		
		while (true) {
			comHand = printCom();
			userHand = printUser();
			printHand(handTable, comHand, userHand);
			
			count = judge(comHand, userHand);
			if (count == -1) {
				printResult(win);
				break;
			}
			win += count;
			System.out.println("--------");
			
			} // while
		}// main
	}// class

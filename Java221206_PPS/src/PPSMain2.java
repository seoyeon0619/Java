//거스름돈 구하기
import java.util.Scanner;

public class PPSMain2 {
	public static void main(String[] args) {
		//원 감당을...
		int 거스름돈 = 73290;
		int 원 = 50000;
		int 몇개;
		int a = 5;
		while(true) {
			몇개 = 거스름돈 / 원;
			System.out.printf("%d원짜리 %d개\n",원, 몇개);
			거스름돈 %= 원;
			for (int i = 0; i < args.length; i++) {
				
			}
			if (거스름돈 < 10) {
				break;
			}
			원 /= a;
			a = (a == 5) ? 2: 5;  //처음에는 5로 나누고 다음에는 2로 나누고 퐁당퐁당
		}
		
//        int[] money = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };

        //방법 1
//        for (int i = 0; i <= money.length - 1; i++) {
//                if (거스름돈 / money[i] >= 0) {
//                        System.out.printf("%d원짜리 : %d개\n", money[i], 거스름돈 / money[i]);
//                        거스름돈 %= money[i];
//                }
//        }
        //방법2
//		int 몇개;
//		for (int 원 : money) {
//			몇개 = 거스름돈 / 원;
//			System.out.printf("%d원짜리 %d개\n",원, 몇개);
//			거스름돈 %= 원;
//		}
	}
	
}
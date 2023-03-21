import java.util.Random;
import java.util.Scanner;

// 한국어로 설계 -> 직역 ->
// 안내 멘트
// 반복문
	// 컴퓨터가 내고
	// 유저가 내고
	// 판정하고
// 질때까지해서
//연승횟수 출력
public class PPSMain4 {

	public static int me() {
		Scanner k = new Scanner(System.in);
		return k.nextInt();
	}

	public static int com() {
		Random r = new Random();
		return r.nextInt(2);
	}

	public static void main(String[] args) {
		String[] 가위바위보 = { "가위", "바위", "보" };
		System.out.println("<1번, 2번, 3번 중에 골라 가위바위보를 하세요!>");
		System.out.printf("1. %s 2. %s 3. %s\n", 가위바위보[0], 가위바위보[1], 가위바위보[2]);
		System.out.print("User: ");

		int kNum = me();
		int cNum = com();

		while (cNum == 0 || cNum == 1 || cNum == 2) {
			if (cNum == 0) {
				System.out.printf("컴퓨터: %s\n", 가위바위보[0]);
				break;
			} else if (cNum == 1) {
				System.out.printf("컴퓨터: %s\n", 가위바위보[1]);
				break;
			} else if (cNum == 2) {
				System.out.printf("컴퓨터: %s\n", 가위바위보[2]);
				break;
			}

		}

		while (kNum == 1 || kNum == 2 || kNum == 3) {
			if (kNum == 1) {
				System.out.printf("당신: %s", 가위바위보[0]);
				break;
			} else if (kNum == 2) {
				System.out.printf("당신: %s", 가위바위보[1]);
				break;
			} else if (kNum == 3) {
				System.out.printf("당신: %s", 가위바위보[2]);
				break;
			}

		}
	}
}

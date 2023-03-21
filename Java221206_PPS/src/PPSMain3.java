import java.util.Random;
import java.util.Scanner;

// 업다운 게임
// 컴퓨터가 1~10000 사이의 랜덤한 숫자 생각해놓고 맞추기

public class PPSMain3 {
	public static int pickAns() {
		Random r = new Random();
		return r.nextInt(10000) + 1;
	}

	public static int tellAns() {
		Scanner k = new Scanner(System.in);
		System.out.println("뭐 : ");
		int x = k.nextInt();
		return (x < 1 || x > 10000) ? tellAns() : x; // 0보다 작거나 10000보다 크면 다시
	}

	// 계속 게임 해야하면 true 그만해야하면 false
	public static boolean judge(int gameAns, int x) {
		if (x == gameAns) {
			// System.out.printf("횟수 : %d", 횟수);
			return false;
		} else if (x > gameAns) { // else if문 없애고 3항연산자로 대체 가능
			System.out.println("DOWN");
		} else {
			System.out.println("UP");
		}
		System.out.println("------------");
		return true;
	}

	public static void printResult(int 횟수) {
		System.out.printf("%d턴만에 정답", 횟수);
	}

	public static void main(String[] args) {
		int gameAns = pickAns();
		//System.out.println(gameAns); // 컴퓨터가 생각한 정답
		int x;
		// int 횟수 = 0;
		for (int 횟수 = 1; true; 횟수++) {
			x = tellAns();

//		while (true) {
//			횟수++;
//			x = tellAns();

			if (!judge(gameAns, x)) { // if (said == false)를 if (!said)로 생략 가능
				printResult(횟수);
				break; // if (said == true)이면 if (said)}
			}
		}
	}
}

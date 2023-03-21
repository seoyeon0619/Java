// 강사님이 하신거
public class Referee {
	int userWin;

	static String[] ruleBook = { null, "가위", "바위", "보" }; // 공통 속성이므로 static

	public void readRuleBook() {
		for (int i = 1; i < ruleBook.length; i++) {
			System.out.printf("%d. %s\n", i, ruleBook[i]); // 나머지는 출력
		}
		System.out.println("------------");
	}

	public void start(User u, Enemy e) {
		readRuleBook();
		int userHand;
		int enemyHand;
		while (true) {
			enemyHand = enemyFire(e);
			System.out.println(enemyHand);
			userHand = userFire(u);
			// System.out.println(userHand);
			tellHand(userHand, enemyHand);
			if (judge(userHand, enemyHand)) {
				bye();
				break;
			}
			System.out.println("------------");
		}
	}
	public void bye() {
		System.out.println("------------");
		System.out.printf("%d연승\n",userWin);
	}

	public int userFire(User u) {
		System.out.println("뭐 : ");
		int uh = u.say();
		return (uh < 1 || uh > 3) ? userFire(u) : uh;
	}

	public int enemyFire(Enemy e) {
		return e.think();
	}

	public void tellHand(int userHand, int enemyHand) {
		System.out.printf("컴 : %s\n", ruleBook[enemyHand]);
		System.out.printf("너 : %s\n", ruleBook[userHand]);
	}

	public boolean judge(int userHand, int enemyHand) {
		int t = userHand - enemyHand;
		if (t == 0) {
			System.out.println("무");
		} else if (t == -1 || t == 2) {
			System.out.println("패");
			return true;
		} else {
			System.out.println("승");
			userWin++;
		}
		return false;

	}
}

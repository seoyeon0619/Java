import java.util.Scanner;

// 강사님이 하신거
public class User {
	Scanner brain;
	int userWin;

	// 생성자
	public User() {
		brain = new Scanner(System.in);
	}

	public int say() {
		return brain.nextInt();
	}
}

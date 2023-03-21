import java.util.Scanner;
// 유지보수 하기 좋은 프로그램은 만들 때 작업량이 많은 것이 맞음

public class Guest {
	String name;
	double height;
	double weight;
	double bmi;
	String status;

	// Scanner 변수명도 real world에 가깝게
	// 지역변수나 파라미터로 사용하면 안됨
	// 속성으로 사용해야 함
	Scanner mouth = new Scanner(System.in);
	
	public String tellName() {
		return mouth.next();
	}
	
	public double tellHeight() {
		return mouth.nextInt();
	}
	
	public double tellWeight() {
		return mouth.nextInt();
	}
	
}

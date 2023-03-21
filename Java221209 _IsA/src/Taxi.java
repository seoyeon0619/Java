// 세상의 모든 차 : 이름, 가격
// 택시 : 이름, 가격, 기본료

// Car로부터 상속받은 Taxi
// Car에 있는 멤버들 상속됨
// Car에 있는 printInfo()를 물려받아왔음
// Car에 있는 printInfo()는 이름, 가격만 출력해서 아쉬움
// 물려받은 printInfo()를 기본료까지 뜨게 하고 싶다
// printInfo() 메소드 재정의 : overriding
public class Taxi extends Car {
	int pay;
	
	@Override
	public void printInfo() {
		super.printInfo(); // Car에 있는 printInfo
		System.out.println(pay); // 기능 추가
	}
}

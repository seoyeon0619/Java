// 이런 상황은 거의 없음
// Product에 있는 생성자 그대로 쓰고 싶다
// Java는 새성자 상속 안시켜줌
// 아쉬운 상황
// 상속받아 오는 것이 있어도 생성자 선택하여 만드는 옵션이 안뜸

public class Shoes extends Product {
	
	public Shoes() {
	}

	public Shoes(String name, int price) {
		super(name, price);
	}
	
	
}

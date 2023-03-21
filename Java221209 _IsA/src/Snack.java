
public class Snack extends Product{
	int date;
	
	public Snack() {
	}
	
	public Snack(String name, int price, int date) {
		//super(); // 상위클래스 기본생성자 부름 (있어도 없어도 부름) : Product기본생성자
		super(name, price); //상위클래스에 있는 이름 가격 부름
		this.date = date;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println(date);
	}
	
}

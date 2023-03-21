// 속성
public class Dog {
	// 멤버 변수
	String name;
	int age;

	// Method
	public void bark() {
		System.out.println("멍!");
	}

	public void printInfo() {
		System.out.println(this.name); // this 생략가능
		System.out.println(age);
	}
}

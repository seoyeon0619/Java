
public class OMain3 {
	public static void main(String[] args) {
		int a = 3 << 2; // shift 연산자
		System.out.println(a);
		System.out.println("-----------");
		
		int age = 15;
		//나이가 20살 이상 어서오세요, 안되면 저리가!
		String say = (age >= 20) ? "어서오세요" : "저리가!";
		System.out.println(say);		
	}
}

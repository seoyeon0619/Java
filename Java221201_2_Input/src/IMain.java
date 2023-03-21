import java.util.Scanner;

public class IMain {
	public static void main(String[] args) {
		// 콘솔창에 입력받을 준비
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("모델명 : ");
			
		// 콘솔창에 입력한 글자 가져와서
		String name = keyboard.next();
		
		System.out.print("가격 : ");
		// 콘솔창에 입력한 정수 가져와서
		int price = keyboard.nextInt();
		
		System.out.print("번호 : ");
		String no = keyboard.next();
		
		System.out.print("화면 크기 : ");
		double size = keyboard.nextDouble();
		
		System.out.print("약정 : ");
		boolean end = keyboard.nextBoolean();
		
		// 입력받은 것 출력
		System.out.println("-----");
		System.out.println(name);
		System.out.println(price);
		System.out.println(no);
		System.out.println(size);
		System.out.println(end);
		System.out.printf("번호 : %s, 화면 : %.1f", no, size); //배치 순서대로
	}
}

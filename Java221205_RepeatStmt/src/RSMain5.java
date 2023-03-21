// 횟수 for
// 배열 탐색용 for-each(python)
// 조건 while, do-while
public class RSMain5 {
	public static void main(String[] args) {
		//java -jar 파일명 aaa bbb ccc ...로 실행하면 그게 배열로 들어감
		for (String s : args) {   //CMD 창에서 java -jar rs.jar dfdf dag라고 치면 결과 값이 dfdf dag가 배열로 들어가게 됨.
			System.out.println(s);
		}
		System.out.println("---------------------");
		
		

		double temp[] = { -3, 10.5, 2, 12 };

		// 차례대로 출력
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
		System.out.println("-------------");

		for (int i = 0; i < temp.length; i++) {
			double d = temp[i];
			System.out.println(d);
		}
		System.out.println("---------------");

		// index(i) 부분이 없어서 활용도는 떨어짐
		// 순서 조절이 불가능
		for (double d : temp) { // 위의 내용이랑 똑같음
			System.out.println(d);
		}
	}
}

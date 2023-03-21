// 변수 : 데이터 임시로 저장
// 		변수1 : 데이터 1	
// 배열 : 데이터 n개 들어가는 변수
//		변수1 : 데이터 n
// 만들 때 칸 수 넣고, 그 후 변경 불가 -> 활용도 떨어짐. 그래서 잘 사용 안함
public class AMain {
	public static void main(String[] args) {
		// 오리지널
//		int[] eng = new int[4]; //4는 몇개짜리인지
//		eng[0] = 90;
//		eng[1] = 30;
//		eng[2] = 50;
//		eng[3] = 66;
		
		//과도기 
		int[] mat = new int[] {50,90};

		//새로운 방법
		// 학생 3명 국어점수
		//int kor[];
		int[] kor = {100, 90, 80}; //배열 사용하여 변수 kor안에 데이터 3개 저장
		
		System.out.println(kor[1]); // 0번부터 셈
		System.out.println(kor.length); //총 데이터 몇개
		System.out.println("----------"); // 0번부터 셈

		//for문 자동완성
		for (int i = 0; i < kor.length; i++) {
			System.out.println(kor[i]);
		}
	}
}

// part2 : 객체지향프로그래밍 : real월드 묘사
// 객체지향 프로그래밍 지원하는 언어에서 2차원 배열
public class AMain2 {
	public static void main(String[] args) {
		int[] kor = { 100, 90, 80 };
		// 배열 속의 배열
		int[][] score = { { 100, 90, 80 }, { 90, 50, 60 }, { 12, 33, 12 } };
		System.out.println(score[0]); // score배열의 첫번째 배열 -> 그 위치를 나타냄 [I@6504e3b2
		System.out.println(score[0][1]); // score배열의 첫번째 배열 안에 2번째 값을 나타냄 90
		for (int[] is : score) {
			for (int is2 : is) {
				System.out.println(is2); // 배열속의 배열(모든 값) 나열
			}
		}
	}
}

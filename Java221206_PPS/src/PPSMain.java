// 주차장        1 << 0 = 1
// 와이파이        1 << 1 = 2
// 흡연실        1 << 2 = 4
// 24시간        1 << 3 = 8
// 13이면 주차장, 흡연실, 24시간 뜸
// 5이면 흡연실, 주차장 뜸

public class PPSMain {
	public static void main(String[] args) {
		String company[] = { "주차장", "와이파이", "흡연실", "24시간" }; // string 배열

		int option = 15; // 결과 값

		for (int i = company.length - 1; i >= 0; i--) { // 배열 company의 길이-1부터 길이가 0보다 크거나 같아질 때까지 반복. i는 하나씩 제거
			// System.out.println(i);
			if (option >= (1 << i)) { // 만약 option값이 1 << i(숫자)보다 크거나 같으면
				System.out.println(company[i]); // 배열 company의 i번째 값 출
				option -= (1 << i); // option에서 출력된 값 빼기
			}
		}
	}
}

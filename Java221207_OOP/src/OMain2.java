
public class OMain2 {
	public static void main(String[] args) {
		// 뭐 하나 만들고
		Student s = new Student();
		System.out.println(s); // 메모리 주소 값
		s.name = "이서연";
		s.age = 23;
		s.score = 100;
		s.StudentInfo();
		System.out.println("-----");

		// 다른거 하나 더 만들 때
		Student s2 = new Student();
		System.out.println(s2); // s2 메모리 주소 값
		s2.name = "가나다";
		s2.age = 22;
		s2.score = 100;
		s2.StudentInfo();
		System.out.println("-----");
		
		//첫 번째랑 같은거 하나 더
		Student s3 = s;
		System.out.println(s3); // s3 메모리 주소 값 = s 주소 값 
		s3.age = 13;
		s3.StudentInfo();
		System.out.println("-----");
		s.StudentInfo();
		
		//null : 참조형 변수가 아무 곳도 가리키지 않음 
		s = null;
		// s.StudentInfo(); → 주소를 잃었음
		System.out.println("-----");
		s3 = null; // s3 주소도 잃음

		
	}
}

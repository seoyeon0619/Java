import java.util.ArrayList;
import java.util.Comparator;

import com.yeon.uc.student.Student;

public class UCMain2 {
	public static void main(String[] args) {
		Student s = new Student("홍길동", 100, 90, 80);
		s.printInfo();
		System.out.println("-----");

		ArrayList<Student> students = new ArrayList<>();
		students.add(s);
		students.add(new Student("김길동", 90, 80, 70));
		students.add(new Student("이길동", 60, 80, 72));
		students.add(new Student("박길동", 58, 25, 79));
		students.add(new Student("최길동", 77, 88, 98));

		// 두번째학생의 수학점수
		System.out.println(students.get(1).getMath());
		System.out.println("-----");

		// 세번째 학생 정보
		students.get(2).printInfo();
		System.out.println("-----");

		// 전부다
		for (int i = 0; i < students.size(); i++) {
			students.get(i).printInfo();
		}
		System.out.println("-----");

		// 1등인 학생의 이름
		students.sort(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				Integer o1Score = o1.getKor() + o1.getEng() + o1.getMath();
				Integer o2Score = o2.getKor() + o2.getEng() + o2.getMath();
				return o2Score.compareTo(o1Score);
			}
		});
		System.out.println(students.get(0).getName());
		System.out.println("-----");
		
		
		// 이름 가나다순 정렬해서 출력
		students.sort(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				String o1Name = o1.getName(); 
				String o2Name = o2.getName(); 
				return o1Name.compareTo(o2Name);
			}
		});
		for (int i = 0; i < students.size(); i++) {
			students.get(i).printInfo();
		}
		System.out.println("-----");
		
		
		
		
		
	}
}

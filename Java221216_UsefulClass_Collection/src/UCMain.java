import java.util.ArrayList;
import java.util.Comparator;

public class UCMain {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("ㅋ");
		System.out.println(al.get(0));
		System.out.println(al.get(1));

		System.out.println("-----");

		ArrayList<Integer> al2 = new ArrayList<>();
		al2.add(100);
		al2.add(200);
		al2.add(300);
		al2.add(1, 1); // 위치지정 1번자리에 1 넣기
		al2.set(0, 999); // 0번자리 999로 바꾸기
		al2.remove(2); // 2번 데이터 지우기 
		
		// 리스트 정렬
		Comparator<Integer> c = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o1.compareTo(o2); // 오름차순 
			//  return o2.compareTo(o1); 내림차순
			}
		};
		
		al2.sort(c);
		
		for (Integer a : al2) {
			System.out.println(a);
		}
		System.out.println("-----");
		
		for (int i = 0; i < al2.size(); i++) {
			System.out.println(al2.get(i));
		}
		System.out.println("-----");
	}
}

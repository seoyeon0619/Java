// HasA

public class OMain {
	public static void main(String[] args) {

		Dog d = new Dog("후추", 2 );
		d.printInfo();
		System.out.println("-----");
		
		People p = new People("홍길동", 30);
		p.printInfo();
		System.out.println("-----");
		
		People p2 = new People("이서연", 23, d);
		p2.printInfo();
		System.out.println("-----");
		
		
		// 후추 2살짜리 개의 주인 이서연, 23살이라는 사람
		// 이 사는 수원, 인구가 200만인 도시
		// 도시 정보 출력하면 모든 정보가 뜨도록
		
		City c = new City("수원", 2000000, p2);
		c.printInfo();
		System.out.println("-----");
		
		// c의 이름
		System.out.println(c.name);
		
		// c에 사는 사람 이름
		System.out.println(c.people.name);
		// c에 사는 사람의 전체 정보
		c.people.printInfo();
		// c에 사는 사람이 키우는 개 이름
		System.out.println(c.people.pet.name);
		// c에 사는 사람이 키우는 개 전체 정보
		c.people.pet.printInfo();
		System.out.println("-----");
	}
}

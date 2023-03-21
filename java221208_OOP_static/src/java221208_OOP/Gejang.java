package java221208_OOP;
// 쇼핑몰
// 모든 게장 제품 품절
// Q&A 게시판
//	게장 얼마요?
//	게장 몇 kg인가요? 
//	게장 누가 만들어요? → 품절되어도 답변할 수 있음

// 전세계의 모든 게장은 김수미가 만든것으로 가정
public class Gejang {
	String name;
	double weight;
	int price;
	static String MADE = "김수미";
	//String made = "김수미"; → 쓰레기코드 (절대로 하면 안되는 것)
	// 기본값을 주고 싶은데
	// 객체들의 공통속성 
	// 그럴때 static 사용
	//static final String made = "김수미";
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(weight);
		System.out.println(price);
		System.out.println(MADE);
	}
	// 객체 없이도 쓰는
	public static void test() {
		System.out.println(MADE);
		//System.out.println(name); → static 아닌거 사용 불가
		System.out.println("테스트");
	}
}

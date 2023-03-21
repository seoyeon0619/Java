//주차장		1 << 0 = 1
//와이파이		1 << 1 = 2
//흡연실		1 << 2 = 4
//24시		1 << 3 = 8

public class CSMain4 {
	public static void main(String[] args) {
		
	int option = 13;
	
	if (option >= 8) {
		System.out.println("24시간");
		option -= 8;
	} if (option >= 4) {
		System.out.println("흡연실");
		option -= 4;
	} if (option >=2) {
		System.out.println("와이파이");
		option -= 2;
	} if (option >=1) {
		System.out.println("주차장");
		option -= 1;
	}
	}
}

package java221208_OOP;

public class Computer {
	String cpu;
	int ram;
	int hdd;
	
	public Computer() {
		hdd = 500; // 기본값 주고싶을 때
		System.out.println("ㅋ");
	}
	
	public void printInfo() {
		System.out.println(cpu);
		System.out.println(ram);
		System.out.println(hdd);
	}
	
}


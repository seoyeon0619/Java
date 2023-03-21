package com.yeon.uc.main;
// JVM이 만들어 준거 메인스레드
// 사람이 만든거 서브스레드

// 메인스레드 0.3마다 ㅋ 10번 출력하고 종료
// 서브스레드 0.3초마다 ㅎ 무한 출력
// 메인스레드 끝난다고 서브 스레드도 끝나는 것이 아님
public class UCMain2 {
	public static void main(String[] args) {
		Thread t = new Thread(new MyT());
		t.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("ㅋ");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

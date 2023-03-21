package com.yeon.uc.people;

// 멀티 스레드 
// 스레드 2개가 brain을 공유하고있음
public class People {
	private String brain;
	
	// synchronized는 하나만 (동시 실행이 안되는 메소드)
	private synchronized void sayName() {
		for (int i = 0; i < 10; i++) {
			brain = "이서연";
			try {
				Thread.sleep(100);
				System.out.printf("이름 : %s\n", brain);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}
	
	private synchronized void sayHobby() {
		for (int i = 0; i < 10; i++) {
			brain = "뒹굴뒹굴";
			try {
				Thread.sleep(300);
				System.out.printf("취미 : %s\n", brain);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void introduce() {
		Thread t = new Thread() {
			@Override
			public void run() {
				super.run();
				sayName();
			}
		}; // 객체만들면서 클래스 생성 
		t.start();
		sayHobby();
	}
	
	
}

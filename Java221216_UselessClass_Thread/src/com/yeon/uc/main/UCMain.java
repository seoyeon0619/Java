package com.yeon.uc.main;

public class UCMain {
	public static void main(String[] args) {
		
		MyThread mt = new MyThread();
		mt.start(); // 새 Thread 만들어서 run실행
		
		
		Thread t = new Thread(new MyThread2());
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

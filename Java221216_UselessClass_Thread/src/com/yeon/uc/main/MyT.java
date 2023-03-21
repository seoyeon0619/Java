package com.yeon.uc.main;

public class MyT implements Runnable{
	@Override
	public void run() {
		while (true) {
			for (int i = 0; i < 10; i++) {
				System.out.println("ㅎ");
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			
		}
	}
}

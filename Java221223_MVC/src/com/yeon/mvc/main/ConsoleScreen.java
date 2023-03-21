package com.yeon.mvc.main;

import java.util.Scanner;

public class ConsoleScreen {
	
	private Scanner strawSystem;
	
	public ConsoleScreen() {
		strawSystem = new Scanner(System.in);
	}
	
	public int getX() {
		System.out.print("x : ");
		return strawSystem.nextInt();
	}
	
	public int getY() {
		System.out.print("y : ");
		return strawSystem.nextInt();
	}
	
	public void printResult(CalcResult cr) {
		System.out.println("-----");
		System.out.println(cr.getHab());
		System.out.println(cr.getCha());
		System.out.println(cr.getGob());
		System.out.println(cr.getMok());
	}
	
	public void cut() {
		strawSystem.close();
	}
}

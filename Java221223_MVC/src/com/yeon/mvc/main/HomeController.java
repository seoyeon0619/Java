package com.yeon.mvc.main;

public class HomeController {
	public static void main(String[] args) {
		ConsoleScreen cs = new ConsoleScreen();
		int x = cs.getX();
		int y = cs.getY();
		
		CalcResult cr = Calculator.Calculate(x, y);
		
		cs.printResult(cr);
		
		cs.cut();
	}
}

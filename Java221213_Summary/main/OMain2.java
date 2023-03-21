package com.kwon.dec132oop.main;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JTextField;

import com.kwon.dec132oop.spiderman.Spiderman;

// JFrame은 클래스가 이미 있으니까 만들지말고
public class OMain2 {
	public static void main(String[] args) {
		// 제목이 지구인 JFrame
		JFrame p = new JFrame("지구");
		// 텍스트가 홍길동인 JButton
		JButton h = new JButton("홍길동");
//		JTextField h = new JTextField("홍길동");
//		JFileChooser h = new JFileChooser("홍길동");
//		JFormattedTextField h = new JFormattedTextField("홍길동");
		
		
		//자바의 영역--------------------------------------
		// ActionListener
		//		actionPerformed 기능이 반드시 있어야하는 영웅
		// 		actionPerformed를 추상 메소드로 하자
		// 		추상 클래스 또는 인터페이스
		// 		상속라인은 막기는 싫으니 -> 인터페이스
		//-------------------------------------------------
		
		//  스파이더맨(ActionListener) - singleton말고
		Spiderman s = new Spiderman();
		
		// 찜하기
		h.addActionListener(s); // pick같은거
		
		// 지구에 입주
		p.add(h);
		// 그게 사이즈가 500, 300
		p.setSize(500, 300);
		// 보이게
		p.setVisible(true);

	}
	
}

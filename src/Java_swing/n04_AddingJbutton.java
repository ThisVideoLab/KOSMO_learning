package Java_swing;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class n04_AddingJbutton {
	public static void main(String[] args) {
		
		// 이전까지 완성한 프레임 시작
		
		JFrame frame = new JFrame("welcome to java"); // 프레임 생성시에 괄호안에 들어가는 텍스트가 창의 이름이 된다.
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension( 840 , 840/12*9));
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false); // true: 조작가능 / false 조작불가능
		JPanel panel1 =new JPanel();
		frame.add(panel1);
		panel1.setLayout(new BorderLayout());

		// 이전까지 완성한 프레임 끝

		//1. JButton : 말 그대로 JFrame 상에서 쓰이는 버튼, 버튼 위에 글씨도 써 넣을 수 있음.
		//			   이 버튼의 상태 변화를 조건절로 삼아, 원하는 구문을 실행시킬 수 있음.
			
		JButton btn1 = new JButton("from JButton btn1"); // 버튼 객체의 생성
		
		panel1.add(btn1 , BorderLayout.WEST); // 존재하는 패널에 버튼을 추가해줌 
				
		
		
	//문서의끝
	}
}

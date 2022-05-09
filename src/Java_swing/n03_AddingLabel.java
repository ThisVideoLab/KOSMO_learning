package Java_swing;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// 패널을 좀 더 다채롭게 꾸며주고, 기능을 추가할 수 있는 요소들에 대해서 알아보자.


public class n03_AddingLabel {
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

		// 이전까지 완성한 프레임 끝

		//1. BorderLayout: 보더 레이아웃은 panel의 위치를 깔끔하게 다듬어주는 컴퍼넌트임.
				
		panel1.setLayout(new BorderLayout()); // 이렇게 입력한 순간에, 라벨 jbl1을 포함해, 앞서 입력했던 라벨들이
											  // 모두 사라지는 현상이 발생한다. 그 이유는 세로운 보더레이아웃이 덧씌워졌기 때문임.
		
		//2. JLabel: 간단하게 글을 입력해주는 코드. 그냥 라벨에 글을 써서 붙이는 것처럼 간단한 기능임.
		//   		 앞서 살펴본 것처럼 간단하게 바로 입력도 가능하고, 객체를 생성한 후에 add로 추가도 가능함.
		
		panel1.add(new JLabel("panel1.add(new JLabel1"), BorderLayout.NORTH); 
		
		JLabel jlb2 = new JLabel("JLabel jlb2 = new JLabel"); // 이렇게 넣으면, 윗줄에 넣었던 코드 자리에 들어가면서
		panel1.add(jlb2);														// 기존에 있던 라벨 메시지는 사라지고 만다
		
		panel1.add(new JLabel("panel1.add(new JLabel2"), BorderLayout.BEFORE_FIRST_LINE);
		// 그럴 경우 이러한 BorderLayout.??을 사용해서 ??의 선택시에서 알맞은 녀석을 골라 넣으면 됨. 이때 반드시 대문자를 사용할 것
				
	//문서의 끝
	}
}

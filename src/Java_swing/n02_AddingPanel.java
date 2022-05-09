package Java_swing;
// 자바 프레임에 들어가는 패널과 패인의 차이에 대해 알아보자

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class n02_AddingPanel {
	public static void main(String[] args) {

		// 이전까지 완성한 프레임 시작
		
		JFrame frame = new JFrame("welcome to java"); // 프레임 생성시에 괄호안에 들어가는 텍스트가 창의 이름이 된다.
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension( 840 , 840/12*9));
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false); // true: 조작가능 / false 조작불가능
		
		// 이전까지 완성한 프레임 끝

		//1. 패널 (Panel)이란?
		// 패널은 가장 단순한 컨테이너 클래스로, 다른 컴포넌트들이나 패널들을 담을 수 있는 공간을 제공함.
		// 프레임이 단순한 뼈대라면, 패널은 그 뼈대에 올려놓을 수 있는 바구니쯤되는 컴퍼넌트임.
		
		
		//2. 먼저 패널을 객체를 생성하도록 한다.
		JPanel panel1 =new JPanel();
		
		//3. 생성된 객체를 프레임에 추가해준다
		frame.add(panel1); 
		
		//4. label을 활용한 간단한 문자 출력
		
		panel1.add(new JLabel ("Welcome to the RealWorld"));
		
		//5. label 객체를 생성한 후 문자 출력
		
		JLabel jlb1 = new JLabel("Welcome to the RealWorld  written by jlb1");
		panel1.add(jlb1);
		
		
		         
		
		
		
		
	//문서의끝
	}
}

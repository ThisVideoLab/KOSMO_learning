package Java_swing;
// 자바 프레임의 가장 기초적인 생성을 알아보자

import javax.swing.*;
import java.awt.Dimension;

public class n01_MakingFrame {
	public static void main(String[] args) {

		//0. 먼저 새 윈도우 프레임을 생성해준다. 괄호안에 들어가는 텍스트는 창의 이름이 된다.
		
		JFrame frame = new JFrame("welcome to java");
		
		//1. gui 환경에서 사용자에게 화면을 보이게 해줌. 기본값이 false이므로, 창을 현현시키기 위해서는 true를 입력함
		
		frame.setVisible(true);
		
		///2. 프레임의 종횡비를 결정. 일반적인 디스플레이 비율인 4:3 비율에 맞춰 설정
		//    이 때, preferredsize는 최대한 지정한 비율에 가깝도록 화면을 만들어줌.
	
		frame.setPreferredSize(new Dimension( 840 , 840/12*9));
	
		//3. 프레임의 크기를 설정. 위에는 종횡비였다면, 이 파트는 절대적인 크기를 의미함.  원하는 크기대로 입력할 것
		
		frame.setSize(400,400);
		
		//4. 위 과정을 통해 성공적으로 프레임을 구현했다면, 종료하는 기능도 넣어줘야 함. 실제로 별도의 종료 기능을 넣어주지 않으면 
		// 생성된 새 윈도우 창의 닫힘 버튼을 클릭하더라도 꺼지지 않는 모습을 보여줌.
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		//5. 프레임이 생성되는 최초의 위치를 지정할 수 있다. 이 위치라는 것은 우리가 화면을 보는 모니터로,
		// null값을 주면 보통 모니터 정중앙에 화면이 실행되는 모습을 볼 수 있다. 프레임내 위치가 아닌 프레임 자체임을 기억하자
		
		frame.setLocationRelativeTo(null);
		
		//6. 프레임 크기의 임의 조작을 허용할지에 대한 코드. 프레임을 유동적으로 배치하지 않은 경우에는 잠궈서 원하는 크기 및 
		//   배치로 보여줄 수 있는 장점이 있ㅇ지만, 사용자 편의성은 떨어진다.
		
		frame.setResizable(false); // true: 조작가능 / false 조작불가능


		
		
	//문서의끝
	}
}

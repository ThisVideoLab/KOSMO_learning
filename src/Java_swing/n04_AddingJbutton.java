package Java_swing;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class n04_AddingJbutton {
	public static void main(String[] args) {
		
		// �������� �ϼ��� ������ ����
		
		JFrame frame = new JFrame("welcome to java"); // ������ �����ÿ� ��ȣ�ȿ� ���� �ؽ�Ʈ�� â�� �̸��� �ȴ�.
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension( 840 , 840/12*9));
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false); // true: ���۰��� / false ���ۺҰ���
		JPanel panel1 =new JPanel();
		frame.add(panel1);
		panel1.setLayout(new BorderLayout());

		// �������� �ϼ��� ������ ��

		//1. JButton : �� �״�� JFrame �󿡼� ���̴� ��ư, ��ư ���� �۾��� �� ���� �� ����.
		//			   �� ��ư�� ���� ��ȭ�� �������� ���, ���ϴ� ������ �����ų �� ����.
			
		JButton btn1 = new JButton("from JButton btn1"); // ��ư ��ü�� ����
		
		panel1.add(btn1 , BorderLayout.WEST); // �����ϴ� �гο� ��ư�� �߰����� 
				
		
		
	//�����ǳ�
	}
}

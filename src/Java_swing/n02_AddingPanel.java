package Java_swing;
// �ڹ� �����ӿ� ���� �гΰ� ������ ���̿� ���� �˾ƺ���

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class n02_AddingPanel {
	public static void main(String[] args) {

		// �������� �ϼ��� ������ ����
		
		JFrame frame = new JFrame("welcome to java"); // ������ �����ÿ� ��ȣ�ȿ� ���� �ؽ�Ʈ�� â�� �̸��� �ȴ�.
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension( 840 , 840/12*9));
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false); // true: ���۰��� / false ���ۺҰ���
		
		// �������� �ϼ��� ������ ��

		//1. �г� (Panel)�̶�?
		// �г��� ���� �ܼ��� �����̳� Ŭ������, �ٸ� ������Ʈ���̳� �гε��� ���� �� �ִ� ������ ������.
		// �������� �ܼ��� ������, �г��� �� ���뿡 �÷����� �� �ִ� �ٱ�����Ǵ� ���۳�Ʈ��.
		
		
		//2. ���� �г��� ��ü�� �����ϵ��� �Ѵ�.
		JPanel panel1 =new JPanel();
		
		//3. ������ ��ü�� �����ӿ� �߰����ش�
		frame.add(panel1); 
		
		//4. label�� Ȱ���� ������ ���� ���
		
		panel1.add(new JLabel ("Welcome to the RealWorld"));
		
		//5. label ��ü�� ������ �� ���� ���
		
		JLabel jlb1 = new JLabel("Welcome to the RealWorld  written by jlb1");
		panel1.add(jlb1);
		
		
		         
		
		
		
		
	//�����ǳ�
	}
}

package Java_swing;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// �г��� �� �� ��ä�Ӱ� �ٸ��ְ�, ����� �߰��� �� �ִ� ��ҵ鿡 ���ؼ� �˾ƺ���.


public class n03_AddingLabel {
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

		// �������� �ϼ��� ������ ��

		//1. BorderLayout: ���� ���̾ƿ��� panel�� ��ġ�� ����ϰ� �ٵ���ִ� ���۳�Ʈ��.
				
		panel1.setLayout(new BorderLayout()); // �̷��� �Է��� ������, �� jbl1�� ������, �ռ� �Է��ߴ� �󺧵���
											  // ��� ������� ������ �߻��Ѵ�. �� ������ ���ο� �������̾ƿ��� ���������� ������.
		
		//2. JLabel: �����ϰ� ���� �Է����ִ� �ڵ�. �׳� �󺧿� ���� �Ἥ ���̴� ��ó�� ������ �����.
		//   		 �ռ� ���캻 ��ó�� �����ϰ� �ٷ� �Էµ� �����ϰ�, ��ü�� ������ �Ŀ� add�� �߰��� ������.
		
		panel1.add(new JLabel("panel1.add(new JLabel1"), BorderLayout.NORTH); 
		
		JLabel jlb2 = new JLabel("JLabel jlb2 = new JLabel"); // �̷��� ������, ���ٿ� �־��� �ڵ� �ڸ��� ���鼭
		panel1.add(jlb2);														// ������ �ִ� �� �޽����� ������� ����
		
		panel1.add(new JLabel("panel1.add(new JLabel2"), BorderLayout.BEFORE_FIRST_LINE);
		// �׷� ��� �̷��� BorderLayout.??�� ����ؼ� ??�� ���ýÿ��� �˸��� �༮�� ��� ������ ��. �̶� �ݵ�� �빮�ڸ� ����� ��
				
	//������ ��
	}
}

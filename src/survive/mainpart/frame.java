package survive.mainpart;

import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class frame {
	public static void main(String[] args) {

		JFrame frm_deflault = new JFrame("Last Man Standing");
		
		//������ �Ϲ� ����
		frm_deflault.setSize(1216, 839); // ������ ũ�� ���� (���� �ȼ�)
		frm_deflault.setLocationRelativeTo(null); // �������� ȭ�� ����� ��ġ
		frm_deflault.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // �������� �ݾ��� �� �޸𸮿��� ���ŵǵ��� ����
        frm_deflault.setVisible(true); // �������� ���̵��� ����
        // System.out.println(frm_deflault.getContentPane().getSize()); // ������ ���� ũ�⸦ �ܼ� â�� �����
        
        FlowLayout fLay = new FlowLayout(); // ���̾ƿ� ����
        frm_deflault.getContentPane().setLayout(null); //���̾ƿ� ���� (�ȿ� fLay) ������ ���� ��
        frm_deflault.setResizable(false); // âũ�� ���� (false) => ���� �Ұ���
        
        // �� ��� �߰�
        JLabel lbl = new JLabel(); // JLabel ��� ����Ʈ �� ���ο� ��ü ����
        lbl.setBounds(0, 600, 274, 50); // ���� ��ġ �� ũ�� ����
        lbl.setText("������ �����մϴ�"); // �� ���� ��� �޽��� ����
        lbl.setHorizontalAlignment(JLabel.LEFT); // ���� ���� ����, ��� ����
        frm_deflault.getContentPane().add(lbl);
        

        // ��ư �߰� �� ����
        JButton btnLoca = new JButton("LOCATION"); // JButton Ÿ���� ��ü ���� + "��ư�̸�" 
        frm_deflault.getContentPane().add(btnLoca);       // �����ӿ� ��ư�� �߰����� -> ��üȭ
        btnLoca.setBounds(0, 750, 240, 50); //  (margin-left,margin-top,width,height)
        
        btnLoca.addActionListener(event -> {
        	
        	
        	JLabel imgLblLoca = new JLabel(); // �̹����� �� ����
        	frm_deflault.getContentPane().add(imgLblLoca);
        	ImageIcon bsImgLoca = new ImageIcon("src/survive/img/home.png"); // �󺧿� ���� �̹��� ��ü ����
        	imgLblLoca.setIcon(bsImgLoca); // �󺧿� �̹��� ��ü ����
        	imgLblLoca.setBounds(0, 0, 1200,750); // ũ�� ����
        	imgLblLoca.setHorizontalAlignment(JLabel.CENTER);
        	frm_deflault.getContentPane().add(imgLblLoca); // �����ӿ� ����
        });
        
        JButton btnChar = new JButton("STATUS");
        frm_deflault.getContentPane().add(btnChar);
        btnChar.setBounds(240, 750, 240, 50);
        
        btnChar.addActionListener(event -> {
        	
        	JLabel imgLblChar = new JLabel(); // �̹����� �� ����
        	frm_deflault.getContentPane().add(imgLblChar);
        	ImageIcon bsImgChar = new ImageIcon("src/survive/img/charactor.png"); // �󺧿� ���� �̹��� ��ü ����
        	imgLblChar.setIcon(bsImgChar); // �󺧿� �̹��� ��ü ����
        	imgLblChar.setBounds(0, 0, 1200,750); // ũ�� ����
        	imgLblChar.setHorizontalAlignment(JLabel.CENTER);
        	frm_deflault.getContentPane().add(imgLblChar); // �����ӿ� ����
        	
        });
        
        JButton btnReci = new JButton("RECIPE");
        frm_deflault.getContentPane().add(btnReci);
        btnReci.setBounds(480, 750, 240, 50);
        
        btnReci.addActionListener(event -> {

        	JLabel imgLblReci = new JLabel(); // �̹����� �� ����
        	frm_deflault.getContentPane().add(imgLblReci);
        	ImageIcon bsImgReci = new ImageIcon("src/survive/img/charactor.png"); // �󺧿� ���� �̹��� ��ü ����
        	imgLblReci.setIcon(bsImgReci); // �󺧿� �̹��� ��ü ����
        	imgLblReci.setBounds(0, 0, 1200,750); // ũ�� ����
        	imgLblReci.setHorizontalAlignment(JLabel.CENTER);
        	frm_deflault.getContentPane().add(imgLblReci); // �����ӿ� ����
        	
        });
        
        JButton btnInven = new JButton("INVENTORY");
        frm_deflault.getContentPane().add(btnInven);
        btnInven.setBounds(720, 750, 240, 50);
        
        btnInven.addActionListener(event -> {
            lbl.setText("�κ��丮 ��ư Ŭ��");
        });
        
        JButton btnEsc = new JButton("EXIT");
        frm_deflault.getContentPane().add(btnEsc);
        btnEsc.setBounds(960, 750, 240, 50);
        
        btnEsc.addActionListener(event -> {
            lbl.setText("EXIT ��ư Ŭ��");
        });
        
    
        
	//�����ǳ�
	}
}

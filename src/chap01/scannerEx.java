package chap01;

import java.util.Scanner;

public class scannerEx {

	public static void main(String[] args) {
		System.out.println("�̸�, ����, ����, ü��, ���ſ��θ� ��ĭ���� �и��Ͽ� �Է��� �ּ���.");
		Scanner scn = new Scanner(System.in);
		
		String name = scn.next(); // ���ڿ��� ��ǲ�޵��� ��.
		System.out.println("�̸���" + name + ", ");
		
		String city = scn.next();
		System.out.println("���ô�" + city + ", ");
		
		int age = scn.nextInt(); // �������� ��ǲ�޾Ƽ� �о� ����
		System.out.println("���̴�" + age + ", ");
		
		double weight = scn.nextDouble(); // �Ǽ����� ��ǲ �޾Ƽ� �о� ����
		System.out.println("ü����" + weight + ", ");
		
		Boolean single = scn.nextBoolean(); // ������ �о� �鿩�� �� ������  �Ǻ��� �о����
		System.out.println("���� ���δ� " + single + "�Դϴ�. ");
		scn.close();
			
	}

}

package chap04;

public class While_Ex03 {

	public static void main(String[] args) {

		// 1. while�� �⺻ ����
		
		System.out.println("�����Ϲ����� ����� �ݺ� ������");
		System.out.println();
		
		int a1 = 0; // �ʱ��, ���� �ۿ��� ���� -> ���� ����
		
		while (a1 < 10) { // ���ǽ�, a1 < 10�� true�̶�� �ڿ� �������� ��� �ݺ���
			System.out.println("�����Ϲ� " + (a1+1) + " ���� �����: "  + a1); // ���ü� ������ ���ؼ� ln�̶� ���ڿ� �־ ��������
			a1++; // �־ ��� ��°��� ���� �� �ڿ� a�� 1�� ����
		}
		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		System.out.println("�����Ϲ����� ����� �ݺ� ������ - ���� �����غ���");
		System.out.println();
		
		System.out.println("�����Ϲ� " + (a1) + " ���� ����: "  + a1); // ġ�ٰ� ���������� ������ ����
		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		//for������ ��ȯ
		
		System.out.println("�������ε� ����ڷ� ������ ����");
		System.out.println();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("���� " + (i+1) + " ���� �����: "  + i);
		}
		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		System.out.println("�����Ϲ����� ����� �ݺ� ���ҹ�");
		System.out.println();
		
		int b = 10;
		while (b > 0) {
			System.out.print(b + " ");
			b--;
		}
		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		System.out.println("�������� ����� �ݺ� ���ҹ�");
		System.out.println();
		
		for (int i= 10; i > 0; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		/*
		System.out.println("���Ϲ��� ���� ����");
		
		System.out.println();
		
		while (true) {
			System.out.println("���١١١�");
			System.out.println("�٣��١١�");
			System.out.println("�١٣��١�");
			System.out.println("�١١٣���");
			System.out.println("�١١١٣�");
			System.out.println("�١١٣���");
			System.out.println("�١٣��١�");
			System.out.println("�٣��١١�");
			
			// ��¦��¦ �̻ڴ���
		}
		*/
		int k1 = 0;
		while (true) {
			
			if (k1 > 10) {
				break;
			}
			System.out.println(k1 + "��" + "��" + "��" + "��");
			System.out.println("��" + k1 + "��" + "��" + "��");
			System.out.println("��" + "��" + k1 + "��" + "��");
			System.out.println("��" + "��" + "��" + k1 + "��");
			System.out.println("��" + "��" + "��" + "��" + k1);
			System.out.println("��" + "��" + "��" + k1 + "��");
			System.out.println("��" + "��" + k1 + "��" + "��");
			System.out.println("��" + k1 + "��" + "��" + "��");
			k1++;
			
			}
			
			// ��¦��¦ �̻ڴ���
		}
		
		
	}
package chap04;

public class Dohile_Ex04 {

	public static void main(String[] args) {

		System.out.println("-----�Ϲ��Ѱ輱-----");
		System.out.println("");
		
		//1. While���� Do while���� ��
		
		
		System.out.print("���� ���ڰ� �ȳ����� ������ �ּ� ����");
		{int a= 0; // �� ���� ��� ������ ���������� ����� ��. �׳� �غ��� �;���. �̷��� �ϸ� Ŭ������ ��� �Ҵ�ǰ�, �ڵ� ���� �þ�� ������.
			while (a < 0) {
				System.out.print(a + " "); // ������ false�϶��� ���� �ȵǼ� ��µ� �ȵ�
				a++;
			}
		System.out.println();
		}

		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		{int a = 0;
			do { System.out.print(a + " ");
			a++;
			} while (a < 0); // ������ false ������ do�� ó�� ���ư��� �� ������ ���� while�� �ȵ������Ƿ� ���� 1ȸ �������� do�� ���ư�.
		}
		
		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		// �ݺ�Ƚ���� 1���� ���
		
		{int a = 0;
			while (a<1) {
				System.out.print(a + " "); // while���� �ϴ� ���ư��� ���� ������ ���̰� ����.
				a++;
			}
		}
		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		{int a = 0;
			do {
				System.out.print(a + " "); // ���������� while�� ������, ������ �����̱� ������ �ϴ� �� �� ���ư��� ��. �ٵ� �ѹ� ���� �������� �ɸ��� ��� ���ؼ� ������.
				a++;
			}while (a < 1);
			System.out.println("");
		}
		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		// �ݺ� Ƚ���� 10���� ���
		
		{int a = 0;
			while (a < 10) {
				System.out.print(a + " ");
				a++;
			}
		}
		
		System.out.println("");
		
		{int a = 0;
			do {
				System.out.print(a + " ");
				a++;
			}while (a < 10);
		
		}
		
		
		System.out.println("");
		System.out.println("-----�����Ѱ輱-----");
		
	}

}

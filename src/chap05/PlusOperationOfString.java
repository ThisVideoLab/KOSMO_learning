package chap05;

public class PlusOperationOfString {

	public static void main(String[] args) {
		//1. ���ڿ� + ���ڿ�
		String str1 = "�ȳ�" + "�ϼ���" + "!";
		System.out.println(str1);
		
		System.out.println("==========");
		
		String str2 = "�ȳ�";
		str2 += "�ϼ���"; //���� str2�� "���ϴ�" ���ϱ�
		str2 += "!"; //���� str2�� "!" ���ϱ�
		System.out.println(str2); // str1�� ���� ������ ������ ��µ�.
		
		System.out.println("==========");
		
		System.out.print("str1 == str2: "); // �޸� �ּ� �� = false
		System.out.println(str1 == str2);
		System.out.print("str1.equals(str2): "); // ������ �� �� = true
		System.out.println(str1.equals(str2));

		//2. ���ڿ� + �⺻�ڷ��� // �⺻�ڷ����� ���ڿ��� ��ȯ��Ŵ
		String str3 = "�ȳ�" +1; // �ȳ�1 ���
		String str4 = "�ȳ�" +String.valueOf(1); // �ȳ�1
		String str5 = "�ȳ�" +"1"; // �ȳ�1
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println();
		
		System.out.println("==========");
		
		//3 ���ڿ��� �⺻ �ڷ����� ȥ���ϴ� ��� // ��Ʈ�� �Ŀ� ���� �ڷ������� ��Ʈ������ �ٲ�
		
		System.out.println(1 + "�ȳ�");
		System.out.println(1 + "�ȳ�" + 2);
		System.out.println("�ȳ�" + 1 + 2); // ���Ⱑ Ŭ���̸��� �ȳ� ������ �ڿ� 1+2 ���� +�� �����ȣ�� �ƴ϶� ���Ῥ���ڰ� �Ǿ����
		System.out.println("�ȳ�" + (1 + 2)); // ��ó�� ������ �� �������� ��ȣ�� ���� ���� ������ �������ָ� ��
		System.out.println(1 + 2 + "�ȳ�");
		
		
		
		
	}

}
 
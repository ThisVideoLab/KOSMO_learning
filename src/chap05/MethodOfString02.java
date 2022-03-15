package chap05;

import java.util.Arrays;

public class MethodOfString02 {

	public static void main(String[] args) {
		
		//5 ���ڿ� ����
		
		//toLowerCase(): �ҹ��ڷ� ��ȯ, toUpperCase(): �빮�ڷ� ��ȯ
		
		String str1 = "Java Study";
		System.out.println(str1.toLowerCase()); // java study �� ���� �ҹ��ڷ� �� ��������
		System.out.println(str1.toUpperCase()); // �빮�ڷ� �� �÷�����
		System.out.println();
		
		System.out.println("====================");
		
		//replace(old,new) : old�� new�� �ٲٴ� ��. �ٲٰ� ���� ��� -> �ٲ� �ְ� ���� ��ǥ
		System.out.println(str1.replace("Study", "����")); // ���� ���� ���� ���� �־ �� ����� ����ϴ� ��.
		
			//substring(a,b): a��°����� �����ؼ� b��° ������� ���ڿ��� �߶� ���
		System.out.println(str1.substring(0,5)); //Java
		System.out.println(str1.substring(3,8));
		
		System.out.println("====================");
		
		//spilt : Ư�� ���ڸ� �������� �߶� String[] �迭�� ����.
		
		String str11 = "abc/def-ghi jkl"; // �ش� ������ �������� ��Ƽ� �߶��ٲ���.
		String[] arr11 = str11.split("/|-| "); // ��ȣ �ȿ� ���� �������� ������. �� �� |�� �����ڷ� �����. ������ �� �ڵ�� / �� - �Ǵ� ������ ������ �ڸ���� �ڵ���.
		System.out.println(Arrays.toString(arr11));
		
		String str111 = "������ ������ �帳�ϴ�.";
		String[] arr2 = str111.split(" "); // ���� ���� ������ �� ��
		System.out.println(Arrays.toString(arr2)); // ���� ���鵵 �� �����ϴ� ���� ����. ���ʿ� © �� ���� �����ص� �̻ڰ� �������� �ϰų� �ٸ� ����� �� ��.
		
		String str1111 = "�̸�, ����, ����, ��ȭ��ȣ, �����ּ�";
		String[] arr3 =str1111.split(",");
		System.out.println(Arrays.toString(arr3));
		
		for(int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]+" ");
		}
		System.out.println();
		
		
		System.out.println("====================");
		
		//trim
		
		System.out.println("����: " + "       abc       ".trim()); // ����
		System.out.println("�յ� ���� ����: " + "       abc       ".trim()); // �յ� ���� ����
		System.out.println("�߰� ���� ���� �Ұ���: " + "    a   b   c    ".trim()); // �߰� ������ �������.
		
		System.out.println("====================");
		
		//6. ���ڿ��� ���� ��.equals() : ��ҹ��ڸ� �����Ͽ� ���� ����.
		// 				 , equalsIgnoreCase() : ��ҹ��� ���� ���� ���� ����.
		
		String str2 = new String("Java");
		String str3 = new String("Java");
		String str4 = new String("java");
		
		System.out.println();
		//�޸� �ּ� ���� �� (==)
		
		System.out.println(str2==str3);  // �� �޸𸮰��� ���� �Ҵ��ؼ� ��������Ƿ� �ּҰ� �ٸ�.
		System.out.println(str2==str4);
		System.out.println(str3==str4);
		
		System.out.println();
		//��� ���� �� .equals(), .equalIgnoreCase()
		
		System.out.println(str2.equals(str3)); // ��� ���� ���ϴ� ��. �̶� equals�� ��ҹ��ڸ� ���ϴµ� ��ҹ��ڵ� ���Ƽ� true ���
		System.out.println(str3.equals(str4)); // ��� ���� ���ϴ� ��. �̶� equals�� ��ҹ��ڸ� ���ϴµ� ��ҹ��ڰ� �����ؼ� false ���
		System.out.println(str3.equalsIgnoreCase(str4)); // true, ��ҹ��� ���� ����
		
		
		
	}   

}


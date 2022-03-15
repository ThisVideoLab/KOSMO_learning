package chap05;

import java.util.Arrays;

public class MethodOfString {

	public static void main(String[] args) {
		
		//1. ���ڿ� ���̸� (length()) : int Ÿ������ ��ȯ ==> ���� �ҹ� 1ĭ�� �ϳ�, ����Ʈ ������ ��ĭ�� �����̸鼭 ���� ũ�⸸ŭ�� ���ڰ� ��µ�
		
		String str1 = "Hello Java!";
		String str2 = "�ȳ��ϼ���! �ݰ����ϴ�!";
		
		System.out.println(str1.length());
		System.out.println(str2.length());
		 // ��ó�� length�� ���ڼ��� ���� int�� �����.
		
		
		//2. ���ڿ� �˻� charAt(), indexOf(), LastIndexOf()
		System.out.println(str1.charAt(1)); // 1������ ���ڿ� ��� - �̶� ���̶� ������ �� ���ڸ� �ǹ���. str1�� 1������ e��.
		System.out.println(str2.charAt(2)); // 2������ ���ڿ� ��� - �̶� ���̶� ������ �� ���ڸ� �ǹ���. str2�� 3������ ����.
		
		// indexOf() : ��ȣ ���� ���ڰ� �ִ� ���� ��ȣ�� �����. �̶� ������ 0 -> �������� (������) �� ��ȣ ��ü�� ����.
		// LastIndexOf() ��ȣ ���� ���ڰ� �ִ� ���� ��ȣ�� �����. �̶� ������ �������� -> 0 (������) �� ��ȣ ��ü�� ����.
		String str33 ="���̻�����";
		System.out.println(str33.indexOf("��"));
		System.out.println(str33.lastIndexOf("��"));
		
		System.out.println("==========");
		System.out.println(str1.indexOf('a')); // 7: �տ������� �����ϱ� java �ܾ�� �� a�� 7������ ��ȣ�� ���
		System.out.println(str1.lastIndexOf('a')); // 9: �ڿ������� �����ϱ� java �ܾ�� �� a�� 9������ ��ȣ�� ���
		System.out.println(str1.indexOf('a',8)); // 9: 8��° ��ġ���� �˻��϶�� ���� �־��༭ 7������ �پ�Ѿ 9������ ���
		System.out.println(str1.lastIndexOf('a',8)); // 7: 8��° ��ġ���� �˻��϶�� ���� �־��༭ 9������ �پ�Ѿ 9������ ���
		System.out.println(str1.indexOf("Java")); // 6: �ش� ���ڿ��� ���۵Ǵ� ù�ڸ��� ǥ����.
		System.out.println(str1.lastIndexOf("Java")); // 6: �ڿ��� �д��� �ش� ���ڿ��� ���۵Ǵ� ù�ڸ��� ǥ����.
		System.out.println(str1.indexOf("���� ���� ����ϴ� ���")); // ���� �߿���. ������ �迭���� ���ü� ���� ����-1�� ��µ�.
		System.out.println(str1.lastIndexOf("���� ���� ����ϴ� ���")); // ���������� -1�� ��µ�.
		
		
		System.out.println("=====================");
		//3. ���ڿ� ��ȯ �� ���� (String.valueOf(),cocat())
		
		// String.valueOf(�⺻�ڷ���) : �ȿ� ���� �⺻�ڷ����� String �����ڷ������� ��ȯ
		String str3 = String.valueOf(2.3); // �Ǽ� 2.3�� String������ ��ȯ
		String str4 = String.valueOf(false); // �Ҹ���Ÿ�� false�� String���� ��ȯ
		System.out.println(str3);
		System.out.println(str4);
		
		// concat() : ���ڿ��� ���ڿ��� ���� : +�� ����� ���� �����ڿ� ���� ���.
		String str5 = str3.concat(str4); // 2.3false  ���ڿ��� �������ִ� ���.
		System.out.println(str5);
		System.out.println();
		
		// concat.() �޼ҵ忡�� String.valueOf() ��� ==> ��Ĺ �޼ҵ尡 ��Ʈ���� ����ؼ� �ȿ��� �ٲ�鼭 �Է��ؾ� ��
		String str6 = "�ȳ�" + 3; //�ȳ�3
		String str7 = "�ȳ�".concat(String.valueOf(3)); // concat�� ����Ҷ��� �� String Ÿ������ �־���ؼ� String.valueOf()�� �����.
		System.out.println(str6);
		System.out.println(str7);
		
		System.out.println("=====================");
		
		// 4. ���ڿ� ==> byte[] Ÿ������ ��ȯ, ����� ���� ó���� �� �����.
			// (getBytes(),
			// ���ڿ� ==> char[] (toCharArray())
		
		String str8 = "Hello Java!";
		String str9 = "�ȳ��ϼ���";
		
		//getByte():���ڿ� ==> bytes[] ��ȯ // ������ �ݺ� ���� �ڵ����� �� �ϳ��� ���� �޾ƴٰ� getbytes �� byte���� ������
		byte[] array1 = str8.getBytes();
		byte[] array2 = str9.getBytes();
		System.out.println(Arrays.toString(array1)); // �ƽ�Ű �ڵ� ��� (11��)
		System.out.println(Arrays.toString(array2));
		
		//toCharArray() ���ڿ� => char[]�� ��ȯ
		char[] array3= str8.toCharArray();
		char[] array4= str9.toCharArray();
		
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));
		
	}

}

package chap14.EX06;

//�Ϲ� ���� (checked Exception) ������ �ܰ迡�� ����,
//1. ���� ó��
//2. throw ���� (�̷��)

// main �޼ҵ忡 throws�� ������Ű�� ���, ó���� ��� �޽����� ����ְ� ���Ḧ ���ѹ���.

//main �޼ҵ忡 throws�� ������Ű�� ���, Exception�� �߻��� ��쿡 ������ ������ְ� ������.

public class ThrowsException_2 {

	public static void main(String[] args) throws ClassNotFoundException {

		// ���������� ������ �����մϴ�. ClassNotFoundException�� �߻����� �ƴ���.
		Class cls1 = Class.forName("java.lang.object");
		
		
		// ���������� ������ �������� �ʽ��ϴ�. ClassNotFoundException�� �߻����� �ƴ���.
		Class cls2 = Class.forName("java.lang.object00");
		
	}

}

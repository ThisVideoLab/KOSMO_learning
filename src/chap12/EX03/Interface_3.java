package chap12.EX03;

interface A{}
interface B{}

//1. ���� �������̽� ���
class C implements A{} // C Ŭ������ A �������̽��� �����ϴ� �������μ��� �۵��ϴ� ��� Ŭ����

//2. ���� �������̽� ���

class D implements A,B{} // �������̽��� ������ �����̴� ���. �������̽��� ���� ���� �� ����� ������

//3. Ŭ������ �������̽��� �ѹ��� ��� ( �̶� extends�� implements�� ������ ������ �Ұ�����)
	// Ŭ������ ���� ��� �Ұ����ѵ� ���� Ȯ���� Ư������ ����

class E extends C implements A,B{}

public class Interface_3 {

	public static void main(String[] args) {

	}

}
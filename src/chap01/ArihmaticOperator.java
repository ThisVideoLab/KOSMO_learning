package chap01;
import java.util.Scanner;
public class ArihmaticOperator {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("������ �Է��ϼ���");
		
		int time = sc.nextInt(); // ��ĳ�ʿ��� ��ǲ���� �޾Ƽ�  time ������ �Ҵ�
		int scond  = time % 60; // % : �ڿ� ���� ���ڷ� ������ �� ���� ������ ��. ���⼭�� �ʸ� �ǹ���.
		int minite = (time / 60) %60; // ���������� �̰��� ���� �ǹ���. 
		int hour = (time/60 / 60) %24; // �ð�
		int day =  (time/60) / 60 / 24; // ��
		
		System.out.println(time + " �ʴ� ");
		System.out.println(day + " �ϴ� ");
		System.out.println(hour + "�ð�, ");
		System.out.println(minite + "��, ");
		System.out.println(scond + "�� �Դϴ�. ");
		
		 sc.close();
	}

}

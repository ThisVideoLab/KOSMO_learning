package private_work;
import java.util.Scanner;
public class workOutCalc {
   static void math(String... values) {
      int sum = 0;      // ������ ������ ���ϴ� ����
      double avg ;
            
      for (int i = 0; i < values.length; i++) {
         if (i%2 !=0) {
         sum+= Integer.parseInt(values[i]);
         }
      }
      avg = (double) sum / values.length;   // ����� : double Ÿ���̾�� �Ѵ�.
      System.out.println("������� ������ �� �հ� : " + sum);
      System.out.println("������� ��� ������ �� : " + avg * 2);
      }
      public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("������ ��� �̸��� ��� ������ ���� �ۼ� ���ּ���. >>>");
      String num = sc.nextLine();   // ������ ���Ƿ� ��ü ���� ���� String
      String[] array1 = num.split(" ");   // splite�� �����ڸ� �������� ���ڸ� �߶� �迭�� ����
      if(num.equals("�׸�")) {
            System.out.println("���α׷��� �����մϴ�");
            return;
      }
      System.out.println("<<����� : ������>>");
      for(int i=0; i<array1.length; i++) {   // �Է� ���� ���
         if(i%2 == 0) {
            System.out.print(array1[i] + " : ");
         }
         else if (i%2 != 0) {
         System.out.print(array1[i] + ". ");
         }
      }
      System.out.println();
      sc.close();
      math(array1);   // �⺯ ���� �޼ҵ� math�� ȣ���ϸ鼭 �Ű������� array1�� �־��ָ� �ȴ�.
      
   }
      
}
package chap17.EX06;
/*
 *  1.�л��� : ������ ���� �Է� ������ ArrayList�� capacity ũ������
 *  2.���� �Է� : �Է� ���� �л����� ���� ���� �Է�. ArrayList�� ��ü�� ����
 *  3.���� ����Ʈ : ArrayList�� ����� Student ��ü�� �����ͼ� score ���
 *  4.�м� : �ְ����� :   . ��� ����:
 *  5.����
*/	
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Student{
	int score;

}

public class ScoreStudent_1 {

	public static void main(String[] args) {
		
		
		ArrayList<Student> arr = new ArrayList<Student>();
        
        List<Integer> studentscore =new ArrayList<Integer>();
        
    
        boolean run = true;
        int studentNum = 0;
        Scanner scanner = new Scanner(System.in);
        
        while(run) {
            System.out.println("----------------------------------------------------");
            System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
            System.out.println("----------------------------------------------------");
            System.out.println("����> ");
            int selectNo = scanner.nextInt();

            if(selectNo == 1) {
                System.out.println("�л����� �Է��ϼ��� : ");
                	//�ڵ� �ۼ�  // �л����� ���� capacity �Ҵ����� ��
                studentNum = scanner.nextInt();
                System.out.println("�Է¿Ϸ�");
                for(int i = 0; i<studentNum; i++) {
                	arr.add(new Student());
                }
            } else if(selectNo == 2) {
            		//�ڵ��ۼ� // 10�� ���� , ���� �Է���
            	System.out.println("�л��� ��ŭ ������ �Է��Ͻÿ� : ");
            	for(int i=0; i<studentNum; i++) {
            		System.out.println((i+1)+"�� �л� ������ �Է��ϼ���");
            		int inputScore =scanner.nextInt();
            		studentscore.add(inputScore);
            		System.out.println("�Է¿Ϸ�");
            	}
            	
            } else if(selectNo == 3) {
            	for(int i = 0; i <arr.size(); i++) {
            		System.out.println(studentscore.get(i)); 
            	}
            } else if(selectNo == 4) {
            	//�ڵ��ۼ� // �ְ������� ������� ���ϱ�
            	int max = 0;
            	int sum = 0;
            	Double avg = 0.0;
            	for ( int i =0 ; i < arr.size(); i++) {		
        			if ( studentscore.get(i) > max) {		// ���� ���� max ������ ������ Ŭ�� 
        				max = studentscore.get(i);			// max ������ ū���� ���� 
        			}
        		}
            	
            	for ( int i =0 ; i < arr.size(); i++) {	
            		sum += studentscore.get(i);
            		avg =(double) sum/arr.size();
            	}
            	System.out.println("�ְ�����: " + max);
          	  System.out.println("�������: " + avg);
            	
            } else if(selectNo == 5) {
            	//�ڵ��ۼ�
            	run = false;
				System.out.println("���α׷� ����");
              }
         }
	}
}

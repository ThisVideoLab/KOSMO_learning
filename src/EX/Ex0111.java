package EX;
import java.util.Scanner;
public class Ex0111 {

	public static void main(String[] args) {

		String course[] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
	    int score[]  = {95, 88, 76, 62, 55};
		
		Scanner scan = new Scanner(System.in);
	    System.out.println("���� �̸��� �Է��� ������ Ȯ���ϼ���.");
	    System.out.print("(���� Ȯ�� ���� ����: ");
	    for(int c = 0; c < course.length; c++) {
	    	System.out.print(course[c] + " ");
	    }
	    System.out.println(")"); 
	    
	    int i = 0; 
	    String name;
POS1:	    while(true) {
	    	name = scan.next();
	    	for(i = 0; i < course.length; i++) {
	    		if (course[i].equals(name)) {
	    			System.out.println("������ " + name + " ������ " + score[i] +"���Դϴ�.");
	    			continue POS1;
	    		}
	    	}
	    	if(name.equals("�׸�")){
	    		System.out.println("�Է��� �����մϴ�.");
	    		break;
	    	}else{
	    		System.out.println("'" + name + "'" + "��(��) �ĺ� �Ұ����� ������Դϴ�. ��ҹ��ڸ� �����Ͽ� �ùٸ� ������� �Է��ϼ���.");
	    	}
	    	
	    }
	}

}

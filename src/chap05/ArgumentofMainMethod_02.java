package chap05;

public class ArgumentofMainMethod_02 {

	public static void main(String[] args) {
		
		//main  �޼ҵ��� ��ǲ �Ű� ������ ������ ������ ���̸� ���ϱ�
		System.out.println(args.length);
		System.out.println();
		
		//�Է� �Ű� ������ for������ ���
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);	
		}
		
				
		System.out.println("=====================");
				
		for (String k : args) {
			System.out.println(k);
		}
	}

}



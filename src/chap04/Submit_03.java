package chap04;

public class Submit_03 {
	public static void main(String[] args) {
		int i;
/*
		for ( i = 1; i <=19; i++) {
		
			System.out.println("-----");
			System.out.println(i + "�� ����");
			System.out.println("-----");
			
			int d;
			int k;
			for (d = 1; d <= 9; d++) {
				if(d % 2 == 1){
					k = i*d;
					System.out.println(i + " * " + d + " = "+ k);
				}
				
			}
		}
	*/
	
	for ( i = 1; i <=19; i++) {
		
		System.out.println("-----");
		System.out.println(i + "�� ����");
		System.out.println("-----");
		
		int d;
		for (d = 1; d <= 9; d++) {
			if(d % 2 == 0){
				continue;
			}
			System.out.println(i + " * " + d + " = "+ i*d);
		}
	}
	
	}
}

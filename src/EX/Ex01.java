package EX;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
// �ܼ�â���� ���� ���� �����մϴ�.
// �Ϻ� �Է°��� �ʿ��� ��������, �� ��Ű�� ���� �ٸ� Ŭ������ ���� ��Ź�帳�ϴ�.		
		
//���� 1��
		 
		System.out.println("=============================================================");
		System.out.println();
		System.out.println("����1] ���� �̸����� ��� ������ ���� ��� �����ϼ���.");
		System.out.println();
		System.out.println("1) goodName 2) class 3) 6Minute 4) $Value 5) _name 6) int");
		System.out.println();
		System.out.println("����) 1, 4, 5");
		System.out.println();

// ���� 2��		
		System.out.println("=============================================================");
		System.out.println();
		System.out.println("[����2] 1  ~  100 ���������α׷����ۼ��Ͻÿ�.");
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		System.out.println();
		System.out.println("����)	public  class  Sum  {");
		System.out.println("		public  static  void  main(String[]  args)  {");
		System.out.println("			int  sum  =  0;");
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		System.out.println();
		System.out.println("Ǯ��)	int sum = 0;");
		System.out.println("	for (int s = 1; s <=100; s++) {");
		System.out.println("		sum += s;");
		System.out.println("	}");
		System.out.println("	System.out.println(\"	����) 1���� 100���� ��� ���� ��: \" + sum);   // ���� ����");
		int sum = 0;
		for (int s = 1; s <=100; s++) {
			sum += s;
		}
		System.out.println();
		System.out.println("����) 1���� 100���� ��� ���� ��: " + sum); // ���� ����
		System.out.println();
		
// ���� 3��
		System.out.println("=============================================================");
		System.out.println();
		System.out.println("[����3] ���ǹ��� �ݺ����� ������ ��ȣ �ӿ� �־����.");
		System.out.println();
		System.out.println("	���ǹ�( if ), ( switch )");
		System.out.println();
		System.out.println("	�ݺ���( do while ), ( while ),( for )");
		System.out.println();
		
// ���� 4��
		System.out.println("=============================================================");
		System.out.println();
		System.out.println("[����4] for ���� �̿��ؼ� ���� ���� ����� ���� �ﰢ���� ����ϴ� �ڵ带 �ۼ��� ������.");
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		System.out.println();
		System.out.println("����)	*");
		System.out.println("	**");
		System.out.println("	***");
		System.out.println("	****");
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		System.out.println();
		System.out.println("Ǯ��)	int e = 1;");
		System.out.println("	for (int lnCnt = 0; lnCnt < 4; lnCnt++) {");
		System.out.println("		System.out.print(\"        \"); // �� ������ ���� ���� ����");
		System.out.println("		int i;");
		System.out.println("		e++;");
		System.out.println("		for (i =e; i > 1; i--) {");
		System.out.println("		    System.out.print(\"*\");");
		System.out.println("		}");
		System.out.println("	System.out.println();");
		System.out.println("	}");
		System.out.println();
		System.out.println("����)");
		System.out.println();
		int stCnt = 1;
		for (int lnCnt = 0; lnCnt < 4; lnCnt++) {
			System.out.print("        "); // �� ������ ���� ���� ����
			int i;
			stCnt++;
				for (i =stCnt; i > 1; i--) {
					System.out.print("*");	
				}
			System.out.println();
		}
		
// ���� 5��
		System.out.println("=============================================================");
		System.out.println();
		System.out.println("[����5] �迭�� �̿��ؼ� 1~10���� ���� ����Ͻÿ�.");
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		System.out.println();
		System.out.println("����)	public  class  Array  {");
		System.out.println("		public  static  void  main(String[]  args)  {");
		System.out.println("			int[]  scores  =  {1,2,3,4,5,6,7,8,9,10};");
		System.out.println("			}"); // �̺κ��� �ϼ��� �ڵ带 ������ ����� ���� ����ٰ� �� �������� ������ �ϴ� ���� ������ ǥ���ϱ� ���� ����. 
		System.out.println("			System.out.println(sum);");
		System.out.println("		}");
		System.out.println("	}");
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		System.out.println();
		System.out.println("Ǯ��)	int[] scores = {1,2,3,4,5,6,7,8,9,10};");
		System.out.println("	int sum1 = 0;");
		System.out.println("	for (int g = 0; g <scores.length; g++) {");
		System.out.println("		sum1 += scores[g];");
		System.out.println("	System.out.println(\"����: \"+ sum1); // ���� ����}");
		System.out.println();
		int[] scores = {1,2,3,4,5,6,7,8,9,10};
		int sum1 = 0;
		for (int g = 0; g <scores.length; g++) {
			sum1 += scores[g];
		}
		System.out.println("����: "+ sum1); // ���� ����
		System.out.println();
		
// ���� 6��		
		System.out.println("=============================================================");
		System.out.println();
		System.out.println("[����6] �־��� �迭�� �׸񿡼� �ִ밪�� ���غ����� (for ���� �̿��ϼ���.)");
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		System.out.println();
		System.out.println("	public  class  Max  {");
		System.out.println("		public  static  void  main(String[]  args)  {");
		System.out.println("			int  max  =  0;");
		System.out.println("			int[]  array  =  {4,5,1,2,3};");
		System.out.println("			//�ۼ���ġ");
		System.out.println("			System.out.println(\"max:  \"  +  max);");
		System.out.println("		}");
		System.out.println("	}");
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		System.out.println();
		System.out.println("Ǯ��)	int  max  =  0;");
		System.out.println("	int[] array = {4,5,1,2,3};");
		System.out.println("	for (int i = 0; i <array.length; i++) {");
		System.out.println("		if (array[i] > max) {");
		System.out.println("			max = array[i];");
		System.out.println("		}");
		System.out.println("	}");
		int  max  =  0;
		int[] array = {4,5,1,2,3};
		for (int i = 0; i <array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println();
		System.out.println("����)	max:  "  +  max);
		System.out.println();
		
// ���� 7��		
		System.out.println("=============================================================");
		System.out.println();
		System.out.println("[����7] ���� ������ 10�� �Է¹޾� �迭�� �����ϰ�, �迭�� �ִ� ���� �߿���");
		System.out.println("       3�� ����� ����ϴ� ���α׷��� �ۼ��϶�.");
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		System.out.println();
		System.out.println("Ǯ��)	package Ex;");
		System.out.println("	import java.util.Scanner;");
		System.out.println("	public class Ex0107 {");
		System.out.println("		public static void main(String[] args) {");
		System.out.println("			int[] arr = new int[10];");
		System.out.println("			int a = 1; // 2��° for�� ������ while ������ ���� 1ȸ�� ����ϵ��� �ϴ� ����");
		System.out.println("			int k = 0; // 2��° for�� ������ if ������ ���� 1ȸ�� ����ϵ��� �ϴ� ����");
		System.out.println("			System.out.println(\"���� ���� 10���� �Է��Ͻʽÿ�.\");");
		System.out.println("			Scanner scn = new Scanner(System.in);");
		System.out.println();
		System.out.println("			int tmpCnt = 0; // ���� �Է� Ƚ��");
		System.out.println();
		System.out.println("			for (tmpCnt = 0; tmpCnt < arr.length; tmpCnt++){");
		System.out.println("				arr[tmpCnt] = scn.nextInt();");
		System.out.println("				if(tmpCnt < (arr.length)) { // 10�� �̸��� ������ �Է��Ͽ� ��°��� ���� ���ϴ� ��츦 ����");
		System.out.println("					System.out.println(\"������ 10���� ���� �Է��ϴ� ���Դϴ�\" + \"(\" + (tmpCnt+1) + \"/10)\");");
		System.out.println("				}");
		System.out.println("			}");
		System.out.println("			scn.close();");
		System.out.println();
		System.out.println("			System.out.println();");
		System.out.println();
		System.out.println("			for (k = 0; k < arr.length; k++){");
		System.out.println("				while (a == 1) {");
		System.out.println("					System.out.print(\"�Է��Ͻ� ������ �߿��� 3�� ����� \");");
		System.out.println("					a++;");
		System.out.println("				}");
		System.out.println("				if(arr[k] % 3 == 0) {");
		System.out.println("				System.out.print(arr[k] + \" \");");
		System.out.println("				}");
		System.out.println("			}");
		System.out.println();
		System.out.println("			if(k == arr.length) {");
		System.out.println("				System.out.println(\"�Դϴ�.\");");
		System.out.println("			}");
		System.out.println("		}");
		System.out.println("	}");
		System.out.println();
		System.out.println("����) Ex ��Ű���� �ִ� Ex0107 ���Ͽ��� �������ּ���");

// ���� 8��
		System.out.println("=============================================================");
		System.out.println();		
		System.out.println("[����8] �迭�� �ݺ����� �̿��Ͽ� ���α׷��� �ۼ��غ���. Ű���忡�� ������ ��");
		System.out.println("       ���� �׼��� �Է¹޾� ��������, ������, õ����, 500��¥������, 100��¥��");
		System.out.println("       ����, 50��¥������, 10��¥������, 1��¥�� ������ ���� ��� ��ȯ�Ǵ���");
		System.out.println("       ���ÿ� ���� ����϶�. �� �� �ݵ�� ���� �迭�� �̿��ϰ� �ݺ������� �ۼ��϶�.");
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		System.out.println();
		System.out.println("����)");
		System.out.println("    int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; // ȯ���ҵ�������");
		System.out.println("    �ݾ����Է��Ͻÿ�>> 65123");
		System.out.println("    50000 ��¥��: 1��");
		System.out.println("    10000 ��¥��: 1��");
		System.out.println("    1000 ��¥��: 5��");
		System.out.println("    500 ��¥��: 0��");
		System.out.println("    100 ��¥��: 1��");
		System.out.println("    50 ��¥��: 0��");
		System.out.println("    10 ��¥��: 2��");
		System.out.println("    1 ��¥��: 3��");
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		System.out.println();
		System.out.println("Ǯ��)	package Ex;");
		System.out.println("	import java.util.Scanner;\r\n");
		System.out.println("	public class Ex0108 {");
		System.out.println("		public static void main(String[] args) {");
		System.out.println("			System.out.println(\"�ݾ��� �Է��Ͻÿ�.\");");
		System.out.println("			Scanner scan = new Scanner (System.in);");
		System.out.println("			int money = scan.nextInt();");
		System.out.println();
		System.out.println("			int[][] arr = new int [2][9];");
		System.out.println("			arr[0][0] = 50000; // 50,000��¥��");
		System.out.println("			arr[0][1] = 10000; // 10,000��¥��");
		System.out.println("			arr[0][2] = 5000; // 5,000��¥��");
		System.out.println("			arr[0][3] = 1000; // 1,000�� ¥��");
		System.out.println("			arr[0][4] = 500; // 500��¥��");
		System.out.println("			arr[0][5] = 100; // 100��¥��");
		System.out.println("			arr[0][6] = 50; // 50��¥��");
		System.out.println("			arr[0][7] = 10; // 10��¥��");
		System.out.println("			arr[0][8] = 1; // 1��¥��");
		System.out.println();
		System.out.println("			arr[1][0]= money/arr[0][0]; // 50,000��¥�� ������ ��");
		System.out.println("			arr[1][1]= (money%arr[0][0])/arr[0][1]; // 10,000��¥�� ������ ��");
		System.out.println("			arr[1][2]= (money%arr[0][1])/arr[0][2]; // 5,000��¥�� ������ ��");
		System.out.println("			arr[1][3]= (money%arr[0][2])/arr[0][3]; // 1,000�� ¥�� ������ ��");
		System.out.println("			arr[1][4]= (money%arr[0][3])/arr[0][4]; // 500��¥�� ������ ��");
		System.out.println("			arr[1][5]= (money%arr[0][4])/arr[0][5]; // 100��¥�� ������ ��");
		System.out.println("			arr[1][6]= (money%arr[0][5])/arr[0][6]; // 50��¥�� ������ ��");
		System.out.println("			arr[1][7]= (money%arr[0][6])/arr[0][7]; // 10��¥�� ������ ��");
		System.out.println("			arr[1][8]= (money%arr[0][7]); // 1��¥�� ������ ��");
		System.out.println();
		System.out.println("			char[][] arrChar = new char[1][9]; // ������ int arr �迭 3�࿡ �ڵ尪���� �ְ� ����Ʈ ���ο��� (char)�� ���ڷ� �ٽ� ��ȯ�Ϸ� �ߴµ� ������ ���� ���ڹ迭�� ����.");
		System.out.println();
		System.out.println("			arrChar[0][0] = 51109; // 50,000��¥��");
		System.out.println("			arrChar[0][1] = 51109; // 10,000��¥��");
		System.out.println("			arrChar[0][2] = 51109; // 5,000��¥��");
		System.out.println("			arrChar[0][3] = 51109; // 1,000�� ¥��");
		System.out.println("			arrChar[0][4] = 44060; // 500��¥��");
		System.out.println("			arrChar[0][5] = 44060; // 100��¥��");
		System.out.println("			arrChar[0][6] = 44060; // 50��¥��");
		System.out.println("			arrChar[0][7] = 44060; // 10��¥��");
		System.out.println("			arrChar[0][8] = 44060; // 1��¥��");
		System.out.println();
		System.out.println("			System.out.println();");
		System.out.println("			System.out.println(\"�Է��Ͻ� �ݾ� \" + money +\"���� ������ ������ ������ �����ϴ�.\");");
		System.out.println("			System.out.println();");
		System.out.println();
		System.out.println("			for(int c = 0; c < arr[1].length; c++) {");
		System.out.println("				if (arr[1][c] >0) { // [0][c]�� ������ ������ �ִ� ��쿡�� ������� ���");
		System.out.println("					System.out.println(arr[0][c] + \"��: \" + arr[1][c] + arrChar[0][c]);");
		System.out.println("				}");
		System.out.println("			}");
		System.out.println("		scan.close();");
		System.out.println("		}");
		System.out.println("	}");
		System.out.println();
		System.out.println("����) Ex ��Ű���� �ִ� Ex0108 ���Ͽ��� �������ּ���");
		
// ���� 9��
		System.out.println("=============================================================");
		System.out.println();
		System.out.println("[����9] ������ 10�� �����ϴ� �迭�� ����� 1���� 10���� ������ ������ �����ϰ�");
		System.out.println("       �����Ͽ� �迭�� �����϶�. �׸��� �迭�� �� ���ڵ�� ����� ����϶�.");
		System.out.println();
		System.out.println("       ������������: 3 6 3 6 1 3 8 9 6 9");
		System.out.println("       �����5.4");
	    System.out.println();
	    System.out.println("       [Hint] 1���� 10���� ������ ������ �����ϰ� ������ ���� ���� �ڵ带 �̿��϶�.");
	    System.out.println();
	    System.out.println("       int i  = (int)(Math.random()*10+1);");
	    System.out.println();
		System.out.println("--------------------------------------------------------------");
		System.out.println();
	    System.out.println("Ǯ��)	int i;");
	    System.out.println("	int[] arr = new int[10];");
	    System.out.println("	int sum2 = 0;");
	    System.out.println("	System.out.print(\"����) \");");
	    System.out.println("	for (i = 0; i < arr.length; i++) {");
	    System.out.println("		arr[i]= (int)(Math.random()*10+1);");
	    System.out.println("		sum2 += arr[i];");
	    System.out.println("		System.out.print(arr[i] + \" \");");
	    System.out.println("	}");
	    System.out.println("	System.out.println(\" / ��հ�: \" + sum2/i);");
	    System.out.println("		");
	    int i;
	    int[] arr = new int[10];
	    double sum2 = 0;
	    System.out.print("����) ");
	    for (i = 0; i < arr.length; i++) {
	    	arr[i]= (int)(Math.random()*10+1);
	    	sum2 += arr[i];
	    	System.out.print(arr[i] + " ");
	    }
	    System.out.println(" / ��հ�: " + sum2/i);

 // ���� 10��
 		System.out.println("=============================================================");
 		System.out.println();	    
	    System.out.println("[����10] �ݺ����� �̿��Ͽ� 369���ӿ��� �ڼ��� �ľ� �ϴ� ��츦 ������� ȭ�鿡");
	    System.out.println("        ����غ���. 1���� �����ϸ� 99������ �Ѵ�. ���� ��ʴ� ������ ����.");
	    System.out.println();
	    System.out.println("--------------------------------------------------------------");
		System.out.println();
	    System.out.println("����)	3 �ڼ�¦");
	    System.out.println("        6 �ڼ�¦");
	    System.out.println("        9 �ڼ�¦");
	    System.out.println("        13 �ڼ�¦");
	    System.out.println();
	    System.out.println("--------------------------------------------------------------");
		System.out.println();
		System.out.println("����)");
		System.out.println();
		for(int clapCnt = 1; clapCnt <100; clapCnt++) {
			int sgDigt = clapCnt%10;
			int dbDigt = clapCnt/10; 
			if (dbDigt == 3|dbDigt == 6|dbDigt == 9) {
				if (sgDigt == 3|sgDigt == 6|sgDigt == 9) {
					System.out.println("        " + clapCnt + " �ڼ�¦¦");
				}else {
					System.out.println("        " + clapCnt + " �ڼ�¦");
					}
			}else if (sgDigt == 3|sgDigt == 6|sgDigt == 9) {
					System.out.println("        " + clapCnt + " �ڼ�¦");
			}
		}
		
// ���� 11��
 		System.out.println("=============================================================");
 		System.out.println();	
 		System.out.println("[����11] ���� �ڵ�� ���� ����� ������ ¦�� �̷絵�� 2���� �迭�� �ۼ��϶�.");
 		System.out.println();
	    System.out.println("        String course[] = {\"Java\", \"C++\", \"HTML5\", \"��ǻ�ͱ���\", \"�ȵ���̵�\"};");
	    System.out.println("        int score[]  = {95, 88, 76, 62, 55};");
	    System.out.println();
	    System.out.println("        �׸��� ���� ���ÿ� ���� ���� �̸��� �Է� �޾� ������ ����ϴ� ���α׷��� �ۼ��϶�.");
	    System.out.println("        \"�׸�\"���Է¹����������Ѵ�. (Java�� �ε��� 0�� �����Ƿ� score[0]�� ���)");
	    System.out.println();
	    System.out.println("        [Hint] ���ڿ��� ���ϱ� ���ؼ��� String Ŭ������ equals() �޼ҵ带 �̿��ؾ� �Ѵ�");
	    System.out.println();
		System.out.println("--------------------------------------------------------------");
		System.out.println();
		System.out.println("Ǯ��)	package Ex;");
		System.out.println("	import java.util.Scanner;");
		System.out.println("	ipublic class Ex0111 {");
		System.out.println("		public static void main(String[] args) {");
		System.out.println("			String course[] = {\"Java\", \"C++\", \"HTML5\", \"��ǻ�ͱ���\", \"�ȵ���̵�\"};");
		System.out.println("			int score[]  = {95, 88, 76, 62, 55};");
		System.out.println("			Scanner scan = new Scanner(System.in);");
		System.out.println("			System.out.println(\"���� �̸��� �Է��� ������ Ȯ���ϼ���.\");");
		System.out.println("			System.out.print(\"(���� Ȯ�� ���� ����: \");");
		System.out.println("			for(int c = 0; c < course.length; c++) {");
		System.out.println("				System.out.print(course[c] + \" \");");
		System.out.println("			}");
		System.out.println("			System.out.println(\")\");");
		System.out.println("			int i = 0;");
		System.out.println("			String name;");
		System.out.println("POS1:	  	    while(true) {");
		System.out.println("				name = scan.next();");
		System.out.println("				for(i = 0; i < course.length; i++) {");
		System.out.println("					if (course[i].equals(name)) {");
		System.out.println("						System.out.println(\"������ \" + name + \" ������ \" + score[i] +\"���Դϴ�.\");");
		System.out.println("						continue POS1;");
		System.out.println("					}");
		System.out.println("				}");
		System.out.println("			if(name.equals(\"�׸�\")){");
		System.out.println("				System.out.println(\"�Է��� �����մϴ�.\");");
		System.out.println("				break;");
		System.out.println("			}else {");
		System.out.println("				System.out.println(\"'\" + name + \"'\" + \"��(��) �ĺ� �Ұ����� ������Դϴ�. ��ҹ��ڸ� �����Ͽ� �ùٸ� ������� �Է��ϼ���.\");");
		System.out.println("			}");
		System.out.println("		}");
		System.out.println("	}");
		System.out.println("}");
		System.out.println();
		System.out.println("����) Ex ��Ű���� �ִ� Ex0111 ���Ͽ��� �������ּ���");
		
// ���� 12��
		System.out.println("=============================================================");
		System.out.println();			
		System.out.println("[����12] ��ǻ�Ϳ� ���� ������ ���� ���� �� ������ ������. ���ô� ���� �׸��� ����.");
		System.out.println("        ���ں��� ������ ���Ѵ�. ���ڰ� ���� ���� �� �� �ϳ��� �Է��ϰ� <Enter> Ű��");
		System.out.println("        ġ��,���α׷��� ���� ���� �� �߿��� �����ϰ� �ϳ��� �����ϰ� ��ǻ�Ͱ� �� ������ ");
		System.out.println("        �Ѵ�. ���ڰ� �Է��� ���� �����ϰ� ������ ���� ���Ͽ� ���� �̰���� �Ǵ��Ѵ�. ");
		System.out.println("        ���ڰ� ���� ���� �� ��� \"�׸�\"�� �Է��ϸ� ������ ������.");
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		System.out.println();
		System.out.println("����)");
		System.out.println("        ��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		System.out.println("        ���� ���� ��! >> ����");
		System.out.println("        ����� = ���� , ��ǻ�� = ���� ����ڰ� �̰���ϴ�.");
		System.out.println("        ���� ���� ��! >> ����");
		System.out.println("        ����� = ���� , ��ǻ�� = ���� �����ϴ�.");
		System.out.println("        ���� ���� ��! >> �׸�");
		System.out.println("        ������ �����մϴ�...");
		System.out.println("--------------------------------------------------------------");
		System.out.println();
		System.out.println("[Hint]");
		System.out.println("        ������ ���� ���ڿ� �迭�� �����");
		System.out.println("        String str[] = {\"����\", \"����\", \"��\"};");
		System.out.println("        ��ǻ�Ͱ� ���� ���� �����ϰ� �����ϱ� ���ؼ��� ���� �ڵ带 �̿��Ѵ�.");
		System.out.println("        int n = (int)(Math.random()*3); // n �� 0, 1, 2 �߿��� �����ϰ� ����");
		System.out.println("        ��ǻ�Ͱ� �� ���� \"����\" ���� ���ϴ� �ڵ�� ������ ���� �Ѵ�");
		System.out.println("        if(str[n].equals(\"����\")) //��ǻ�Ͱ� �� ���� \"����\"���� ���ϴ� ��");
		System.out.println("        ");
		System.out.println("--------------------------------------------------------------");
		System.out.println("Ǯ��)	package Ex;");
		System.out.println("        import java.util.Scanner;");
		System.out.println("        public class Ex0112 {");
		System.out.println("        	public static void main(String[] args) {");
		System.out.println("        		String rsp[] = {\"����\", \"����\", \"��\"}; // rock scissors paper array");
		System.out.println("        		int[] scrBrd= new int[] {0,0,0}; // Score Board / �迭�� ���m��� ��/��/��");
		System.out.println("        		int mc; // match count ���������� �º� �� ī��Ʈ");
		System.out.println("        		String ipt; // user input ������� �Է°�");
		System.out.println("        		int ui; // ������ �Է°��� �����ϴ� �迭�� �ڸ���");
		System.out.println("        		int ci; // ��ǻ�Ͱ� �� ������ ������, �迭�� ������ ������������ ���Ƿ� ���");
		System.out.println();
		System.out.println("        		System.out.println(\"��ǻ�Ϳ� ���������� ������ �����մϴ�!\");");
		System.out.println("        		Scanner scan = new Scanner(System.in);");
		System.out.println();
		System.out.println("        		while(true) { // ���ݺ� till break ����");
		System.out.println("        			ipt = scan.next(); // ���� �Է°�");
		System.out.println("        			switch (ipt) {");
		System.out.println("        				case \"����\":");
		System.out.println("        					ui = 0;");
		System.out.println("        					break;");
		System.out.println("        				case \"����\":");
		System.out.println("        					ui = 1;");
		System.out.println("        					break;");
		System.out.println("        				case \"��\":");
		System.out.println("        					ui = 2;");
		System.out.println("        					break;");
		System.out.println("        				default:");
		System.out.println("        					System.out.println(\"�߸��� �Է� ���Դϴ�. ����, ����, �� �� �ϳ��� �Է��Ͻʽÿ�.\");");
		System.out.println("        					continue;");
		System.out.println("        			}");
		System.out.println("        			ci = (int)(Math.random()*3);");
		System.out.println("        			System.out.println();");
		System.out.println("        			System.out.print(\"(���) \" + rsp[ui]+ \" vs \" + rsp[ci] + \" (��ǻ��) == \");");
		System.out.println("        			if((ui == 0 && ci == 2)||(ui == 1 && ci == 0)||(ui == 2 && ci == 1)) { // �̱�� ����� ��");
		System.out.println("        				scrBrd[0]++;");
		System.out.println("        				System.out.println(\"�¸�!\");");
		System.out.println("        			}");
		System.out.println("        			else if(ui == ci){ // ���� ����� ��");
		System.out.println("        				scrBrd[1]++;");
		System.out.println("        				System.out.println(\"���º�!\");");
		System.out.println("        			}");
		System.out.println("        			mc++;");
		System.out.println("        			System.out.println(\"��������� ������ \" + mc + \"�� \" + scrBrd[0] +\"�� \" + scrBrd[1] + \"�� \" + scrBrd[2] + \"�� �Դϴ�.\");");
		System.out.println("        			System.out.println();");
		System.out.println("        		}");
		System.out.println("        	}");
		System.out.println("       	}");
		System.out.println();
		System.out.println("����) Ex ��Ű���� �ִ� Ex0112 ���Ͽ��� �������ּ���");
		System.out.println("=============================================================");
	 // ������ �� 
	}

}

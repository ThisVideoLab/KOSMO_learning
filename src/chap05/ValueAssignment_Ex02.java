package chap05;

public class ValueAssignment_Ex02 {

	public static void main(String []args) {
		
		//1.배열에 원소값 대입하는 방법2
		int[] array1 = new int[3]; // 배열변수 array1(항상 array일 필요가 없음). 방크기:3.(이건 선언할때 최초로 1번하고 끝, 수정 불가능) 
								   // 방번호(index)" 0,1,2(3이니까 0부터 시작해서 3개 카운팅)
								   // 예를 들면 array[0],array[1],array[2]
									
		
		array1[0] = 3;
		array1[1] = 6;
		array1[2] = 9;
		
		System.out.println(array1[0] + " " + array1[1] + " " + array1[2]);
		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		int[] bingo1 = new int[3]; // 이렇게 변수 이름이 꼭 array일 필요는 없음
		
		bingo1[0] = 2;
		bingo1[1] = 4;
		
		System.out.println(bingo1[0] + " + " + bingo1[1]);
		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
//		bingo1[2] = 6; // 일부러 빙고 2는 할당하지 않음. 그리고 bingo1[2]를 불러봅시다.
		System.out.println(bingo1[2]); // 주인 없는 방을 부르면 0이 나옴.
		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		int[] array2 = new int[3];
			array2[0] = 3;
			array2[1] = 6;
			array2[2] = 9;
			
			System.out.println(array1[0] + " " + array1[1] + " " + array1[2]);
			
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		//배열에 원소값 대입하는 방법2
		
		int[] array3 = new int[] {3,4,5,6,7,8,9,10};// 이와 같이 new int 뒤에 대괄호에 숫자를 쓰는 대신 중괄호 안에 값을 직접 지정해도 됨. 방크기 쓰면 뻑남.
													// 이렇개 하면 첫번째 자리부터 0번째, 1번째,.... 순으로 불러와 짐
		System.out.println(array3[0]); // 0번째 자리에 있는 3이 출력됨
		
		System.out.println();
		System.out.println("===== 그냥 연습해본 포문 - 출석부 출력기 =====");
		System.out.println();
		
		String[] array33 = new String[] {"1번","2번","3번","4번","5번","6번","7번","8번","9번","10번"};
		String[] array333 = new String[] {"강하늘","김김김","나는나","동영배","라일락","마동석","바밀로","사기꾼","아줌마","자전거"};
		
		for (int i = 0; i < 5; i++ ) {
			System.out.print(array33[i] + " " + array333[i] );
			System.out.println("");// 이렇게 하면 미리 지정해 둔 값을 빠르게 입력할 수 있음.
		}
		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		int[] array4;
		array4 = new int[] {3,4,5};
		System.out.println(array4[2]); // index 2 번의 값만 출력함
		
		// 배열의 원소값을 대입하는 방법3
		int[] array5 = {11,12,13};
		System.out.println(array5[0] + " " + array5[1] + " " +array5[2] + " ");
		
		/* 오류 발생 주의사항
		int array6;
		array6 = {11,12,13};
		System.out.println(array6[0] + " " + array6[1] + " " +array6[2] + " ");
		*/
		
		
		
		System.out.println("-----남방한계선-----");
	}
}

package chap03;

public class ArithmeticOperator {

	public static void main(String[] args) {

		// ++ 는 1씩 증가
		int a = 3;
		++a;
		System.out.println(a);
		
		int b = 3;
		++b;
		System.out.println(b);
		
		System.out.println("==========");
		
		int a1 = 3;
		int b1 = ++a1;
		System.out.println(a1); // 결과값 4
		System.out.println(b1); // 결과값 4
		
		int a2 = 3;
		int b2 = a2++;  // a2 값을 b2에 대입 한 후에 a2의 값에 1을 더한다. (후위형)
		System.out.println(a2); 
		System.out.println(b2);
		
		System.out.println("==========");
		
		// 산술 연산자
		System.out.println(2 + 3);
		System.out.println(8 - 5);
		System.out.println(7 * 2);
		System.out.println(7 / 2); // 이 식의 특이점은 int형이기 때문에 정수만이 출력되어서, 값의 몫만 출력되고 소수점의 나머지는 버리게 된다는 것
		System.out.println(8 % 5); // 앞 수롤 뒷 수로 나누고 난 후에 나머지 값만을 출력함
		System.out.println("2"+"3"); // + 는 두 문자열을 연결하는 연산자
		
		System.out.println("==========");
		
		// 증감 연산자 (case 1)
		
		int value1 = 3;
		value1++ ;
		System.out.println(value1);
		
		int value2 = 3;
		++value2 ;
		System.out.println(value2);
		
		System.out.println("==========");
		
		// 증감 연산자 (case 2)
		int value3 = 3;
		int value4 = value3++;
		System.out.println(value3);
		System.out.println(value4);
		
		System.out.println("==========");
		
		// 증감 연산자 (case 3)
		
		int value7= 3; // 2
		int value8= 4; // 4
		int value9= 2 + value7-- + value8; // 2+3+4 = 9
		
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		
		
		
	}

}

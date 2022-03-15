package chap03;

public class OperatorEx04 {

	public static void main(String[] args) {

		/* 
		 * 대입 연산자 ( =, +=, -=, *=, /=, >>=, <<=, >>>= ), 수식에서의 우선순위가 제일 낮음.
		 *  a = b; < == 변수 b의 값을 a에 할당하는 의미, ==(같다)의 의미를 가진 논리 연산자와 혼동하지 말 것.
		 *  a = a + b (기본형) ==>> a+ = b (축약형)
		 *  a = a - b (기본형) ==>> a- = b (축약형)
		 *  a = a * b (기본형) ==>> a* = b (축약형)
		 *  a = a / b (기본형) ==>> a/ = b (축약형)
		 *  a = a & b (기본형) ==>> a& = b (축약형)
		 *  a = a | b (기본형) ==>> a| = b (축약형)      
		 */
		
		int value1 = 3;
		value1 = value1 + 3;
		System.out.println(value1);
		
		System.out.println("==========");
		
		// 축약 표현
		
		int value2; // 기본형 자료형인 경우 변수의 값을 넣지 않을 경우 기본값으로 0이 할당됨.
		 			// 참조자료형일 경우 변수 값을 할당하지 않을 경우 기본값으로 NULL이 출력됨.
		value2 = 5;
		System.out.println(value2 +  2);  // value2 = value2 +2
		System.out.println(value2 -=2); // value2 = value2 -2
		System.out.println(value2/= 2  ); //
		value2 = 5; System.out.println(value2 %= 2);
		value2 = 5; System.out.println(value2 | 2); // value2 = value2 | 2
		value2 = 5; System.out.println(value2 & 2);
		
		System.out.println("==========");
		
		/* 시프트 연산자
		   >> 와 << 연산자는 뒤에 오는 숫자 만큼 비트의 자리수를 밀어내는 연산자임. 이때 맨 앞대가리에 달린 음,양을 판별하는 비트는 건들지 않음.
		   고로 이 연산자는 값의 음수를 양수로 바꾸거나 하는 일은 하지 않음. 다만 쭉 밀어서 0으로 만들수 있긴 함. 
		   반면에 >>> 연산자는 앞대가리 비트를 포함해서 뒤에 오는 숫자만큼 비트를 밀어버림. 그러다보니까 멀쩡히 1 붙어서 음수 행세하던 비트가
		   갑자기 밀려나서 양수의 비트가 되어버림. 다만 반대의 일은 일어나지 않는게, 백날 밀어봤자 없던 1이 갑자기 뿅하고 끌려나올 수가 없기 때문임.
		    
		*/
		
		
		value2 = 5; System.out.println(value2 <<=2); // 10진법으로는 5인 0101 에서 왼쪽으로 2칸 시프트 하면 010100 , 10진법으로는 20이 됨.
		value2 = 5; System.out.println(value2 >>=2); // 10진법으로는 5인 0101 에서 오른쪽으로 2칸 시프트 하면 0001 , 10진법으로는 1이 됨.
		
		value2 = 5; System.out.println(value2 >>>=2); // 10진법으로는 5인 0101 에서 오른쪽으로 2칸 시프트 하면 0001 , 10진법으로는 1이 됨.
		int value3 = -128; System.out.println(value3 >>= 2); // 32가 나와야 함
		
		
	}

}

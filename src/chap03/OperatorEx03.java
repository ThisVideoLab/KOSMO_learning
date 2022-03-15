package chap03;

public class OperatorEx03 {

	public static void main(String[] args) {
		
		/*
		 * 논리 연산자 (&&, ||, ^, !) : 쇼트 서킷(앞부분의 연산 결과를 인지할 수 있을때, 뒷부분은 연산을 생략함)이 발생함. 
		 * 비트 연산자 ( &, |, ^ ,)   : 쇼트 서킷이 발생하지 않음.
		 *  
		*/
		
		// 1. 논리 연산자 AND (&&) 양값이 둘다 tru0e일때만 true를 출력함. 나머지는 다 false
		
		System.out.println(true && true); // true, 쇼트 서킷이 발생되지 않음. 뒤에도 봐야 하니까.
		System.out.println(true && false); // false, 쇼트 서킷이 발생되지 않음. 뒤에도 봐야 하니까.
		System.out.println(false && true); // false, 쇼트 서킷이 발생함. 뒤가 뭐던 앞에 false 뜨면 이미 조진거니까.
		System.out.println(true && (5<3)); // false, 쇼트 서킷이 발생하지 않음. 뒤에도 봐야 하니까.
		System.out.println((3<2) && (8<10)); // false, 쇼트 서킷이 발생함. 이미 앞부터 조져서 뒤를 볼 필요가 없어서
		
		System.out.println("==========");
		
		// 논리 연산자 OR (||)  : 둘 중 하나라도 true 값을 가지면 true를 출력함
		
		System.out.println(true || true); // true, 쇼트 서킷이 발생함. 앞에 트루니까 뒤는 볼것도 없지
		System.out.println(false || (5<3)); // true, 쇼트 서킷이 발생하지 않음. 앞이 false라서 뒤를 봐야하니까
		
		System.out.println("==========");
		
		// 논리 연산자 XOR (^) : 두 값이 같을때는 False를 출력, 두 값이 다를 때는 true를 출력하는 연산자
		
		System.out.println(true ^ true); // false, 이 연산자는 쇼트 서킷과는 관련이 없음
		System.out.println(false ^ false); // false
		System.out.println(true ^ false); // true
		System.out.println(false ^ true); // true
		System.out.println((5<=5) ^ (7>2));// false
		
		System.out.println("==========");
		
		// NOT (!) : true 이면 false, false 이면 true
		
		System.out.println(!true); // not 이므로 결과값이 반전되서 false가 됨
		System.out.println(!false); // 마찬가지로 반전
		System.out.println(false || !(5<3)); // 5<3 이 false였는데 ! not 연산자로 true 값이 됨. 결과적으로 앞뒤 트루 펄스 값이 달라서 xor 연산자에서 true로 출력됨. 
		
		System.out.println("==========");
		
		// 숏 서킷 사용 여부 ( 논리 연산자일 때 발생, 비트 연산자일때는 발생하지 않음)
		
		int value2 = 3;
		System.out.println(false && ++value2 > 6); // false 발생. 이때 앞 뒤의 값이 전부 참일때 참이 뜨는데 앞부터 일단 거짓이 떠서 뒷 계산은 안하고 그냥 쇼트서킷 발동해서 false값을 출력함.
		System.out.println(value2); // 원래는 앞에 증감 연산자 때문에 4가 나와야 정상인데, 쇼트 서킷이 발동해서 아예 연산 자체를 생략하는 바람에 그대로 3에 머무름.
		
		int value3 = 3;
		System.out.println(false & ++value3 > 6); // 결과는 false임 근데 쇼트서킷은 발생안함. 왜냐면 그냥 단순 비트 연산자라서 논리 판단을 안하기 때문임.
		System.out.println(value3); // 51줄의 논리 연산자의 결과와는 다르게 쇼크 서킷이 발생하지 않아서 55줄의 증감 연산자가 작동하여 value3의 값이 4로 바뀜 
		
		int value4 = 3;
		
		System.out.println(true || ++value4>6); // true, 쇼트 서킷이 발생해서 증감 연산 절차 생략
		System.out.println(value4);
		
		int value5 = 3;
		System.out.println(true | ++value5>6); // true, 쇼트 서킷이 발생하지 않아서 증감 연산 적용 확인됨
		System.out.println(value5);
		
		System.out.println("==========");
		
		
		
		
		
	}

}

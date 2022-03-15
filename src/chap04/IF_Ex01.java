package chap04;

public class IF_Ex01 {

	public static void main(String[] args) {

			// if 문:
		    //if  (조건){건이 참일때 실행되는 코드}

		int value1 = 4;
		if (value1>6) {
		System.out.println("실행1");}
		else if (value1 == 5) {System.out.println("우린 깐부자너");}
		else {System.out.println("장비를 정지합니다. 어 안되잖아?");}
		
		System.out.println("==========");
		
		boolean bool1 = true;
		boolean bool2 = false;
		
		if (bool1) {
			System.out.println("실행3");
		}else{
			System.out.println("실행4");
		}
		
		if (bool2) {
			System.out.println("실행5");
		}else{
			System.out.println("실행6");
		}
		
		System.out.println("==========");
		
		// if ~ else는 삼항 연산자로 변환이 가능함
		
		System.out.println((bool1) ? "실행7" : "실행8");
		System.out.println((bool2) ? "실행7" : "실행8");
		
		/* if의 조건이 여러개일 때
		  if(조건1){
		  	조건 1이 참일때 실행 코드;
		  	}else if(조건2){
		  	조건 2이 참일때 실행 코드;
		  	}else if(조건3){
		  		조건3이 참일때 실행 코드;
		  	}else{
		  	모든 위의 모든 조건을 만족하지 않을 때 실행 코드;
			}

		- 이프엘스이프엘스이프엘스 코드는 삼항 연사자로 전환하기에는 너무 복잡해서 못씀 
		*/
		
		System.out.println("==========");
		
		int value3 = 85;

		System.out.print("당신의 점수는 " + value3 +"점 이므로 " );
		
		if (value3>=90) {
			System.out.print("A 학점");
		}else if(value3>=80) {
			System.out.print("B 학점"); // value3가 85니까 여기서 걸려서 실행 후 if 문을 빠져나온다. 요 아래는 연산안함
		}else if(value3>=70) {
			System.out.print("C 학점");
		}else if(value3>=60) {
			System.out.print("D 학점");
		}else{
			System.out.print("F 학점");
		}
		System.out.println("입니다");

		System.out.println("==========");

		// if문에서 조건의 순서가 바뀌었을 경우 - 세부적인 조건 설정의 중요성
		
		value3 = 84; // 점수 재설정
		
System.out.print("당신의 점수는 " + value3 +"점 이므로 " );
		
		if (value3>=90) {
			System.out.print("A 학점"); // 밸류3이 조건보다 점수가 낮음 => false 되면서 다음 조건으로 이동
		}else if(value3>=70) {
			System.out.print("C 학점"); // 여기 순서를 위꺼에서 한칸 올려줘서 일부러 조건의 순서를 바꿔봄. value3가 조건으 만족하기 때문에 값 출력하고 if 퇴장.
		}else if(value3>=80) {
			System.out.print("B 학점"); // 더 세밀한 조건임에도 이미 value3에 부합하는 느슨한 선행 조건으로 인해 연산되지 못하고 말았음. -> 세부적인 조건 설정의 중요성 
		}else if(value3>=60) {
			System.out.print("D 학점");
		}else{
			System.out.print("F 학점");
		} 
		System.out.println("입니다만 뭔가 조건이 잘못된거 같군요");
		
		System.out.println("==========");

		// 조건을 세밀하게 설정한 경우
		
		value3 = 85;
		
		if(value3 <= 100 && value3 >= 90){
			System.out.println("A 학점입니다. 놀라운 결과군요");
		}else if(value3 < 90 && value3 >= 80) {
			System.out.println("B 학점입니다. 잘했습니다.");
		}else if(value3 < 80 && value3 >= 70) {
			System.out.println("C 학점입니다. 좀더 분발하세요.");
		}else if(value3 < 70 && value3 >= 60) {
			System.out.println("D 학점입니다. 공부하신건가요?");
		}else{
			System.out.println("F 학점입니다. 내년에 뵙겠습니다");
		}

		System.out.println("==========");
		
		// if 문에서 중괄호{}가 생략된 경우 - 실행문이 하나일때는 중괄호를 생략해서 처리할 수 있음.
		
		if (3 < 5) System.out.println("하이1"); // 실행문이 하나뿐이라서 그냥 쌩까고 붙여버림
		
		System.out.println("==========");
		
		if (3 > 5) System.out.println("하이2"); else System.out.println("바이2"); // 이렇게 엘스 꽂고 바로 중괄호 없이 때려박아도 됨. 근데 데드코드 떠서 덜 해피함.
		
//		if (6 > 5) System.out.println("하이2"); else if System.out.println("바이2"); else System.out.println("빠빠이2"); // 그런데 이렇게 3개 이상되면 오류 뿜뿜.
		
		System.out.println("==========");
		
		if (6 > 5) System.out.println("하이3"); System.out.println("바이3"); // 이렇게 박으면 하이3은 참일때만 출력되고, 거짓일때는 그냥 출력 안됨.
																		   // 그런데 이거랑 무관하게 바이3 구문은 바이 3대로 걍 출력해버림.
		
		
		
		
		
	}

}

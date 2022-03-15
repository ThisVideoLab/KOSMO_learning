package chap02;

public class NamingVariableAndConstant {

	public static void main(String[] args) {
		
		
		//변수명
		boolean aBcD; // 변수명의 첫자는 소문자로 시작, 단어가 연결되는 경우에 첫 단어는 대문자로 처리함. camel 표기법 (camel case)
		int ABCD; // 물론 변수명은 대문자를 넣을 수 있음. 그러나 권장하지 아니함.
		String abcd; // 예외적으로 상수는 대문자로 표시해서 변수와 구분함. 예외라는 점.
		byte 가나다라; // 변수명에 한글을 넣을 수 있음. 그러나 권장하진 않음. 하지마이 임마.
		short _abcd; // 변수명에 특수문자를 오로지 _와 $만 사용할 수 있음.
//		char ab cdl; // 그 외에 공백을 포함한 다른 특수 문자는 넣을 수 없음.
		long abcd3; // 변수명에 숫자를 넣을 수 있음. 단 변수명의 첫자리에 숫자가 오면 안됨.
//      long 3abcd; // 근데 또 숫자가 첫자리에 오면 안됨.
//		double class; // 자바에서 사용하는 예약어들은 변수명으로 사용할 수 없음.
		
		// 상수명 : 값을 변경할 수 없어야 하는 녀석들. 그래서 final을 붙여서 박제해버림. 만약 후행코드에서 재할당하려면 에러코드가 떠버림.
		final double PI; // 이제 이 PI는 제 겁니다. 제 마음대로할 수 있는 겁니다. 
		final int MY_DATA;
		final float my_data; // 상수를 물론 소문자로 때려 넣을순 있다. 대신 그러면 사수가 너를 때린다.
		
		 
		
		
			}

}

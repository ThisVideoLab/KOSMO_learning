package chap15.EX01;

// 자막프레임과 비디오 프레임을 동시에 출력되는 방법을 강구해보자

public class TheNeedForThead {
	public static void main(String[] args) {

		//1. 비디오 프레임 : 1 ~ 5
		int [] intArr = {1,2,3,4,5};
		
		//2. 자막 프레임 : 하나~ 다섯
		String [] strArr = {"하나","둘","셋","넷","다섯"};
		
		//3. 비디오 프레임 출력 : 원래 의도대로 정상 출력됨
		for (int i = 0; i< intArr.length; i++) {
			System.out.println("(비디오 프레임" + intArr[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} //0.2초 동안 일시정지
		}
		
		//4. 자막 프레임 출력 : 이 자막의 동시 출력이 불가능함. 비디오 프레임이 다 출력되고 난 뒤에야 출력되는 현상을 보임.
		for (int i = 0; i< intArr.length; i++) {
			System.out.println("(자막번호)" + strArr[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			} //0.2초 동안 일시정지
		}
		
	// 문서의 끝
	}
}

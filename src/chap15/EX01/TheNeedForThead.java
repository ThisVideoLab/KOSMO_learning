package chap15.EX01;

public class TheNeedForThead {
	public static void main(String[] args) {

		//1. 비디오 프레임 : 1 ~ 5
		int [] intArr = {1,2,3,4,5};
		
		//2. 자막 프레임 : 하나~ 다섯
		String [] strArr = {"하나","둘","셋","넷","다섯"};
		
		//3. 비디오 프레임 출력
		for (int i = 0; i< intArr.length; i++) {
			System.out.println("(비디오 프레임" + intArr[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} //0.2초 동안 일시정지
		}
		
		//4. 자막 프레임 출력
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

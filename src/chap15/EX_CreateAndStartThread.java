package chap15;


/* 쓰레드 4개를 생성해보자.
각 값은 String 배열에 저장한 후에 아래 (쓰레드 구성)과 같은 모양으로 출력할 것.
이때 순서대로 위인별로 쓰레드 상속 2열은 러너블 구현, 3열은 익명내부 클래스를 생성해서 구현한다

쓰레드 구성

11  2222  3333  4444
이름 홍길동  이순신  신사임당
나이 40    50    60 
국어 100   90    80
영어 70    60    100
수학 50    70    80
*/

class Column1Thread extends Thread { // 비디오 프레임을 처리하는 쓰레드
	@Override
	public void run() {
		//2. 비디오 프레임 출력
		String[] col1Arr = {"이름","나이","국어","영어","수학"};
		for(int i = 0; i < col1Arr.length ; i ++) {
			System.out.print(col1Arr[i] + " ");
			try {Thread.sleep(500);}catch(InterruptedException e) {} // 0.2초 딜레이
		}
	}
}

class SMIFileRunnable implements Runnable{   // 인터페이스

	   @Override
	   public void run() {
	      // 자막번호 출력
		  String [] col2Arr = {"홍길동", "40   ", "100  ", "70   ", "50   "};
	      try {Thread.sleep(100);} catch (InterruptedException e1) {}
	         
	      for (int i = 0 ; i < col2Arr.length ; i++) {
	         System.out.print(col2Arr[i] +" ");
	         try {Thread.sleep(500);} catch (InterruptedException e) {}
	         }
	   }
	}


public class EX_CreateAndStartThread {

	public static void main(String[] args) {
		
		 System.out.println("위인들의 성적을 출력합니다");
		 System.out.println("==================");
		 System.out.println();
		
		Thread threadCol1 = new  Column1Thread();
		threadCol1.start();
		
		 Runnable col2 = new SMIFileRunnable();
	      Thread threadCol2 = new Thread(col2);   // Runnabel 객체를 Thread생성자 내부에 넣는다
	      threadCol2.start();
		
	      Thread threadCol3 = new Thread( new Runnable() {
				public void run() {
		      // 1. 자막번호 출력
		      String [] col3Arr = {"이순신", "50   ", "90   ", "60   ", "70   "};
		      try {Thread.sleep(200);} catch (InterruptedException e1) {}
		         
		      for (int i = 0 ; i < col3Arr.length ; i++) {
		         System.out.print(col3Arr[i] + " ");
		         try {Thread.sleep(500);} catch (InterruptedException e) {}
		         }
		   };}
		);
	    threadCol3.start();
		
        Thread threadCol4 = new Thread( new Runnable() {
			public void run() {
	      // 1. 자막번호 출력
	      String [] col3Arr = {"신사임당", "60  ", "80  ", "100 ", "80  "};
	      try {Thread.sleep(300);} catch (InterruptedException e1) {}
	         
	      for (int i = 0 ; i < col3Arr.length ; i++) {
	         System.out.println(col3Arr[i]);
	         try {Thread.sleep(500);} catch (InterruptedException e) {}
	         }
	      System.out.println();
	      System.out.println("=================");
	      System.out.println("출력이 완료되었습니다.");
		   };}
		);
	      threadCol4.start();
	   
	   
			
		// 문서의 끝
	}

}

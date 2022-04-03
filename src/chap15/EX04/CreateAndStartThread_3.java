package chap15.EX04;

// Runnable 인터페이스의 run을 구현해서 스레드 생성

class SMIFileRunnable implements Runnable{   // 인터페이스

   @Override
   public void run() {
      // 자막번호 출력
      String [] strArray = {"하나", "둘", "셋", "넷", "다섯"};
      try {Thread.sleep(10);} catch (InterruptedException e1) {}
         
      for (int i = 0 ; i < strArray.length ; i++) {
         System.out.println("(자막 번호) " + strArray[i]);
         try {Thread.sleep(200);} catch (InterruptedException e) {}
         }
   }
}


class VideoFileRunnable implements Runnable{
   @Override
   public void run() {
      // 비디오 프레임 출력
       int [] intArray = {1,2,3,4,5};
       for(int i = 0 ; i < intArray.length ; i++) {
          System.out.print("(비디오프레임) " + intArray[i]);
          try {Thread.sleep(200);}catch (InterruptedException e) {}
       }
   }
}

public class CreateAndStartThread_3 {
   public static void main(String[] args) {
      
      Runnable smi = new SMIFileRunnable();
//      smi.start();    // start() 메소드는 Runnable 인터페이스 내에 존재하지 않는다
      Thread thread = new Thread(smi);   // Runnabel 객체를 Thread생성자 내부에 넣는다
      thread.start();
      
      Runnable vid = new VideoFileRunnable();
      Thread thread1 =new Thread(vid);
      thread1.start();
      
      
   }

}
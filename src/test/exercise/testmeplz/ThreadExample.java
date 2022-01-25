package test.exercise.testmeplz;

/**
 * packageName    : test.exercise.testmeplz
 * fileName       : ThreadExample
 * author         : letscombine
 * date           : 2022-01-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-24        letscombine       최초 생성
 */


public class ThreadExample {
      public static void main(String[] args) {
            Thread th1 = new MovieThread();
            th1.start();

            Thread th2 = new Thread(new MusicThread());
            th2.start();
      }

      private static class MusicThread implements Runnable {
            @Override
            public void run() {
                  for (int i = 0; i < 3; i++) {
                        System.out.println("음악을 재생합니다");

                        try {
                              Thread.sleep(1000);
                        } catch (InterruptedException e) {

                        }
                  }
            }
      }
}

class MovieThread extends Thread {
      @Override
      public void run() {
            for (int i = 0; i < 3; i++) {
                  System.out.println("동영상을 재생합니다");
                  try {
                        Thread.sleep(1000);
                  } catch (InterruptedException e) {

                  }
            }
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
package test.exercise.testmeplz;

/**
 * packageName    : test.exercise.testmeplz
 * fileName       : Ex13_11
 * author         : letscombine
 * date           : 2022-01-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-24        letscombine       최초 생성
 */


public class Ex13_11 {
      static long startTime = 0;

      public static void main(String[] args) {
            ThreadEx11_1 th1 = new ThreadEx11_1();
            ThreadEx11_2 th2 = new ThreadEx11_2();
            th1.start();
            th2.start();
            startTime = System.currentTimeMillis();

            try {
                  th1.join(); //main 스레드가 th1의 작업이 끝날때 까지 기다리
                  th2.join();
            } catch (InterruptedException e) {

            }
            System.out.printf("startTime = %d%n", (System.currentTimeMillis()-startTime));
      }

}

class ThreadEx11_1 extends Thread {
      @Override
      public void run() {
            for (int i = 0; i < 300; i++) {
                  System.out.print(new String("-"));

            }
      }
}

class ThreadEx11_2 extends Thread {
      @Override
      public void run() {
            for (int i = 0; i < 300; i++) {
                  System.out.print(new String("|"));

            }
      }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
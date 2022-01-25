package test.exercise.testmeplz;

/**
 * packageName    : test.exercise.testmeplz
 * fileName       : Ex13_10
 * author         : letscombine
 * date           : 2022-01-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-24        letscombine       최초 생성
 */


public class Ex13_10 {
      public static void main(String[] args) {
            RunImplEx10 r = new RunImplEx10();
            Thread th1 = new Thread(r, "*");
            Thread th2 = new Thread(r, "**");
            Thread th3 = new Thread(r, "***");

            th1.start();
            th2.start();
            th3.start();

            try {
                  Thread.sleep(2000);
                  th1.suspend();
            }catch (InterruptedException e){}
      }
}

class RunImplEx10 implements Runnable {
      @Override
      public void run() {
            while (true) {

            }
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
package test.exercise.testmeplz;

import java.net.SocketOption;


/**
 * packageName    : test.exercise.testmeplz
 * fileName       : Ex13_8
 * author         : letscombine
 * date           : 2022-01-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-24        letscombine       최초 생성
 */


public class Ex13_8 {
      public static void main(String[] args) {
            ThreadEx8_1 th1 = new ThreadEx8_1();
            ThreadEx8_2 th2 = new ThreadEx8_2();
            th1.start();
            th2.start();


            delay(2 * 1000);
            System.out.print("<<main 종료>>");
      }

      static void delay(long millis) {
            try {
                  Thread.sleep(millis); //th1을 2초동안 잠자게??
            } catch (Exception e) {

            }
      }
}

class ThreadEx8_1 extends Thread {
      @Override
      public void run() {
            for (int i = 0; i < 300; i++) {
                  System.out.print("-");

            }
            System.out.print("<<th1 종료>>");

      }//run()
}

class ThreadEx8_2 extends Thread {
      @Override
      public void run() {
            for (int i = 0; i < 300; i++) {
                  System.out.print("|");
            }
            System.out.print("<<th2 종료>>");
      }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
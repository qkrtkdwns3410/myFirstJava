package test.exercise.testmeplz;

import sun.java2d.opengl.WGLGraphicsConfig;


/**
 * packageName    : test.exercise.testmeplz
 * fileName       : MyThreadEx18
 * author         : letscombine
 * date           : 2022-01-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-24        letscombine       최초 생성
 */


public class MyThreadEx18 implements Runnable {
      boolean suspended = false ;
      boolean stopped = false;

      Thread th;

      public MyThreadEx18(String name) {
            this.th = new Thread(this, name);
      }

      @Override
      public void run() {
            while (!stopped) {
                  if (!suspended) {
                        /*작업 영역*/

                        try {
                              Thread.sleep(1000);

                        } catch (InterruptedException e) {
                              System.out.println(e.getMessage());
                        }
                  } // suspended
            } // while
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
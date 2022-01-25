package test.exercise.testmeplz;

import javax.tools.Tool;
import java.awt.*;


/**
 * packageName    : test.exercise.testmeplz
 * fileName       : BeepTask
 * author         : letscombine
 * date           : 2022-01-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-24        letscombine       최초 생성
 */


public class BeepTask implements Runnable {
      @Override
      public void run() {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            for (int i = 0; i < 5; i++) {
                  toolkit.beep();
                  System.out.println("삡");
                  try {
                        Thread.sleep(500);
                  } catch (Exception e) {

                  }
            }
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
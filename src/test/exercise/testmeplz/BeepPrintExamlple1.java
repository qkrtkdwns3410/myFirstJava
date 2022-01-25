package test.exercise.testmeplz;

import javax.transaction.xa.XAException;
import java.awt.*;


/**
 * packageName    : test.exercise.testmeplz
 * fileName       : BeepPrintExamlple1
 * author         : letscombine
 * date           : 2022-01-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-24        letscombine       최초 생성
 */


public class BeepPrintExamlple1 {
      public static void main(String[] args) {

            Toolkit toolkit = Toolkit.getDefaultToolkit(); //Toolkit객체 얻기
            for (int i = 0; i < 5; i++) {
                  toolkit.beep();
                  try {
                        Thread.sleep(500);
                  } catch (Exception e) {

                  }
            }
            for (int i = 0; i < 5; i++) {
                  System.out.println("띵");
                  try {
                        Thread.sleep(500);
                  } catch (Exception e) {

                  }
            }
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
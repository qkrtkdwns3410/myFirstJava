package test.exercise.testmeplz;

/**
 * packageName    : test.exercise.testmeplz
 * fileName       : BeepPrintExample2
 * author         : letscombine
 * date           : 2022-01-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-24        letscombine       최초 생성
 */


public class BeepPrintExample2 {
      public static void main(String[] args) {
            Runnable beepTask = new BeepTask();
            Thread thread = new Thread(beepTask);
            thread.start();

            for (int i = 0; i < 5; i++) {
                  System.out.println("띵");
                  try {
                        Thread.sleep(500);
                  } catch (Exception e) {

                  }
            }
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
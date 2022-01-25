package test.doit;

/**
 * packageName    : test.doit
 * fileName       : AdvancedLevel
 * author         : letscombine
 * date           : 2022-01-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-18        letscombine       최초 생성
 */


public class AdvancedLevel extends PlayerLevel {
      @Override
      public void run() {
            System.out.println("빨리 달림");
      }

      @Override
      public void jump() {
            System.out.println("높게 점프");
      }

      @Override
      public void turn() {
            System.out.println("AdvancedLevel.turn X");

      }

      @Override
      public void showLevelMessage() {
            System.out.println("========================");
            System.out.println("AdvancedLevel.showLevelMessage");


      }

}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
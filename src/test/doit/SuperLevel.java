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


public class SuperLevel extends PlayerLevel {
      @Override
      public void run() {
            System.out.println("엄청 빨리 달림");
      }

      @Override
      public void jump() {
            System.out.println("엄청 높게 점프");
      }

      @Override
      public void turn() {
            System.out.println("한 바퀴 돈다");
      }

      @Override
      public void showLevelMessage() {
            System.out.println("========================");
            System.out.println("SuperLevel.showLevelMessage");


      }

}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
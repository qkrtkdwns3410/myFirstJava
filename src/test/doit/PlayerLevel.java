package test.doit;

/**
 * packageName    : test.doit
 * fileName       : PlayerLevel
 * author         : letscombine
 * date           : 2022-01-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-18        letscombine       최초 생성
 */


public abstract class PlayerLevel {
      public abstract void run();

      public abstract void jump();

      public abstract void turn();


      public abstract void showLevelMessage();

      final public void go(int count) {
            run();
            for (int i = 0; i < count; i++) {
                  jump();
            }
            turn();

      }

}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
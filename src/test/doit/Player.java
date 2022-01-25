package test.doit;

/**
 * packageName    : test.doit
 * fileName       : Player
 * author         : letscombine
 * date           : 2022-01-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-18        letscombine       최초 생성
 */


public class Player {
      private PlayerLevel level; //

      public Player() {
            level = new BeginnerLevel();
            level.showLevelMessage();
      }

      public PlayerLevel getLevel() {
            return level;
      }

      public void upgradeLevel(PlayerLevel level) {
            this.level = level;
            level.showLevelMessage();

      }

      public void play(int count) {
            level.go(count);
      }

}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
package test.doit;

/**
 * packageName    : test.doit
 * fileName       : MainBoard
 * author         : letscombine
 * date           : 2022-01-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-18        letscombine       최초 생성
 */


public class MainBoard {
      public static void main(String[] args) {

            Player player = new Player();
            player.play(1);

            AdvancedLevel advancedLevel = new AdvancedLevel();
            player.upgradeLevel(advancedLevel);
            player.play(2);


            SuperLevel superLevel = new SuperLevel();
            player.upgradeLevel(superLevel);
            player.play(3);

      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
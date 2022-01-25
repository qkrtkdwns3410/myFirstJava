package test.doit;

import java.net.SocketOption;


/**
 * packageName    : test.doit
 * fileName       : BeginnerLevel
 * author         : letscombine
 * date           : 2022-01-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-18        letscombine       최초 생성
 */


public class BeginnerLevel extends PlayerLevel {
      @Override
      public void run() {
            System.out.println("천천히 달림");
      }

      @Override
      public void jump() {
            System.out.println("BeginnerLevel.jump X");

      }

      @Override
      public void turn() {
            System.out.println("BeginnerLevel.turn X");

      }

      @Override
      public void showLevelMessage() {
            System.out.println("========================");

            System.out.println("BeginnerLevel.showLevelMessage");
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
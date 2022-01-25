package test.doit;

import javax.crypto.interfaces.PBEKey;


/**
 * packageName    : test.doit
 * fileName       : Car
 * author         : letscombine
 * date           : 2022-01-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-18        letscombine       최초 생성
 */


public abstract class Car {
      public abstract void drive();

      public abstract void stop();

      public abstract void wiper();

      public void startCar() {
            System.out.println("시동을 켭니다");
      }

      public void turnOff() {
            System.out.println("시동을 끕니다");
      }

      public void washCar() {
            System.out.println("세차함");
      }

      final public void run() {
            startCar();
            drive();
            stop();
            turnOff();
            washCar();
      } //템플릿 메서드


}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
package test.doit;

/**
 * packageName    : test.doit
 * fileName       : ManualCar
 * author         : letscombine
 * date           : 2022-01-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-18        letscombine       최초 생성
 */


public class ManualCar  extends Car{
      @Override
      public void drive() {
            System.out.println("사람이 운전합니다");
            System.out.println("사람이 핸들을 조작합니다");
      }

      @Override
      public void wiper() {
            System.out.println("일반 와이퍼");
      }

      @Override
      public void stop() {
            System.out.println("브레이크로 정지합니다");
      }

}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
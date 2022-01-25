package test.doit;

/**
 * packageName    : test.doit
 * fileName       : RoundRobin
 * author         : letscombine
 * date           : 2022-01-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-18        letscombine       최초 생성
 */


public class RoundRobin implements Scheduler {
      @Override
      public void getNextCall() {
            System.out.println("상담 전화를 순서대로");
      }

      @Override
      public void sendCallToAgent() {
            System.out.println("다음 순서 상담원에게 배분");
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
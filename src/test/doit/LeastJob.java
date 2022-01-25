package test.doit;

/**
 * packageName    : test.doit
 * fileName       : LeastJob
 * author         : letscombine
 * date           : 2022-01-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-18        letscombine       최초 생성
 */


public class LeastJob implements Scheduler {
      @Override
      public void getNextCall() {
            System.out.println("상담 전화 순서대로");
      }

      @Override
      public void sendCallToAgent() {
            System.out.println("대기 적은 사람에게");
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
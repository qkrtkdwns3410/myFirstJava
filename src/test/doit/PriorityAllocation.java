package test.doit;

/**
 * packageName    : test.doit
 * fileName       : PriorityAllocaton
 * author         : letscombine
 * date           : 2022-01-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-18        letscombine       최초 생성
 */


public class PriorityAllocation implements Scheduler {
      @Override
      public void getNextCall() {
            System.out.println("고객등급이 높은 고객의 전화를 먼저 가져옴");
      }

      @Override
      public void sendCallToAgent() {
            System.out.println("업무 skiill 값이 높은 상담원 우선배정");
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
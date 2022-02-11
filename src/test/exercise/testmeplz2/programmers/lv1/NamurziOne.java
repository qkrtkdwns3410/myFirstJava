package test.exercise.testmeplz2.programmers.lv1;

/**
 * packageName    : test.exercise.testmeplz2.programmers
 * fileName       : NamurziOne
 * author         : letscombine
 * date           : 2022-02-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-02-10        letscombine       최초 생성
 */


public class NamurziOne {
      
      public static void main(String[] args) {
      
            solution(10);
            System.out.println("======================================================");
            solution(12);
            
      }
      
      public static int solution(int n) {
      
            int x;
            for (x = 1; x < n; x++) {
                  if (n % x == 1) {
                        return x;
                  }
            }
      
            return x;
      }
      
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
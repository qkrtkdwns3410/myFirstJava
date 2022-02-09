package test.exercise.testmeplz2.programmers;

/**
 * packageName    : test.exercise.testmeplz2.programmers
 * fileName       : MeasureCountPlus
 * author         : letscombine
 * date           : 2022-02-09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-02-09        letscombine       최초 생성
 */


public class MeasureCountPlus {
      
      public static void main(String[] args) {
            
            solution(13, 17);
            System.out.println("======================================================");
            solution(24, 27);
      }
      
      public static int solution(int left, int right) {
      
            int sum = 0;
      
            for (; left <= right; left++) {
                  int count = 0;
                  for (int divNum = 1; divNum <= left; divNum++) {
                        if (left % divNum == 0) {
                              count += 1;
                             
                        
                        }
                  }
                  
                  if (count % 2 == 0) {
                        sum += left;
                  } else {
                        sum -= left;
                  }
            }
      
            return sum;
      }
      
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
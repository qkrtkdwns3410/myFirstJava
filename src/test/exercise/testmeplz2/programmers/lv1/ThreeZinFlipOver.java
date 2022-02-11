package test.exercise.testmeplz2.programmers.lv1;

import java.util.ArrayList;


/**
 * packageName    : test.exercise.testmeplz2.programmers
 * fileName       : ThreeZinFlipOver
 * author         : letscombine
 * date           : 2022-02-09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-02-09        letscombine       최초 생성
 */


public class ThreeZinFlipOver {
      
      public static void main(String[] args) {
            
            solution(45);
            System.out.println("======================================================");
            solution(3);
            
      }
      
      public static int solution(int n) {
            
            System.out.println("n = " + n);
            System.out.println("======================================================");
            int answer = 0;
      
            ArrayList<Integer> threeList = new ArrayList<>();
            ArrayList<Integer> threeListFliped = new ArrayList<>();
            
            while (n >= 3) {
                  
                  threeList.add(n % 3);
                  n /= 3;
            }
            
            threeList.add(n % 3);
            
            
            int index = 0;
            int tenValue = 0;
            for (int threeIdx = threeList.size() - 1; threeIdx >= 0; threeIdx--) {
                  threeListFliped.add(threeList.get(threeIdx));
            }
            System.out.println("threeListFliped = " + threeListFliped);
            for (int multiValue = 1;;multiValue*=3) {
                  if (index >= threeListFliped.size()) {

                        break;
                  }
                  tenValue+= (multiValue * threeListFliped.get(index));
                  index += 1;
                  System.out.println("tenValue = " + tenValue);
            }
            System.out.println("tenValue = " + tenValue);
            return answer;
      }
      
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
package test.exercise.testmeplz2.programmers.lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;


/**
 * packageName    : test.exercise.testmeplz2.programmers
 * fileName       : Phoneketmon
 * author         : letscombine
 * date           : 2022-02-09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-02-09        letscombine       최초 생성
 */


public class Phoneketmon {
      
      public static void main(String[] args) {
            
            solution(new int[]{3, 1, 2, 3});
            System.out.println("======================================================");
            solution(new int[]{3, 3, 3, 2, 2, 4});
            System.out.println("======================================================");
            solution(new int[]{3, 3, 3, 2, 2, 2});
            
      }
      
      public static int solution(int[] nums) {
      
            System.out.println("nums = " + Arrays.toString(nums));
      
            HashSet<Integer> monMap = new HashSet<>();
            
            for (int idx = 0; idx < nums.length; idx++) {
                  monMap.add(nums[idx]);
            }
            System.out.println("monMap = " + monMap);
            int choice = nums.length / 2;
      
            if (choice < monMap.size()) {
                  System.out.println("choice = " + choice);
                  return choice;
            } else {
                  System.out.println("monMap = " + monMap.size());
                  return monMap.size();
            }
            
           
            
      }
      
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
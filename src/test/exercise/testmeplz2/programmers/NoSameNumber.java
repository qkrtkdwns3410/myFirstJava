package test.exercise.testmeplz2.programmers;

import java.util.ArrayList;


/**
 * packageName    : test.exercise.testmeplz2.programmers
 * fileName       : NoSameNumber
 * author         : letscombine
 * date           : 2022-02-11
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-02-11        letscombine       최초 생성
 */


public class NoSameNumber {
      
      public static void main(String[] args) {
                  solution(new int[]{1, 1, 3, 3, 0, 1, 1});
            System.out.println("======================================================");
            solution(new int[]{4, 4, 4, 3, 3});
            
      }
      
      public static ArrayList<Integer> solution(int[] arr) {
            ArrayList<Integer> answer = new ArrayList<>();
      
            int index = 0;
            answer.add(arr[0]);
            for (int arrIdx = 1; arrIdx < arr.length; arrIdx += 1) {
                  
                  int arrNum = arr[arrIdx];
                  System.out.println("arrNum = " + arrNum);
                  
                  if (arrNum != answer.get(index)) {
                        answer.add(arr[arrIdx]);
      
                        index += 1;
                  }
                  
      
                  System.out.println("answer = " + answer);
            }
            
            
            return answer;
      }
      
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
package test.exercise.testmeplz2.programmers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/**
 * packageName    : test.exercise.testmeplz2.programmers
 * fileName       : NoNumberPlusGame
 * author         : letscombine
 * date           : 2022-02-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-02-03        letscombine       최초 생성
 */


public class NoNumberPlusGame {
      public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4,  6, 7, 8, 0};
            Solution5 solution5 = new Solution5();
            solution5.solution(numbers);
      }

}

class Solution5 {
      public int solution(int[] numbers) {
            List<Integer> intList = Arrays.stream(numbers).boxed().collect(Collectors.toList());
            System.out.println("intList = " + intList);
            System.out.println("======================================================");

            int sum = 0;
            for (int index = 0; index <= 9; index++) {
                  if (!intList.contains(index)) {
                        sum += index;
                  }
            }
            System.out.println("sum = " + sum);

            return sum;
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
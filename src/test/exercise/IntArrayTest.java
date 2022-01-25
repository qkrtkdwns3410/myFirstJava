package test.exercise;

import java.util.Arrays;


/**
 * packageName    : test.exercise
 * fileName       : IntArrayTest
 * author         : letscombine
 * date           : 2022-01-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-20        letscombine       최초 생성
 */


public class IntArrayTest {
      public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};

            int sumVal = Arrays.stream(arr)
                    .sum();
            int count = (int) Arrays.stream(arr)
                    .count();

            System.out.println("sumVal = " + sumVal);
            System.out.println("count = " + count);
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
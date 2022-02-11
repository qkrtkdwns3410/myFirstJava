package test.exercise.testmeplz2.programmers.lv2;

import java.util.Arrays;


/**
 * packageName    : test.exercise.testmeplz2.programmers.lv2
 * fileName       : LowestNumber
 * author         : letscombine
 * date           : 2022-02-11
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-02-11        letscombine       최초 생성
 */


public class LowestNumber {
      
      
      public static void main(String[] args) {
            solution(new int[]{1, 4, 2}, new int[]{5, 4, 4});
            System.out.println("======================================================");
            solution(new int[]{1, 2}, new int[]{3, 4});
      }
      
      public static int solution(int[] A, int[] B) {
            System.out.println("A = " + Arrays.toString(A));
            System.out.println("B = " + Arrays.toString(B));
            
            int answer = 0;
            
            selectionSortByAscending(A, A.length);
            selectionSortByDescending(B, B.length);
            
            System.out.println("A = " + Arrays.toString(A));
            System.out.println("B = " + Arrays.toString(B));
      
            for (int repeat = 0; repeat < A.length; repeat += 1) {
            
            }
            return answer;
      }
      
      public static void selectionSortByAscending(int[] arr, int arrLength) {
            int minIdx = 0;
            for (int idx = 0; idx < arrLength - 1; idx += 1) {
                  minIdx = idx;
                  
                  for (int innerIdx = idx + 1; innerIdx < arrLength; innerIdx += 1) {
                        
                        if (arr[minIdx] > arr[innerIdx]) {
                              minIdx = innerIdx;
                              
                        }
                  }
                  
                  Swap(arr[minIdx], arr[idx]);
            }
      }
      
      public static void selectionSortByDescending(int[] arr, int arrLength) {
            int maxIdx;
            
            for (int idx = 0; idx < arrLength - 1; idx += 1) {
                  maxIdx = idx;
                  
                  for (int innerIdx = idx + 1; innerIdx < arrLength; innerIdx += 1) {
                        if (arr[maxIdx] < arr[innerIdx]) {
                              maxIdx = innerIdx;
                        }
                  }
                  
                  Swap(arr[maxIdx], arr[idx]);
            }
      }
      
      private static void Swap(int num1, int num2) {
            int temp;
            temp = num1;
            num1 = num2;
            num2 = temp;
      }
      
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
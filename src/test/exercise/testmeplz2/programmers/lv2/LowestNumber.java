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
 * 2022-02-11         상준                  선택정렬 효율성 문제 발생 > 퀵소트로 변경
 */


public class LowestNumber {
      
      
      public static void main(String[] args) {
            solution(new int[]{1, 4, 2}, new int[]{5, 4, 4});
            System.out.println("======================================================");
            solution(new int[]{2, 1}, new int[]{3, 4});
      }
      
      
      public static int solution(int[] A, int[] B) {
            System.out.println("A = " + Arrays.toString(A));
            System.out.println("B = " + Arrays.toString(B));
            
            int answer = 0;
            
            quickSortByDescending(A, 0, A.length - 1);
            quickSortByAscending(B, 0, B.length - 1);
            
            System.out.println("A = " + Arrays.toString(A));
            System.out.println("B = " + Arrays.toString(B));
            
            for (int repeat = 0; repeat < A.length; repeat += 1) {
                  answer += A[repeat] * B[repeat];
            }
            
            System.out.println("answer = " + answer);
            
            return answer;
      }
      
      public static void quickSortByDescending(int[] data, int start, int end) {
            
            if (start >= end) {
                  return;
            }
            
            int pivot = start; //피봇 기준점 왼쪽 작은 값 오른쪽 큰값으로 나누기위함입니다.
            int startNum = start + 1;
            int endNum = end;
            int temp;
            
            System.out.println("반복전");
            
            while (startNum <= endNum) { // 엇갈릴 때 까지 반복 j가 i보다 크거나 같으면 while문 종료
                  
                  while (startNum <= end && data[startNum] >= data[pivot]) { // 피봇 값보다 큰 값을 만날 때 까지
                        startNum++;
                  }
                  
                  while (endNum > start && data[endNum] < data[pivot]) { // 피봇 값보다 작은 값을 만날 때 까지
                        endNum--;
                  }
                  
                  if (startNum > endNum) { // 현재 엇갈린 상태라면
                        temp = data[endNum];
                        data[endNum] = data[pivot];
                        data[pivot] = temp;
                  } else {
                        temp = data[startNum];
                        data[startNum] = data[endNum];
                        data[endNum] = temp;
                        
                  }
            }
            
            quickSortByDescending(data, start, endNum - 1);
            quickSortByDescending(data, endNum + 1, end);
      }
      
      public static void quickSortByAscending(int[] data, int start, int end) {
            
            if (start >= end) {
                  return;
            }
            
            int pivot = start; //피봇 기준점 왼쪽 작은 값 오른쪽 큰값으로 나누기위함입니다.
            int startNum = start + 1;
            int endNum = end;
            int temp;
            
            System.out.println("반복전");
            while (startNum <= endNum) { // 엇갈릴 때 까지 반복 j가 i보다 크거나 같으면 while문 종료
                  
                  while (startNum <= end && data[startNum] < data[pivot]) { // 피봇 값보다 큰 값을 만날 때 까지
                        startNum++;
                  }
                  
                  while (endNum > start && data[endNum] >= data[pivot]) { // 피봇 값보다 작은 값을 만날 때 까지
                        endNum--;
                  }
                  
                  if (startNum > endNum) { // 현재 엇갈린 상태라면
                        temp = data[endNum];
                        data[endNum] = data[pivot];
                        data[pivot] = temp;
                  } else {
                        temp = data[startNum];
                        data[startNum] = data[endNum];
                        data[endNum] = temp;
                        
                  }
            }
            
            quickSortByAscending(data, start, endNum - 1);
            quickSortByAscending(data, endNum + 1, end);
      }
      
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
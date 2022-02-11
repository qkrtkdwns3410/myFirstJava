package test.exercise.testmeplz2.programmers;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * packageName    : test.exercise.testmeplz2.programmers
 * fileName       : NanumNumberArr
 * author         : letscombine
 * date           : 2022-02-11
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-02-11        letscombine       최초 생성
 */


public class NanumNumberArr {
      
      public static void main(String[] args) {
            solution(new int[]{5, 9, 7, 10}, 5);
            System.out.println("======================================================");
            solution(new int[]{2, 36, 1, 3}, 1);
            System.out.println("======================================================");
            solution(new int[]{3, 2, 6}, 10);
            
      }
      
      public static ArrayList<Integer> solution(int[] arr, int divisor) {
            System.out.println("arr = " + Arrays.toString(arr));
            System.out.println("divisor = " + divisor);
      
            ArrayList<Integer> answer = new ArrayList<>();
      
            for (int arrIdx = 0; arrIdx < arr.length; arrIdx += 1) {
                  int arrNum = arr[arrIdx];
                  if (arrNum % divisor == 0) {
                        answer.add(arrNum);
                  }
            }
            quickSort(answer, 0, answer.size() - 1);
            
            if (answer.size() == 0) {
                  answer.add(-1);
                  
            }
            System.out.println("answer = " + answer);
            return answer;
      }
      public static void quickSort(ArrayList<Integer> data, int start, int end) {
            
            if (start >= end) {
                  return;
            }
            
            int pivot = start; //피봇 기준점 왼쪽 작은 값 오른쪽 큰값으로 나누기위함입니다.
            int i = start + 1;
            int j = end;
            int temp;
            
            while (i <= j) { // 엇갈릴 때 까지 반복 j가 i보다 크거나 같으면 while문 종료
                  
                  while (i <= end && data.get(i) <= data.get(pivot)) { // 피봇 값보다 큰 값을 만날 때 까지
                        i++;
                  }
                  
                  while (j > start && data.get(j) > data.get(pivot)) { // 피봇 값보다 작은 값을 만날 때 까지
                        j--;
                  }
                  
                  if (i > j) { // 현재 엇갈린 상태라면
                        temp = data.get(j);
                        data.set(j, data.get(pivot));
                        data.set(pivot, temp);
                  } else {
                        temp = data.get(i);
                        data.set(i, data.get(j));
                        data.set(j, temp);
                        
                  }
                  
            }
            
            quickSort(data, start, j - 1);
            quickSort(data, j + 1, end);
      }
      
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
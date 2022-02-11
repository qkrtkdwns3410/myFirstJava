package test.exercise.testmeplz2.programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;


/**
 * packageName    : test.exercise.testmeplz2.programmers
 * fileName       : TwoPickPlus
 * author         : letscombine
 * date           : 2022-02-09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-02-09        letscombine       최초 생성
 */


public class TwoPickPlus {
      
      public static void main(String[] args) {
      
            solution(new int[]{2, 1, 3, 4, 1});
            System.out.println("======================================================");
            solution(new int[]{5, 0, 2, 7});
            
      }
      
      public static ArrayList<Integer> solution(int[] numbers) {
      
            ArrayList<Integer> resultList = new ArrayList<>();
            
            System.out.println("numbers = " + Arrays.toString(numbers));
            System.out.println("======================================================");
      
      
            for (int outerIdx = 0; outerIdx < numbers.length-1; outerIdx++) {
                  for (int innerIdx = outerIdx+1; innerIdx < numbers.length; innerIdx++) {
                        int sum = numbers[outerIdx] + numbers[innerIdx];
            
                        if (!resultList.contains(sum)) {
                              resultList.add(numbers[outerIdx] + numbers[innerIdx]);
                        }
            
                  }
            }
            quickSort(resultList, 0, resultList.size() - 1);
            System.out.println("resultList = " + resultList);
            
            
            
            return resultList;
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

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
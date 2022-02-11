package test.exercise.testmeplz2.programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * packageName    : test.exercise.testmeplz2.programmers
 * fileName       : BudgetApplication
 * author         : letscombine
 * date           : 2022-02-09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-02-09        letscombine       최초 생성
 */


public class BudgetApplication {
      
      public static void main(String[] args) {
            
            solution(new int[]{1, 3, 2, 5, 4}, 9);
            System.out.println("======================================================");
            solution(new int[]{2, 2, 3, 3}, 10);
      }
      
      public static int solution(int[] d, int budget) {
            
            System.out.println("d = " + Arrays.toString(d));
            System.out.println("budget = " + budget);
            System.out.println("======================================================");
            ArrayList<Integer> budgetList = new ArrayList<>();
            
            int answer = 0;
            
            for (int repeatIdx = 0; repeatIdx < d.length; repeatIdx++) {
                  budgetList.add(d[repeatIdx]);
            }
            System.out.println("budgetList = " + budgetList);
            
            quickSort(budgetList, 0, budgetList.size() - 1);
            System.out.println("budgetList = " + budgetList);
            
            int sum = 0;
            int index = 0;
            
            while (sum <= budget) {
                  if (index >= budgetList.size()) {
                        System.out.println("index = " + index);
                        break;
                  }
                  sum += budgetList.get(index);
                  if (sum > budget) {
                        break;
                  }
                  System.out.println("sum = " + sum);
               
                  index += 1;
               
            }
            System.out.println("index = " + index);
            return index;
      }
      
      public static void quickSort(ArrayList<Integer> data, int start, int end) {
            
            if (start >= end) {
                  return;
            }
            
            int pivot = start; //피봇 기준점 왼쪽 작은 값 오른쪽 큰값으로 나누기위함입니다.
            int startPlus = start + 1;
            int tempEnd = end;
            int temp;
            
            while (startPlus <= tempEnd) { // 엇갈릴 때 까지 반복 j가 i보다 크거나 같으면 while문 종료
                  
                  while (startPlus <= end && data.get(startPlus) <= data.get(pivot)) { // 피봇 값보다 큰 값을 만날 때 까지
                        startPlus++;
                  }
                  
                  while (tempEnd > start && data.get(tempEnd) > data.get(pivot)) { // 피봇 값보다 작은 값을 만날 때 까지
                        tempEnd--;
                  }
                  
                  if (startPlus > tempEnd) { // 현재 엇갈린 상태라면
                        temp = data.get(tempEnd);
                        data.set(tempEnd, data.get(pivot));
                        data.set(pivot, temp);
                  } else {
                        temp = data.get(startPlus);
                        data.set(startPlus, data.get(tempEnd));
                        data.set(tempEnd, temp);
                        
                  }
                  
            }
            
            quickSort(data, start, tempEnd - 1);
            quickSort(data, tempEnd + 1, end);
      }
      
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
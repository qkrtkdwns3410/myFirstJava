package test.exercise.testmeplz2.programmers;

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
      
            for (int outerIdx = 0; outerIdx < budgetList.size() - 1; outerIdx++) {
                  for (int innerIdx = outerIdx; innerIdx < budgetList.size(); innerIdx++) {
                  
                  }
            }
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

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
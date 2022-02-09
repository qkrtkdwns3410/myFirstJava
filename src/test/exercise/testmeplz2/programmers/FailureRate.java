package test.exercise.testmeplz2.programmers;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * packageName    : test.exercise.testmeplz2.programmers
 * fileName       : FailureRate
 * author         : letscombine
 * date           : 2022-02-09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-02-09        letscombine       최초 생성
 */


public class FailureRate {
      
      public static void main(String[] args) {
            
            solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3});
            System.out.println("======================================================");
            solution(4, new int[]{4, 4, 4, 4, 4});
      }
      
      public static ArrayList<Integer> solution(int N, int[] stages) {
            
            double totalPerson = stages.length;
            ArrayList<Integer> answer = new ArrayList<>();
            ArrayList<Double> failureList = new ArrayList<>();
            
            System.out.println("N = " + N);
            System.out.println("stages = " + Arrays.toString(stages));
            
            int failCount = 0;
            
            for (int stageIv = 1; stageIv <= N; stageIv++) { // 스테이지 체크
                  failCount = 0;
                  
                  System.out.println(stageIv + "레벨");
                  
                  for (int playerIdx = 0; playerIdx < stages.length; playerIdx++) { // 플레이어마다 스테이지를 체크합니다.
                        if (stageIv == stages[playerIdx]) {
                              failCount += 1;
                              
                        }
                  }
                  
                  System.out.println("failCount = " + failCount);
                  failureList.add(failCount / totalPerson);
                  totalPerson -= failCount;
                  
                  System.out.println("totalPerson = " + totalPerson);
                  System.out.println();
            }
            System.out.println("failureList = " + failureList);
            double maxValue = 0;
            int maxIdx = 0;
            for (int idx2 = 0; idx2 < failureList.size(); idx2++) {
                  for (int idx = 0; idx < failureList.size(); idx++) {
                        if (failureList.get(idx) != -1.0 && failureList.get(idx) > maxValue) {
                              maxValue = failureList.get(idx);
                              maxIdx = idx;
                              
                              
                        }
                        
                  }
                  System.out.println("maxValue = " + maxValue); //0.5
                  System.out.println("maxIdx = " + maxIdx); // 2
      
                  failureList.set(maxIdx, -1.0);
                  while (answer.contains(maxIdx+1)) {
                        
                        maxIdx += 1;
                  }
                  answer.add(maxIdx + 1);
                  
                  System.out.println("failureList = " + failureList);
      
                  maxValue = 0;
                  maxIdx = 0;
            }
            
            System.out.println("answer = " + answer);
            //answer  = 스테이지 도달하지 못한 유저 / 사용자수
            return answer;
      }
      
      
      public static void quickSort(ArrayList<Double> data, int start, int end) {
            
            if (start >= end) {
                  return;
            }
            
            int pivot = start; //피봇 기준점 왼쪽 작은 값 오른쪽 큰값으로 나누기위함입니다.
            int i = start + 1;
            int j = end;
            double temp;
            
            while (i <= j) { // 엇갈릴 때 까지 반복 j가 i보다 크거나 같으면 while문 종료
                  
                  while (i <= end && data.get(i) > data.get(pivot)) { // 피봇 값보다 큰 값을 만날 때 까지
                        i++;
                  }
                  
                  while (j > start && data.get(j) <= data.get(pivot)) { // 피봇 값보다 작은 값을 만날 때 까지
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

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
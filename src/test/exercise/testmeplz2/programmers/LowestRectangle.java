package test.exercise.testmeplz2.programmers;

import com.sun.org.apache.xml.internal.serializer.ElemDesc;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * packageName    : test.exercise.testmeplz2.programmers
 * fileName       : LowestRectangle
 * author         : letscombine
 * date           : 2022-02-09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-02-09        letscombine       최초 생성
 */


public class LowestRectangle {
      
      public static void main(String[] args) {
            
            solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}});
            System.out.println("======================================================");
            solution(new int[][]{{1,1000}, {1000,1}, {1000,1000}, {1000,999}, {1,1}});
            System.out.println("======================================================");
            solution(new int[][]{{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}});
            
      }
      
      public static int solution(int[][] sizes) {
            
            System.out.println("sizes = " + Arrays.deepToString(sizes));
            int[] sizeArr = new int[sizes.length * 2];
            
            ArrayList<Integer> bigList = new ArrayList<>();
            ArrayList<Integer> smallList = new ArrayList<>();
            
            int answer = 0;
            int sizesNum = 0;
            for (int sizeIdx = 0; sizeIdx < sizes.length; sizeIdx+=1) {
                  int[] compareArr = new int[2];
                  
                  for (int secondNum = 0; secondNum < 2; secondNum += 1) {
                        compareArr[secondNum] = sizes[sizeIdx][secondNum];
                  }
                  
                  System.out.println("compareArr = " + Arrays.toString(compareArr));
                  
                  if (compareArr[0] >= compareArr[1]) {
                        bigList.add(compareArr[0]);
                        smallList.add(compareArr[1]);
                        
                  } else {
                        bigList.add(compareArr[1]);
                        smallList.add(compareArr[0]);
                  }
                  
      
                  System.out.println("bigList = " + bigList);
                  System.out.println("smallList = " + smallList);
                  
                  
                  
            }
            int maxBig = 0;
            int maxSmall = 0;
            for (int idx = 0; idx < bigList.size(); idx++) {
                  if (bigList.get(idx) > maxBig) {
                        maxBig = bigList.get(idx);
                  }
                  if (smallList.get(idx) > maxSmall) {
                        maxSmall = smallList.get(idx);
                  }
            }
            int width = maxBig * maxSmall;
            System.out.println("width = " + width);
         
            return width;
      }
      
      public static void quickSortByDescending(int[] data, int start, int end) {
            
            if (start >= end) {
                  return;
            }
            
            int pivot = start; //피봇 기준점 왼쪽 작은 값 오른쪽 큰값으로 나누기위함입니다.
            int i = start + 1;
            int j = end;
            int temp;
            System.out.println("반복전");
            while (i <= j) { // 엇갈릴 때 까지 반복 j가 i보다 크거나 같으면 while문 종료
                  
                  while (i <= end && data[i] >= data[pivot]) { // 피봇 값보다 큰 값을 만날 때 까지
                        i++;
                  }
                  
                  while (j > start && data[j] < data[pivot]) { // 피봇 값보다 작은 값을 만날 때 까지
                        j--;
                  }
                  
                  if (i > j) { // 현재 엇갈린 상태라면
                        temp = data[j];
                        data[j] = data[pivot];
                        data[pivot] = temp;
                  } else {
                        temp = data[i];
                        data[i] = data[j];
                        data[j] = temp;
                   
                  }
            }
            
            quickSortByDescending(data, start, j - 1);
            quickSortByDescending(data, j + 1, end);
      }
      
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
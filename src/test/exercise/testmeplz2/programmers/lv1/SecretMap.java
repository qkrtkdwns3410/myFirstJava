package test.exercise.testmeplz2.programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * packageName    : test.exercise.testmeplz2.programmers
 * fileName       : SecretMap
 * author         : letscombine
 * date           : 2022-02-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-02-10        letscombine       최초 생성
 */


public class SecretMap {
      
      public static void main(String[] args) {
//            solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28});
//            System.out.println("======================================================");
            solution(6, new int[]{46, 33, 33, 22, 31, 50}, new int[]{27, 56, 19, 14, 14, 10});
      }
      
      public static ArrayList<StringBuilder> solution(int n, int[] arr1, int[] arr2) {
            
            System.out.println("n = " + n);
            System.out.println("arr1 = " + Arrays.toString(arr1));
            System.out.println("arr2 = " + Arrays.toString(arr2));
            System.out.println("======================================================");
            
            ArrayList<String> answer = new ArrayList<>();
            ArrayList<StringBuilder> resultMapList = new ArrayList<>();
            int num1 = 0;
      
            ArrayList<Integer> twoArrConcatList = new ArrayList<>();
            for (int repeat = 0; repeat < arr1.length; repeat++) {
                  twoArrConcatList.add(arr1[repeat] | arr2[repeat]);
            }
            System.out.println("twoArrConcatList = " + twoArrConcatList);
            
            ArrayList<Integer> anotherList = new ArrayList<>();
      
            for (int repeat = 0; repeat < n; repeat += 1) {
                  resultMapList.add(twoMapListChanger(twoArrConcatList.get(repeat), n));
            
            }
      
            
            return resultMapList;
      }
      
      public static StringBuilder twoMapListChanger(int num, int n) {
      
            ArrayList<Integer> remainderList = new ArrayList<>();
            
//            System.out.println();
//            System.out.println("5num = " + num);
            
            int remainder;
            
            while (num / 2 > 0) {
                  remainder = num % 2;
                  remainderList.add(remainder); //나머지를 순차적으로 담습니다
                  
                  num /= 2;
//                  System.out.println("num = " + num);
            }
            
            if (num < 2) {
                  remainder = num % 2;
                  remainderList.add(remainder);
            }
            
            while (remainderList.size() < n) {
                  remainderList.add(0);
            }
      
//            System.out.println("remainderList = " + remainderList);
      
            StringBuilder forConcatStr = new StringBuilder();
            
            for (int reserverIdx = remainderList.size() - 1; reserverIdx >= 0; reserverIdx -= 1) {
                  if (remainderList.get(reserverIdx) == 1) {
                        forConcatStr.append("#");
                  } else {
                        forConcatStr.append(" ");
                  }
            }
            System.out.println("forConcatStr = " + forConcatStr);
            
            
            return forConcatStr;
      }
   
      
     
      
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
package test.exercise.testmeplz2.programmers.lv2;

import java.util.ArrayList;


/**
 * packageName    : test.exercise.testmeplz2.programmers.lv2
 * fileName       : FiboRecursive
 * author         : letscombine
 * date           : 2022-02-11
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-02-11        letscombine       최초 생성
 */


public class FiboRecursive {
      
      public static void main(String[] args) {
            solution(3);
            System.out.println("======================================================");
            solution(2);
            System.out.println("======================================================");
            solution(100000);
            System.out.println("======================================================");
            solution(5);
            System.out.println("======================================================");
            
      }
      
      public static int solution(int n) {
            System.out.println("n = " + n);
            ArrayList<Integer> fiboList = new ArrayList<>();
            
            int answer = 0;
      
            fiboList.add(0);
            fiboList.add(1);
            fiboList.add(1);
      
            if (n < 3) {
                  System.out.println("fiboList = " + fiboList.get(n));
                  return fiboList.get(n);
            }
            
            for (int count = 3; count <= n; count += 1) {
                  fiboList.add(fibo(count, fiboList));
                  answer = fiboList.get(count);
            }
            System.out.println("answer = " + answer);
            return answer;
      }
      
      public static int fibo(int fiboNum, ArrayList<Integer> fiboList) {
            int answer = fiboList.get(fiboNum - 1) + fiboList.get(fiboNum - 2);
            answer = answer % 1234567;
            return answer;
            
      }
      
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
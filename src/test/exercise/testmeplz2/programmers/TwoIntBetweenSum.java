package test.exercise.testmeplz2.programmers;

import sun.java2d.pipe.SolidTextRenderer;


/**
 * packageName    : test.exercise.testmeplz2.programmers
 * fileName       : TwoIntBetweenSum
 * author         : letscombine
 * date           : 2022-02-11
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-02-11        letscombine       최초 생성
 */


public class TwoIntBetweenSum {
      
      public static void main(String[] args) {
            
            solution(3, 5);
            System.out.println("======================================================");
            solution(3, 3);
            System.out.println("======================================================");
            solution(5, 3);
            System.out.println("======================================================");
            solution(-10000000,10000000);
      }
      
      public static long solution(int a, int b) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
      
            
            if (a > b) {
                  int temp = a;
                  a = b;
                  b = temp;
            }
            
            long sum = 0;
            
            for (int startNum = a; startNum <= b; startNum += 1) {
                  sum += startNum;
            }
            System.out.println("sum = " + sum);
            
            return sum;
      }
      
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
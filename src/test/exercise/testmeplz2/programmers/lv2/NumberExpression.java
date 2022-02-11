package test.exercise.testmeplz2.programmers.lv2;

/**
 * packageName    : test.exercise.testmeplz2.programmers.lv2
 * fileName       : NumberExpression
 * author         : letscombine
 * date           : 2022-02-11
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-02-11        letscombine       최초 생성
 */


public class NumberExpression {
      
      public static void main(String[] args) {
            solution(15);
      }
      
      //주어진 자연수를 연속된 자연수의 합으로 표현하는 방법의 수는 주어진 수의 홀수 약수의 개수와 같다 ( 정수론 정리 )
      public static int solution(int n) {
            System.out.println("n = " + n);
      
            int count = 0;
            for (int num = 1; num <= n; num += 1) {
                  if (n % num == 0) {
                        if (num % 2 != 0) {
                              count += 1;
                        }
                  }
            }
            
            return count;
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
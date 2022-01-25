package test.doit;

/**
 * packageName    : test.doit
 * fileName       : Calc
 * author         : letscombine
 * date           : 2022-01-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-18        letscombine       최초 생성
 */


public interface Calc {
      double PI = 3.14;
      int ERROR = -999999999;

      static int total(int[] arr) {
            int total = 0;
            for (int i : arr) {
                  total += i;
            }
            return total;
      }

      int add(int num, int num2);

      int substract(int num1, int num2);

      int times(int num1, int num2);

      int divide(int num1, int num2);

      default void description() {
            System.out.println("정수 계산기 구현");
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
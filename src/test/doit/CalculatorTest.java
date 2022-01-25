package test.doit;

/**
 * packageName    : test.doit
 * fileName       : CalculatorTest
 * author         : letscombine
 * date           : 2022-01-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-18        letscombine       최초 생성
 */


public class CalculatorTest {
      public static void main(String[] args) {
            int num1 = 10;
            int num2 = 5;
            CompleteCalc calc = new CompleteCalc();

            System.out.println(calc.add(num1, num2));
            System.out.println(calc.substract(num1, num2));
            System.out.println(calc.substract(num1, num2));

            calc.showInfo();
            calc.description();
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(Calc.total(arr));

      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
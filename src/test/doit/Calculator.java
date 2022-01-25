package test.doit;

/**
 * packageName    : test.doit
 * fileName       : Calculator
 * author         : letscombine
 * date           : 2022-01-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-18        letscombine       최초 생성
 */


public abstract class Calculator implements Calc {
      @Override
      public int add(int num, int num2) {
            return num+num2;
      }

      @Override
      public int substract(int num1, int num2) {
            return num1-num2;
      }
      //추상메서드 times 및 divied를 구현 X >> Calculator는 추상 클래스입니다.
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
package test.exercise;

/**
 * packageName    : test.exercise
 * fileName       : Calc
 * author         : letscombine
 * date           : 2022-01-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-20        letscombine       최초 생성
 */


@FunctionalInterface
public interface Calc {
      public int add(int num1, int num2);
}

class Start {
      public static void main(String[] args) {
            Calc sum = (x, y) -> x + y; // 구현부
            System.out.println(sum.add(20, 30));
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
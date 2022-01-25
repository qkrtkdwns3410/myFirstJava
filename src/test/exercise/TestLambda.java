package test.exercise;

/**
 * packageName    : test.exercise
 * fileName       : TestLambda
 * author         : letscombine
 * date           : 2022-01-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-20        letscombine       최초 생성
 */


public class TestLambda {
      public static void main(String[] args) {
            PrintString reStr = returnString(); // 변수로 반환받기 (구현부)..?
            reStr.showString("hello "); //메서드 호출 s = "hello "

      }

      private static void returnString(PrintString p) {
            p.showString("hello lambda_2");
      }

      private static PrintString returnString() {
            return s -> System.out.println(s + "world");
      }

}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
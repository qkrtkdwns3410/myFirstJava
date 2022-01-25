package test.exercise;

/**
 * packageName    : test.exercise
 * fileName       : TestStringConcat
 * author         : letscombine
 * date           : 2022-01-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-20        letscombine       최초 생성
 */


public class TestStringConcat {
      public static void main(String[] args) {
            String s1 = "Hello";
            String s2 = "World";
            StringConcat concat2 = (s, v) -> System.out.println(s + " " + v);
            concat2.makeString(s1, s2);


            int i = 100;
            StringConcat concat3 = (s, v) -> {
                  // i =200 람다식 내부에서는 변경이 불가능합니다
                  System.out.println("i = " + i);
                  System.out.println("s = " + s + "v =" + v);
            };

            PrintString lambdaStr = s -> System.out.println(s);  //인터페이스형 변수에 람다식 대입
            lambdaStr.showString("hello lambda_1");
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
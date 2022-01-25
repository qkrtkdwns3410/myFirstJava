package test.exercise;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.function.BinaryOperator;


/**
 * packageName    : test.exercise
 * fileName       : ReduceTest
 * author         : letscombine
 * date           : 2022-01-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-20        letscombine       최초 생성
 */


public class ReduceTest {
      public static void main(String[] args) {
            String[] greetings = {"안녕하세요", "hello", "Good morning", "반갑습니다"};
            System.out.println(Arrays.stream(greetings)
                                       .reduce("", (s1, s2) -> {
                                             if (s1.getBytes().length >= s2.getBytes().length) {
                                                   return s1;
                                             } else {
                                                   return s2;
                                             }
                                       }));

            String str = Arrays.stream(greetings)
                    .reduce(new CompareString())
                    .get(); // BinaryOperator를 구현한 클래스 사용
            System.out.println("str = " + str);
      }
}

class CompareString implements BinaryOperator<String> {
      @Override
      public String apply(String s1, String s2) {

            if (s1.getBytes().length >= s2.getBytes().length) {
                  return s1;
            } else {
                  return s2;
            }
      } //reduce() 메서드가 호출될 때 불리는 메서드 ,두 문자열의 길이를 비교합니다

} // BinaryOperator 구현한 클래스 정의

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
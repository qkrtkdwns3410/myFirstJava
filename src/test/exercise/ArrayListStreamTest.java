package test.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


/**
 * packageName    : test.exercise
 * fileName       : ArrayListStreamTest
 * author         : letscombine
 * date           : 2022-01-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-20        letscombine       최초 생성
 */


public class ArrayListStreamTest {
      public static void main(String[] args) {
            List<String> sList = new ArrayList<>();
            sList.add("TOMAS");
            sList.add("EDWARD");
            sList.add("TMDD");

            Stream<String> stream = sList.stream(); //스트림의 생성
            stream.forEach(s -> System.out.print(s + " ")); //배열의 요소를 하나씩 출력
            System.out.println("========================");

            sList.stream()
                    .sorted()
                    .forEach(s -> System.out.println(s));

      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
package test.collection;

import javax.lang.model.element.NestingKind;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


/**
 * packageName    : test.collection
 * fileName       : ComparatorTest
 * author         : letscombine
 * date           : 2022-01-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-20        letscombine       최초 생성
 */


public class ComparatorTest {
      public static void main(String[] args) {
            Set<String> set = new TreeSet<>(new MyCompare());
            //TreeSet 생성자의 매개변수로 정렬 방식을 지정
            //생성시 생성자에 매개변수 없다면 원래 String 클래스에 정의된 Comparable 인터페이스의 compareTo() 메서드 구현 내용대로 오름차순으로 정렬됩니다

            set.add("aaa");
            set.add("bbb");
            set.add("ccc");

            System.out.println("set = " + set);
      }
}

class MyCompare implements Comparator<String> {
      @Override
      public int compare(String o1, String o2) {
            return (o1.compareTo(o2)) * -1; //내림차순(String)
      }
}


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
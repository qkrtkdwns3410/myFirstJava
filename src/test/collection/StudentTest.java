package test.collection;


import java.util.HashSet;


/**
 * packageName    : test.collection
 * fileName       : StudentTest
 * author         : letscombine
 * date           : 2022-01-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-20        letscombine       최초 생성
 */


public class StudentTest {
      public static void main(String[] args) {
            HashSet<Student> set = new HashSet<>();

            set.add(new Student("100", "홍길동"));
            set.add(new Student("200", "123"));
            set.add(new Student("300", "1234"));
            set.add(new Student("400", "123123"));
            set.add(new Student("100", "홍길동 중복"));

            System.out.println("set = " + set);
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
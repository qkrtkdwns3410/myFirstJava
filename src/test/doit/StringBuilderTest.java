package test.doit;

import javax.xml.transform.SourceLocator;


/**
 * packageName    : test.doit
 * fileName       : StringBuilderTest
 * author         : letscombine
 * date           : 2022-01-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-19        letscombine       최초 생성
 */


public class StringBuilderTest {
      public static void main(String[] args) {
            String javaStr = new String("java");
            System.out.println("javaStr 문자열의 주소 : " + System.identityHashCode(javaStr));

            StringBuilder builder = new StringBuilder(javaStr); //String으로 부터 StringBuilder 생성
            System.out.println("연산 전  buffer 메모리의 주소 : " + System.identityHashCode(builder));

            builder.append(" and");
            builder.append(" android");
            builder.append(" programming is fun!!!");
            System.out.println("연산 후 buffer 메모리의 주소 : " + System.identityHashCode(builder));

            javaStr = builder.toString();
            System.out.println("javaStr = " + javaStr);
            System.out.println("새로 만들어진 javaStr 문자열 주소 : " + System.identityHashCode(javaStr));


      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
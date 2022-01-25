package test.doit;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


/**
 * packageName    : test.doit
 * fileName       : StringClassTest
 * author         : letscombine
 * date           : 2022-01-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-19        letscombine       최초 생성
 */


public class StringClassTest {
      public static void main(String[] args) throws ClassNotFoundException {
            Class strClass = Class.forName("java.lang.String"); //클래스 이름으로 가져오기

            Constructor[] cons = strClass.getConstructors(); // 모든 생성자 가져오기
            for (Constructor con : cons) {
                  System.out.println("con = " + con);

            }
            System.out.println();
            Field[] fields = strClass.getFields(); // 모든 멤버 변수 (필드) 가져오기
            for (Field field : fields) {
                  System.out.println("field = " + field);
            }
            System.out.println();

            Method[] methods = strClass.getMethods(); // 모든 메서드 가져오기
            for (Method method : methods) {
                  System.out.println("method = " + method);
            }
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
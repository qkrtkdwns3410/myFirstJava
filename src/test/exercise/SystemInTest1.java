package test.exercise;

import java.io.IOError;
import java.io.IOException;


/**
 * packageName    : test.exercise
 * fileName       : SystemInTest1
 * author         : letscombine
 * date           : 2022-01-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-21        letscombine       최초 생성
 */


public class SystemInTest1 {
      public static void main(String[] args) throws IOException {
            System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");

            int i;
            try {
                  i = System.in.read(); //read() 메서드로 한 바이트 읽습니다
                  System.out.println("i = " + i);
                  System.out.println("i = " + (char)i); //문자로 변환하여 출력합니다
            } catch (Exception e) {
                  e.printStackTrace();
            }
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
package test.exercise;

import java.net.SocketOption;


/**
 * packageName    : test.exercise
 * fileName       : SystemInTest2
 * author         : letscombine
 * date           : 2022-01-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-21        letscombine       최초 생성
 */


public class SystemInTest2 {
      public static void main(String[] args) {
            System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요");
            int i;
            try {
                  while ((i = System.in.read()) != '\n') {
                        System.out.print((char) i);
                  }
            } catch (Exception e) {
                  e.printStackTrace();

            }
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
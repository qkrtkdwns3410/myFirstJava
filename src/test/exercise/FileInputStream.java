package test.exercise;

import java.io.FileNotFoundException;
import java.io.IOException;


/**
 * packageName    : test.exercise
 * fileName       : FileInputStream
 * author         : letscombine
 * date           : 2022-01-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-21        letscombine       최초 생성
 */


public class FileInputStream {
      public static void main(String[] args) {
            try (java.io.FileInputStream fis = new java.io.FileInputStream("input.txt")) {
                  int i;
                  while ((i = fis.read()) != -1) {
                        //i 값이 -1 이 아닌 동안 read () 메서드로 한 바이트를 반복해서 읽습니다)
                        System.out.println("i = " + (char)i);
                  }
            } catch (IOException e) {
                  e.printStackTrace();
            }
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
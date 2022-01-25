package test.exercise;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;


/**
 * packageName    : test.exercise
 * fileName       : FileInputStreamTest1
 * author         : letscombine
 * date           : 2022-01-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-21        letscombine       최초 생성
 */


public class FileInputStreamTest1 {
      public static void main(String[] args) {
            FileInputStream fis = null;

            try {
                  fis = new FileInputStream("input.txt");
                  System.out.println((char) fis.read());
                  System.out.println((char) fis.read());
                  System.out.println((char) fis.read());

            } catch (Exception e) {
                  e.printStackTrace();
            } finally {
                  try {
                        Objects.requireNonNull(fis)
                                .close();
                  } catch (IOException e) {
                        e.printStackTrace();
                  }
            }
            System.out.println("end");

      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
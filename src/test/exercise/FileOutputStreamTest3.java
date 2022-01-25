package test.exercise;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 * packageName    : test.exercise
 * fileName       : FileOutputStreamTest3
 * author         : letscombine
 * date           : 2022-01-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-21        letscombine       최초 생성
 */


public class FileOutputStreamTest3 {
      public static void main(String[] args) {
            try (FileOutputStream fos = new FileOutputStream("output3.txt")) {
                  byte[] bs = new byte[26];
                  byte data = 65;
                  for (int i = 0; i < bs.length; i++) {
                        bs[i] = data;
                        data++;
                  }
                  fos.write(bs, 2, 10);
            } catch (IOException e) {
                  e.printStackTrace();
            }
            System.out.println("end");
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
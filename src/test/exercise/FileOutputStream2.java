package test.exercise;

import java.io.FileOutputStream;
import java.io.IOException;


/**
 * packageName    : test.exercise
 * fileName       : FileOutputStream2
 * author         : letscombine
 * date           : 2022-01-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-21        letscombine       최초 생성
 */


public class FileOutputStream2 {
      public static void main(String[] args) throws IOException {
            try (FileOutputStream fos = new FileOutputStream("output2.txt", true)) {

                  byte[] bs = new byte[26];
                  byte data = 65; //'A'의 아스키 값
                  for (int i = 0; i < bs.length; i++) {
                        bs[i] = data;
                        data++;
                  }
                  fos.write(bs);
            } catch (IOException e) {
                  e.printStackTrace();
            }
            System.out.println("출력이 완료되었습니다");

      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
package test.exercise;

import java.io.FileOutputStream;


/**
 * packageName    : test.exercise
 * fileName       : FileOutputStreamTest1
 * author         : letscombine
 * date           : 2022-01-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-21        letscombine       최초 생성
 */


public class FileOutputStreamTest1 {
      public static void main(String[] args) {
            try (FileOutputStream fos = new FileOutputStream("output.txt",true)) {
                  fos.write(65);
                  fos.write(66);
                  fos.write(67);

            } catch (Exception e) {
                  e.printStackTrace();
            } finally {
                  try {

                  } catch (NullPointerException e) {
                        e.printStackTrace();
                  }
            }
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
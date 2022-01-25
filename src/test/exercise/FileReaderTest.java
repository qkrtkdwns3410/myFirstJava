package test.exercise;

import java.io.FileReader;


/**
 * packageName    : test.exercise
 * fileName       : FileReaderTest
 * author         : letscombine
 * date           : 2022-01-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-21        letscombine       최초 생성
 */


public class FileReaderTest {
      public static void main(String[] args) {
            try (FileReader fr = new FileReader("reader.txt")) {
                  int i;
                  while ((i = fr.read()) != -1) {
                        System.out.print((char) i);
                  }
            } catch (Exception e) {
                  e.printStackTrace();
            }
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
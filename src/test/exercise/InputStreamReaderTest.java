package test.exercise;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.SocketOption;


/**
 * packageName    : test.exercise
 * fileName       : InputStreamReaderTest
 * author         : letscombine
 * date           : 2022-01-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-21        letscombine       최초 생성
 */


public class InputStreamReaderTest {
      public static void main(String[] args) {
            try (InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))) {
                  int i;
                  while ((i = isr.read()) != -1) {
                        System.out.print((char) i);
                  }
            } catch (IOException e) {
                  e.printStackTrace();
            }
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
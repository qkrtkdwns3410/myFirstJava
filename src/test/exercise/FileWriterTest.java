package test.exercise;

import java.io.FileWriter;


/**
 * packageName    : test.exercise
 * fileName       : FileWriterTest
 * author         : letscombine
 * date           : 2022-01-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-21        letscombine       최초 생성
 */


public class FileWriterTest {
      public static void main(String[] args) {
            try (FileWriter fw = new FileWriter("writer.txt")){
                  fw.write('A');
                  char buf[] = {'B', 'C', 'D', 'E', 'F', 'G'};

                  fw.write(buf);
                  fw.write("써지냐?");
                  fw.write(buf,1,2);
                  fw.write("65");
            } catch (Exception e) {
                  e.printStackTrace();
            }
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
package test.exercise;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;


/**
 * packageName    : test.exercise
 * fileName       : Exercise
 * author         : letscombine
 * date           : 2022-01-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-21        letscombine       최초 생성
 */


public class Exercise {
      public static void main(String[] args) {
            try (OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("a.txt"));
            ) {
                  osw.write("지금까지 자바 정말 재미있게 공부했어요^^");

            } catch (Exception e) {
                  e.printStackTrace();

            }finally {

            }

      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
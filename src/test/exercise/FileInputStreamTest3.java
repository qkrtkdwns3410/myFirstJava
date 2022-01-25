package test.exercise;

import java.io.FileInputStream;


/**
 * packageName    : test.exercise
 * fileName       : FileInputStreamTest3
 * author         : letscombine
 * date           : 2022-01-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-21        letscombine       최초 생성
 */


public class FileInputStreamTest3 {
      public static void main(String[] args) {
            try (FileInputStream fis = new FileInputStream("input.txt")){
                  byte[] bs = new byte[10];
                  int i;
                  while ((i = fis.read(bs)) != -1) {
                        for (byte b : bs) {
                              System.out.println("b = " + (char) b);
                        }
                        System.out.println("i = " + i);
                        System.out.println("========================");
                  }
            } catch (Exception e) {
                  e.printStackTrace();
            }
            System.out.println("end");

      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
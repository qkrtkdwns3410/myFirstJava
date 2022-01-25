package test.exercise;

import java.io.*;
import java.io.FileInputStream;


/**
 * packageName    : test.exercise
 * fileName       : DataStreamTest
 * author         : letscombine
 * date           : 2022-01-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-21        letscombine       최초 생성
 */


public class DataStreamTest {
      public static void main(String[] args) {
            try (FileOutputStream fos = new FileOutputStream("data.txt");
                 DataOutputStream dos = new DataOutputStream(fos)) {

                  dos.writeByte(100);
                  dos.writeChar('A');
                  dos.writeInt(10);

                  dos.writeFloat(3.14f);
                  dos.writeUTF("Test");

            } catch (IOException e) {
                  e.printStackTrace();
            }
            try (FileInputStream fis = new FileInputStream("data.txt");
                 DataInputStream dis = new DataInputStream(fis)) {

                  System.out.println(dis.readByte());
                  System.out.println(dis.readChar());
                  System.out.println(dis.readInt());
                  System.out.println(dis.readFloat());
                  System.out.println(dis.readUTF());
            } catch (IOException e) {
                  e.printStackTrace();
            }
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
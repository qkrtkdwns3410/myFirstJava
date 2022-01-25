package test.exercise;

import java.io.IOException;
import java.io.RandomAccessFile;


/**
 * packageName    : test.exercise
 * fileName       : RandomAccessFileTest
 * author         : letscombine
 * date           : 2022-01-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-21        letscombine       최초 생성
 */


public class RandomAccessFileTest {
      public static void main(String[] args)  throws IOException {
            RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
            rf.writeInt(100);
            System.out.println("rf.getFilePointer() = " + rf.getFilePointer());
            rf.writeDouble(3.14);
            System.out.println("rf.getFilePointer() = " + rf.getFilePointer());
            rf.writeUTF("안녕하세요");

            System.out.println("rf.getFilePointer() = " + rf.getFilePointer());
            rf.seek(0);

            int i = rf.readInt();
            double d = rf.readDouble();
            String str = rf.readUTF();

            System.out.println("파일 포인터 위치:" + rf.getFilePointer());
            System.out.println("i = " + i);
            System.out.println("d = " + d);
            System.out.println("str = " + str);
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
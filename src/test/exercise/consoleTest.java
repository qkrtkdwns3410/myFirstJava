package test.exercise;

import javax.print.attribute.standard.JobSheets;
import java.io.Console;
import java.security.CodeSource;
import java.util.Arrays;
import java.util.Collections;


/**
 * packageName    : test.exercise
 * fileName       : consoleTest
 * author         : letscombine
 * date           : 2022-01-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-21        letscombine       최초 생성
 */


public class consoleTest {
      public static void main(String[] args) {
            Console console = System.console();

            System.out.println("이름 : ");
            String name = console.readLine();
            System.out.println("직업 : ");
            String job = console.readLine();
            System.out.println("비밀번호 : ");
            char[] pass = console.readPassword();
            String strPass = new String(pass);

            System.out.println("strPass = " + strPass);
            System.out.println("pass = " + Arrays.toString(pass));

            System.out.println("job = " + job);
            System.out.println("name = " + name);
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
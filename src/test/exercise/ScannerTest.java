package test.exercise;

import java.util.Scanner;


/**
 * packageName    : test.exercise
 * fileName       : ScannerTest
 * author         : letscombine
 * date           : 2022-01-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-21        letscombine       최초 생성
 */


public class ScannerTest {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("이름 : ");
            String name = sc.nextLine();
            System.out.println("직업 : ");
            String job = sc.nextLine();

            System.out.println("사번 : ");
            int num = sc.nextInt();

            System.out.println("name = " + name);
            System.out.println("num = " + num);
            System.out.println("job = " + job);
      }


}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
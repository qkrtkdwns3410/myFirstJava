package test.exercise.testmeplz2.FebEx;

import java.util.Scanner;


/**
 * packageName    : test.exercise.testmeplz2.FebEx
 * fileName       : MagicSquare
 * author         : letscombine
 * date           : 2022-02-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-02-03        letscombine       최초 생성
 */


public class MagicSquare {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            try {
                  System.out.print("차수를 입력해주세요");
                  int chaSrt = Integer.parseInt(sc.nextLine()); //차수를 입력받습니다
            } catch (NumberFormatException e) {
                  System.out.println("정수만 입력해주세요");
            }
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
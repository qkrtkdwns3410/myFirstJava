package test.exercise.testmeplz2;

import java.util.Scanner;


/**
 * packageName    : test.exercise.testmeplz2
 * fileName       : Util
 * author         : letscombine
 * date           : 2022-01-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-24        letscombine       최초 생성
 */


public class Util {
      public static Scanner sc = new Scanner(System.in);

      public static void clearConsole() {
            try {
                  final String os = System.getProperty("os.name");

                  if (os.contains("Windows")) {
                        Runtime.getRuntime().exec("cls");
                  } else {
                        Runtime.getRuntime().exec("clear");
                  }
            } catch (final Exception e) {
                  //  Handle any exceptions.
            }
      }
      public boolean checkBackSlash(String checkBack) {
            if (checkBack.equals("\\")) {
                  System.out.println("메인으로 이동");
                  return true;
            }
            return false;
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
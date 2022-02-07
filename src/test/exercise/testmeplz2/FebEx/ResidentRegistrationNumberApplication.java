package test.exercise.testmeplz2.FebEx;

import test.exercise.testmeplz2.Util;

import java.util.Scanner;


/**
 * packageName    : test.exercise.testmeplz2.FebEx
 * fileName       : ResidentRegistrationNumber
 * author         : letscombine
 * date           : 2022-02-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-02-03        letscombine       최초 생성
 */


public class ResidentRegistrationNumberApplication {
      public static void main(String[] args) {
            MainLogic mainLogic = new MainLogic();
            mainLogic.checkRegisterNumberMethod();
      }


}

class MainLogic {
      public void checkRegisterNumberMethod() {
            Util util = new Util();
            Scanner sc = new Scanner(System.in);
            String registerExp = "^(?:[0-9]{2}(?:0[1-9]|1[0-2])(?:0[1-9]|[1,2][0-9]|3[0,1]))-[1-4][0-9]{6}$";
            int[] multiplyNumber = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
            String registerNumber;

            checkRegister(sc, registerExp, multiplyNumber);
      }

      private void checkRegister(Scanner sc, String registerExp, int[] multiplyNumber) {
            String registerNumber;
            while (true) {
                  try {
                        System.out.println("======================================================");
                        System.out.print("\t\t\t\t주민등록번호 검증\n");
                        System.out.println("======================================================");
                        System.out.println();
                        System.out.println("백슬래쉬 입력시 프로그램이 종료됩니다.");
                        System.out.println();
                        System.out.print("(형식 -> 951103-1234567) \n");
                        System.out.print("주민등록번호를 입력해주세요 : ");

                        registerNumber = sc.nextLine();
                        checkBackSlashForString(registerNumber);
                        if (!registerNumber.matches(registerExp)) {
                              //맞는 정규식인 경우
                              System.out.println("\n\n\t\t올바르지 않은 형식입니다\n\n");
                              System.out.println();
                        } else if (registerNumber.equals("\\")) {
                              System.out.println("\t\t프로그램이 종료됩니다.");
                              System.out.println();
                              break;
                        } else {
                              String[] registerNumberStrArr = registerNumber.split("");

                              int sumOfRegisterNumber = 0;
                              int count = 0;
                              for (int registerNumberOne = 0; registerNumberOne < registerNumberStrArr.length; registerNumberOne++) {
                                    String registerNumberOneStr = registerNumberStrArr[registerNumberOne];

                                    if (registerNumberOne == registerNumberStrArr.length - 1) {

                                          sumOfRegisterNumber += Integer.parseInt(registerNumberOneStr);
                                          break;
                                    }

                                    if (!registerNumberOneStr.equals("-")) {

                                          sumOfRegisterNumber += Integer.parseInt(registerNumberOneStr) * multiplyNumber[count];
                                          count++;
                                    }
                              }
                              if (sumOfRegisterNumber % 11 != 0) {
                                    System.out.println("\n\n\t\t올바르지 않은 주민번호입니다!\n\n");
                                    System.out.println();
                              } else {
                                    System.out.println("\n\n\t\t올바른 주민번호입니다!\n\n");
                                    System.out.println();
                              }

                        }
                  } catch (Exception e) {
                        e.printStackTrace();
                  }
            }
      }

      private void checkBackSlashForString(String modifiedSubjectName) {
            if (modifiedSubjectName.equals("\\")) {
                  System.out.println("\t\t\n\n종료\n\n");
                  System.exit(0); ;

            }
      }
}


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
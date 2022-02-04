package test.exercise.testmeplz2.FebEx;

import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;


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


public class ResidentRegistrationNumber {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String registerExp = "\n" + "^(?:[0-9]{2}(?:0[1-9]|1[0-2])(?:0[1-9]|[1,2][0-9]|3[0,1]))-[1-4][0-9]{6}$";
            String registerNumber;

            while (true) {
                  try {
                        System.out.println("======================================================");
                        System.out.print("\t\t\t주민등록번호 검증\n");
                        System.out.println("======================================================");
                        System.out.println();
                        System.out.print("주민등록번호를 입력해주세요 :  (형식 -> 951103-1234567) ");

                        registerNumber = sc.nextLine();

                        if (checkBackSlash) {

                        }

                        if (registerNumber.matches(registerExp)) {
                              //맞는 정규식인 경우
                              System.out.println("올바른 주민등록번호 형식입니다");
                              break;
                        } else {
                              System.out.println("올바르지 않은 주민등록번호 형식입니다");
                        }
                  } catch (Exception e) {
                        System.out.println(e.getMessage());
                  }
            }

            //주민등록번호를 Int형으로 변환
            int registerNumberToInt = Integer.parseInt(registerNumber);




      }

}


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
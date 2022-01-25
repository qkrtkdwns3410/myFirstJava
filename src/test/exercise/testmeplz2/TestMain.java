package test.exercise.testmeplz2;

import java.util.Scanner;

import static test.exercise.testmeplz2.Util.sc;


/**
 * packageName    : test.exercise.testmeplz2
 * fileName       : TestMain
 * author         : letscombine
 * date           : 2022-01-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-24        letscombine       최초 생성
 */


public class TestMain {
      public static void main(String[] args) {
            School combineSchool = School.getInstance();
            System.out.println("========================");
            System.out.println("학점 프로그램 v 1.0");
            System.out.println("========================");
            while (true) {

                  System.out.println("1. 학생 관리 2. 과목 관리 3. 성적 관리 4. 리포팅(출력) 5. 프로그램 종료");
                  int btnNum = Integer.parseInt(sc.nextLine());
                  switch (btnNum) {
                        case 1:
                        case 2:
                        case 3:
                              goManage(btnNum);
                              break;
                        case 4:
                              printMe(); //출력 메서드
                              break;
                        case 5:
                              return; //프로그램의 종료
                        default:
                              System.out.println("잘못된 입력입니다");
                              break;
                  }
                  //넘버 클릭
            }
            //여기에서 다른 번호나 키 누르면 예외처리 잘 해줘야합니다

      }

      private static void printMe() {

      }//프린트 메서드 입니다.

      public static void goManage(int btnNumInput) {
            while (true) {
                  System.out.println("========================");
                  System.out.println("1. 등록");
                  System.out.println("2. 수정");
                  System.out.println("3. 삭제");
                  System.out.println("========================");
                  int manageNum = Integer.parseInt(sc.nextLine());

                  if (btnNumInput == 1) {
                        switch (manageNum) {
                              case 1:
                                    Student std = new Student();
                                    std.enrollStudent();
                                    break;
                              case 2:
                                    modifyStudent();
                                    break;
                              case 3:
                                    removeStudent();
                                    break;
                              default:
                                    System.out.println("잘못된 번호입력");
                                    break;
                        }
                  } else if (btnNumInput == 2) {
                        switch (manageNum) {
                              case 1:
                                    enrollSubject();
                                    break;
                              case 2:
                                    modifySubject();
                                    break;
                              case 3:
                                    removeSubject();
                                    break;
                              default:
                                    System.out.println("잘못된 번호 입력");
                                    break;
                        }
                  } else if (btnNumInput == 3) {
                        switch (manageNum) {
                              case 1:
                                    enrollScore();
                                    break;
                              case 2:
                                    modifyScore();
                                    break;
                              case 3:
                                    removeScore();
                                    break;
                              default:
                                    System.out.println("잘못된 번호 입력");
                                    break;

                        }

                  }
            }
      }

}


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
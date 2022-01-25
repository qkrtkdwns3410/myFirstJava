package test.exercise.testmeplz2;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import static test.exercise.testmeplz2.Util.sc;


/**
 * packageName    : test.exercise.testmeplz2
 * fileName       : School
 * author         : letscombine
 * date           : 2022-01-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-24        letscombine       최초 생성
 */


public class School {
      private static School instance = new School();

      private static String SCHOOL_NAME = "combine School";

      private ArrayList<Student> studentList = new ArrayList<>();
      private ArrayList<Subject> subjectList = new ArrayList<>();

      public static School getInstance() {
            if (instance == null) {
                  instance = new School();
                  System.out.println("인스턴스의 생성!");
            }

            return instance;
      }

      public static String getSchoolName() {
            return SCHOOL_NAME;
      }

      public static void setSchoolName(String schoolName) {
            SCHOOL_NAME = schoolName;
      }

      public void addStudent(Student student) {
            studentList.add(student);
      }

      public void addSubject(Subject subject) {
            subjectList.add(subject);
      }

      public void modifySubject(Subject subject, int index) {
            subjectList.remove(index);
            subjectList.add(subject);

      }

      public void removeSubject(int index) {
            subjectList.remove(index);
      }

      public void removeStudent(int index) {

            studentList.remove(index);
      }


      public boolean showStudentInfo() {
            if (studentList.size() == 0) {
                  System.out.println("학생이 없습니다");
            }
            for (int i = 0; i < studentList.size(); i++) {
                  Student student = studentList.get(i);
                  System.out.println(i + ". " + student);
            }

            return studentList.size() != 0;
      }

      public boolean showSubjectInfo() {

            if (subjectList.size() == 0) {
                  System.out.println("과목이 없습니다");
            }

            for (int i = 0; i < subjectList.size(); i++) {
                  Subject subject = subjectList.get(i);
                  System.out.println(i + ". " + subject);
            }

            return subjectList.size() != 0;
      }

      public ArrayList<Student> getStudentList() {
            return studentList;
      }

      public void setStudentList(ArrayList<Student> studentList) {
            this.studentList = studentList;
      }

      public ArrayList<Subject> getSubjectList() {
            return subjectList;
      }

      public void setSubjectList(ArrayList<Subject> subjectList) {
            this.subjectList = subjectList;
      }


      public void goManage(int btnNumInput) {
            System.out.println("School.goManage");

            Field[] fields = DefineType.class.getFields();
            System.out.println("fields = " + Arrays.toString(fields));
            System.out.println("========================");

            while (true) {

                  int manageNum = 0;
                  try {
                        System.out.println("========================");
                        System.out.println("1. 등록");
                        System.out.println("2. 수정");
                        System.out.println("3. 삭제");
                        System.out.println("4. 처음으로");
                        System.out.println("========================");
                        manageNum = Integer.parseInt(sc.nextLine());
                  } catch (NumberFormatException e) {
                        System.out.println("숫자만 입력해라..");
                  }

                  if (btnNumInput == 1) { //학생
                        switch (manageNum) {
                              case 1:
                                    try {
                                          System.out.println("학생 이름 입력");
                                          String name = sc.nextLine();

                                          System.out.println("========================");
                                          System.out.println("선택가능한 과목");
                                          if (!showSubjectInfo()) {
                                                System.out.println("선택가능한 과목이 없습니다");
                                                System.out.println();
                                                System.out.println("과목등록을 먼저 해주세요");

                                                School.getInstance().mainLogic();
                                          }

                                          System.out.println("========================");
                                          System.out.println("필수 과목 입력 (숫자로 입력해주세요)");

                                          int getOne = Integer.parseInt(Util.sc.nextLine());

                                          if (School.getInstance().getSubjectList().size() <= getOne) {
                                                System.out.println("======================================================");
                                                System.out.println("그런 번호는 없습니다만");
                                                System.out.println("======================================================");
                                                break;
                                          }
                                          instance.addStudent(new Student(name, School.getInstance().getSubjectList()
                                                  .get(getOne)));


                                          break;
                                    } catch (NumberFormatException e) {
                                          System.out.println("잘못된 값을 눌렀자나..");
                                    } catch (IndexOutOfBoundsException e1) {
                                          System.out.println("없는 값을 호출했습니다");

                                    }

                              case 2:
                                    try {
                                          System.out.println(" 1 - case2");
                                          System.out.println("변경을 선택하셨습니다");

                                          System.out.println("========================");
                                          System.out.println("변경할 학생을 선택해주세요");

                                          if (!showStudentInfo()) {
                                                System.out.println("변경할 학생이 없습니다");
                                                School.getInstance().mainLogic();
                                          }

                                          System.out.println("========================");

                                          int stdNum = Integer.parseInt(sc.nextLine());

                                          if (!(stdNum >= 0 && stdNum < studentList.size())) {
                                                System.out.println("잘못된 번호 입력!");
                                                System.out.println();
                                                System.out.println("메인으로 이동합니다");
                                                School.getInstance().mainLogic();
                                          }

                                          System.out.println("stdNum = " + stdNum);

                                          System.out.println("========================");
                                          System.out.println("해당 학생의 정보");
                                          School.getInstance().getStudentList().get(stdNum).toString();
                                          System.out.println("========================");

                                          System.out.println("변경할 이름을 입력해주세요");
                                          String changedName = sc.nextLine();
                                          System.out.println("변경할 전공을 입력해주세요");
                                          String changedMajor = sc.nextLine();

                                          System.out.println("========================");
                                          School.getInstance().getStudentList().get(stdNum).setStudentName(changedName);
                                          School.getInstance().getStudentList().get(stdNum)
                                                  .setStudentName(changedMajor);

                                          System.out.println("반영되었습니다!");

                                          System.out.println("========================");
                                          System.out.println("변경된 내역입니다");
                                          School.getInstance().getStudentList().get(stdNum).toString();
                                          System.out.println("========================");
                                          break;
                                    } catch (NumberFormatException e) {
                                          System.out.println("잘못된 값을 눌렀자나..");
                                          e.printStackTrace();
                                    }

                              case 3:
                                    try {
                                          System.out.println("========================");
                                          System.out.println("삭제할 학생을 선택해주세요");

                                          showStudentInfo();
                                          System.out.println("========================");

                                          System.out.println("삭제할 학생 번호을 입력해주세요");
                                          int wantRemoveStdNum = Integer.parseInt(sc.nextLine());

                                          removeStudent(wantRemoveStdNum);
                                          removeScoreForStudent(subjectList.get(wantRemoveStdNum), wantRemoveStdNum);
                                          System.out.println("처리되었습니다");
                                          System.out.println("studentList = " + studentList);

                                          break;
                                    } catch (NumberFormatException e) {
                                          System.out.println("잘못된 값을 눌렀자나..");
                                          e.printStackTrace();
                                    } catch (IndexOutOfBoundsException e1) {
                                          System.out.println("해당 번호는 없습니다만..");
                                    } catch (Exception e) {
                                          System.out.println("예상치 못한 예외발생?");
                                    }
                              case 4:
                                    try {
                                          System.out.println("처음으로 이동");
                                          School.getInstance().mainLogic();
                                          break;
                                    } catch (Exception e) {
                                          e.printStackTrace();
                                    }

                              default:
                                    System.out.println("잘못된 번호입력");
                                    break;
                        }
                  } else if (btnNumInput == 2) { // 과목
                        if (manageNum == 1) {
                              try {
                                    System.out.println("현재 과목의 정보");
                                    System.out.println("========================");
                                    showSubjectInfo();
                                    System.out.println("========================");

                                    System.out.println("등록할 과목 이름 입력");
                                    String name = sc.nextLine();

                                    System.out.println("등록할 과목의 아이디 입력");
                                    int getOne = Integer.parseInt(sc.nextLine());

                                    for (Subject subject : subjectList) {
                                          if (subject.getSubjectId() == getOne) {
                                                throw new AlreadyExisted("이미 존재하는 값입니다");
                                          }
                                    }

                                    System.out.println("========================");
                                    for (int i = 0; i < fields.length; i++) {
                                          System.out.println(i + ". " + fields[i]);
                                    }
                                    System.out.println("========================");
                                    System.out.println("등록할 학점 평가 방식을 선택 (숫자 선택)");
                                    int numType = Integer.parseInt(sc.nextLine());


                                    instance.addSubject(new Subject(name, getOne, GradeType.find(numType)));
                              } catch (NumberFormatException e1) {
                                    System.out.println("올바른 형식으로 좀 적어주라 제발");

                              } catch (IllegalArgumentException e) {
                                    System.out.println("못찾았다..");
                              } catch (AlreadyExisted ignored) {

                              }

                        } else if (manageNum == 2) {
                              try {
                                    System.out.println("현재 과목의 정보");
                                    System.out.println("========================");
                                    showSubjectInfo();
                                    System.out.println("========================");


                                    System.out.println("수정할 과목의 번호 입력");

                                    int getModifyNum = Integer.parseInt(sc.nextLine());
                                    if (!(getModifyNum >= 0 && getModifyNum < subjectList.size())) {
                                          System.out.println("잘못된 번호 입력");
                                          System.out.println();
                                          System.out.println("메인으로 돌아갑니다");
                                          School.getInstance().mainLogic();

                                    }
                                    System.out.println("========================");

                                    System.out.println("과목 이름 (수정)");
                                    String modifiedSubjectName = sc.nextLine();

                                    System.out.println("과목 번호 (수정)");
                                    int modifiedSubejctNum = Integer.parseInt(sc.nextLine());

                                    System.out.println("현재 과목 평가 방식의 종류");
                                    System.out.println("========================");
                                    for (int i = 0; i < fields.length; i++) {
                                          System.out.println(i + ". " + fields[i]);
                                    }
                                    System.out.println("========================");


                                    System.out.println("과목 학점 평가 방식(수정) - 번호로 입력");
                                    int numOfGradeType = Integer.parseInt(sc.nextLine());


                                    instance.modifySubject(new Subject(modifiedSubjectName, modifiedSubejctNum, GradeType.find(numOfGradeType)), numOfGradeType);
                              } catch (NumberFormatException e) {
                                    System.out.println("올바른 값을 입력하세요");
                              } catch (IllegalArgumentException e1) {
                                    System.out.println("올바른 평가 방식으로..");

                              } catch (Exception e) {
                                    e.printStackTrace();
                                    System.out.println("에러발생");

                              }
                        } else if (manageNum == 3) {
                              try {
                                    System.out.println("현재 과목의 목록");
                                    System.out.println("========================");
                                    showSubjectInfo();
                                    System.out.println("========================");

                                    System.out.println("삭제할 과목의 번호 ex) 0, 1, 2 ...");
                                    int removeNum = Integer.parseInt(sc.nextLine());

                                    instance.removeSubject(removeNum);
                                    System.out.println("정상적으로 삭제되었습니다");
                              } catch (NumberFormatException e) {
                                    e.printStackTrace();
                              }
                        } else if (manageNum == 4) {
                              System.out.println("처음으로 이동");
                              School.getInstance().mainLogic();
                        } else {
                              System.out.println("잘못된 번호 입력");
                        }
                  } else if (btnNumInput == 3) {
                        System.out.println("btnNumInput = " + btnNumInput);
                        System.out.println("========================");
                        switch (manageNum) {
                              case 1:
                                    try {
                                          System.out.println("성적을 입력합니다");
                                          System.out.println("========================");

                                          if (!showStudentInfo()) {
                                                System.out.println("등록된 학생이 없습니다.");
                                                System.out.println();
                                                System.out.println("메인으로 돌아갑니다.");
                                                School.getInstance().mainLogic();
                                          }

                                          System.out.println("========================");
                                          System.out.println("성적을 입력할 학생을 선택해주세요");

                                          int numOfScoredStudent = Integer.parseInt(sc.nextLine());

                                          if (!(numOfScoredStudent >= 0 && numOfScoredStudent < studentList.size())) {
                                                System.out.println("잘못된 번호의 입력");
                                                System.out.println();
                                                System.out.println("======================================================");
                                          }

                                          System.out.println("========================");
                                          showSubjectInfo();
                                          System.out.println("========================");

                                          System.out.println("성적을 입력할 과목을 선택해주세요");
                                          int numOfScoredSubject = Integer.parseInt(sc.nextLine());

                                          System.out.println("점수 입력");
                                          int pointOfSubject = Integer.parseInt(sc.nextLine());
                                          if (pointOfSubject < 0 || pointOfSubject > 100) {
                                                System.out.println("올바른 점수를 입력 부탁");
                                                break;
                                          }
                                          System.out.println("========================");

                                          addScoreForStudent(instance.studentList.get(numOfScoredStudent), subjectList.get(numOfScoredSubject), pointOfSubject);

                                          System.out.println("성적 등록 메서드입니다");

                                          System.out.println("처리되었습니다.");
                                          break;
                                    } catch (NumberFormatException e) {
                                          System.out.println("올바른 값을 입력하세요");
                                    }

                              case 2:
                                    GenerateGradeReport generateGradeReport = new GenerateGradeReport();
                                    try {

                                          generateGradeReport.getReport();
                                          System.out.println("리포트가 보임");
                                          System.out.println("========================");

                                          System.out.println("========================");
                                          showStudentInfo();
                                          System.out.println("========================");
                                          System.out.println("성적을 수정할 학생을 선택해주세요");
                                          int numOfScoredStudent2 = Integer.parseInt(sc.nextLine());

                                          System.out.println("========================");
                                          showSubjectInfo();
                                          System.out.println("========================");

                                          System.out.println("성적을 수정할 과목을 입력해주세요");

                                          int numOfScoredSubject2 = Integer.parseInt(sc.nextLine());

                                          System.out.println("점수 입력");
                                          int pointOfSubject2 = Integer.parseInt(sc.nextLine());
                                          if (pointOfSubject2 < 0 || pointOfSubject2 > 100) {
                                                System.out.println("0~100까지만..");
                                                break;
                                          }
                                          System.out.println("========================");

                                          modifyScoreForStudent(studentList.get(numOfScoredStudent2), subjectList.get(numOfScoredSubject2), pointOfSubject2);

                                          System.out.println("성적 등록 메서드입니다");

                                          System.out.println("처리되었습니다.");

                                    } catch (Exception e) {
                                          e.printStackTrace();
                                    }

                                    break;
                              case 3:
                                    System.out.println("성적 삭제는 해당 과목의 삭제와 동일함.");
                                    break;
                              case 4:
                                    System.out.println("처음으로 이동");
                                    School.getInstance().mainLogic();
                                    break;
                              default:
                                    System.out.println("잘못된 번호 입력");
                                    break;

                        }

                  } else {
                        System.out.println("처음으로 돌아갑니다");
                        System.out.println("========================");
                        mainLogic();
                  }
            }


      }

      public void addScoreForStudent(Student student, Subject subject, int point) {
            try {
                  System.out.println("체크체크");
                  System.out.println("student = " + student);
                  System.out.println("subject = " + subject);
                  System.out.println("point = " + point);
                  System.out.println("체크체크");
                  System.out.println("========================");
                  subject.register(student);
                  Score score = new Score(student.getStudentID(), subject, point);

                  //성적 등록시 자동 수강신청으로 생각하겠습니다.


                  student.addSubjectScore(score);
            } catch (Exception e) {
                  e.printStackTrace();
            }
      }

      public void removeScoreForStudent(Subject subject, int index) {
            try {
                  System.out.println("삭제 메서드");
                  System.out.println("subject = " + subject);
                  System.out.println("index = " + index);
                  System.out.println("======================================================");
                  subject.removeOneStudent(index);
            } catch (IndexOutOfBoundsException ignored) {

            } catch (Exception e) {
                  e.printStackTrace();
            }

      } // 삭제시 해당 학생도 삭제되는 메서드

      public void modifyScoreForStudent(Student student, Subject subject, int point) {
            int index = -1;
            for (int i = 0; i < subjectList.size(); i++) {
                  if (subjectList.get(i).getSubjectName().equals(subject.getSubjectName())) {
                        index = i;
                  }
            }
            if (index != -1) {
                  student.removeSubjectScore(index);
                  addScoreForStudent(student, subject, point);

            } else {
                  System.out.println("처리 오류!");
            }
      }


      public void mainLogic() {
            System.out.println("========================");
            System.out.print("□□□■□□□□■■□□■■■■■■■□□■□□□□□■■■■■■□□■□□□■■■■■■□□□■□□□□□□□□□□□□□□□□□□□■■■■■■■■□□□□□□□□□□□□□□□■■■■■□■□□■\n" + "□■■■■■■■□■■□□□□□■□□□□□■□□□□□■■■■■■□□■□□□■■■■■■□□□■□□□□□□□■■■■■■■■■□□□□□□□□□□■□□□■■■■■■■■■■□□□□□■■□■□□■\n" + "□□■■■■■□□■■□□□□□■□□□□□■□□□□□□□□□□■□□■□□□□□□□□■□□□■□□□□□□□□□■□□□■□□□□□□□□□□□□■□□□□□□□□□□□■■□□□□□■■□■■■■\n" + "□■■■□■■□□■■■■□□■■■□■■■■□□□□□□□■□□■□□■■■□□□□□□■□□□■□□□□□□□□□■□□□■□□□□□■■■■■■■■□□□□□□□□□□□■■□□■■■■■□■■■■\n" + "□■■□□□■■□■■□□□■■■■■□□□■□□□□□□□■□■■□□■■■□■■■■■■□□□■□□□□□□□□□■□□□■□□□□□■■□□□□□□□□□□□□□□□□□■■□□■□□□□□■□□■\n" + "□■■□□■■■□■■□■■■□□■■■□□■□□□□□□□■■■■■■■□□□■□□□□□□□□■□□□□□□□□□■□□□■□□□□□■■□□□□□□□□□□□□□□□□□■□□□■■■■■■■□□■\n" + "□□■■■■■□□■■□■■□□□□□□□□■□□□□■■■■■■■■■■□□□■□□□□□□□□■□□□□□□□■■■■■■■■■□□□■■■■■■■■■□□□□□□□□□□■□□□■■■□□□■□□■\n" + "□□□□□□□□□□■□□□□■■■■■■■■□□□□□□□□□□□□□■□□□■□□□□□□□□■□□□□□□□□□□□□□□□□□□□□□□■■□□□□□□□□□□□□□□■□□□□□■■■■■■■■\n" + "□□■■■■■■■■■□□□□■□□□□□□■□□□□□□■□□□□□□■□□□■■■■■■■■□■□□□□□□□□□□□□□□□□□□□□□□■■□□□□□□□□□□□□□□□□□□□□■□□□□□□■\n" + "□□□□□□□□□□■□□□□■□□□□□□■□□□□□□■□□□□□□□□□□□□□□□□□□□■□□□□□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■□□□■□□□□□□■\n" + "□□□□□□□□□□■□□□□■□□□□□□■□□□□□□■□□□□□□□□□□□□□□□□□□□■□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■□□□□□□■\n" + "□□□□□□□□□□■□□□□■■■■■■■■□□□□□□■■■■■■■■■□□□□□□□□□□□■□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□■■■■■■■■");
            System.out.println();
            System.out.println("========================");
            while (true) {

                  int btnNum = 0;
                  try {
                        System.out.println("1. 학생 관리 2. 과목 관리 3. 성적 관리 4. 리포팅(출력) 5. 프로그램 종료");
                        btnNum = Integer.parseInt(sc.nextLine());
                  } catch (NumberFormatException e) {
                        e.printStackTrace();
                  }
                  switch (btnNum) {
                        case 1:
                        case 2:
                        case 3:
                              School.getInstance().goManage(btnNum);
                              break;
                        case 4:
                              try {
                                    GenerateGradeReport generateGradeReport = new GenerateGradeReport(); //출력 메서드
                                    System.out.println(generateGradeReport.getReport());
                                    System.out.println("리포트 만듬");
                                    break;
                              } catch (Exception ignored) {

                              }

                        case 5:
                              System.out.println("프로그램이 종료됩니다");
                              System.exit(0);

                        case 6:
                              System.out.print("⠄⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣤⣴⣶⣶⣶⣶⣦⣤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠀⣀⣤⣾⣿⡿⠿⠛⠛⠛⠛⠛⠛⠻⢿⣿⣿⣦⣄⠀⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⢠⣼⣿⡿⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠿⣿⣷⣄⠀⠀⠀⠀\n" + "⠀⠀⠀⣰⣿⡿⠋⠀⠀⠀⠀⠀⣿⡇⠀⢸⣿⡇⠀⠀⠀⠀⠀⠈⢿⣿⣦⡀⠀⠀\n" + "⠀⠀⣸⣿⡿⠀⠀⠀⠸⠿⣿⣿⣿⡿⠿⠿⣿⣿⣿⣶⣄⠀⠀⠀⠀⢹⣿⣷⠀⠀\n" + "⠀⢠⣿⡿⠁⠀⠀⠀⠀⠀⢸⣿⣿⡇⠀⠀⠀⠈⣿⣿⣿⠀⠀⠀⠀⠀⢹⣿⣧⠀\n" + "⠀⣾⣿⡇⠀⠀⠀⠀⠀⠀⢸⣿⣿⡇⠀⠀⢀⣠⣿⣿⠟⠀⠀⠀⠀⠀⠈⣿⣿⠀\n" + "⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⢸⣿⣿⡿⠿⠿⠿⣿⣿⣥⣄⠀⠀⠀⠀⠀⠀⣿⣿⠀\n" + "⠀⢿⣿⡇⠀⠀⠀⠀⠀⠀⢸⣿⣿⡇⠀⠀⠀⠀⢻⣿⣿⣧⠀⠀⠀⠀⢀⣿⣿⠀\n" + "⠀⠘⣿⣷⡀⠀⠀⠀⠀⠀⢸⣿⣿⡇⠀⠀⠀⠀⣼⣿⣿⡿⠀⠀⠀⠀⣸⣿⡟⠀\n" + "⠀⠀⢹⣿⣷⡀⠀⠀⢰⣶⣿⣿⣿⣷⣶⣶⣾⣿⣿⠿⠛⠁⠀⠀⠀⣸⣿⡿⠀⠀\n" + "⠀⠀⠀⠹⣿⣷⣄⠀⠀⠀⠀⠀⣿⡇⠀⢸⣿⡇⠀⠀⠀⠀⠀⢀⣾⣿⠟⠁⠀⠀\n" + "⠀⠀⠀⠀⠘⢻⣿⣷⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣾⣿⡿⠋⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠀⠈⠛⢿⣿⣷⣶⣤⣤⣤⣤⣤⣤⣴⣾⣿⣿⠟⠋⠀⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠛⠻⠿⠿⠿⠿⠟⠛⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                              System.out.println();
                              break;
                        default:
                              System.out.println("잘못된 입력입니다");
                              break;
                  }

                  //넘버 클릭
            }
            //여기에서 다른 번호나 키 누르면 예외처리 잘 해줘야합니다
      }

}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
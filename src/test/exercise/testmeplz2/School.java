package test.exercise.testmeplz2;

import java.lang.reflect.Field;
import java.util.ArrayList;

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


      private ArrayList<Student> studentList = new ArrayList<>();
      private ArrayList<Subject> subjectList = new ArrayList<>();

      public static School getInstance() {
            if (instance == null) {
                  instance = new School();
            }

            return instance;
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
            if (index >= subjectList.size()) {
                  throw new IndexOutOfBoundsException();
            }
            subjectList.remove(index);
      }

      public void removeStudent(int index) {

            studentList.remove(index);
      }


      public boolean showStudentInfo() {
            System.out.println();
            if (studentList.size() == 0) {
                  System.out.println("\n학생이 없습니다\n");
            }
            System.out.println();
            for (int i = 0; i < studentList.size(); i++) {
                  Student student = studentList.get(i);
                  System.out.println(i + ". " + student);
            }
            System.out.println();

            return studentList.size() != 0;
      }

      public boolean showSubjectInfo() {

            if (subjectList.size() == 0) {
                  System.out.println("\n과목이 없습니다\n");
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
            Field[] fields = DefineType.class.getFields();
            System.out.println("========================");

            while (true) {

                  int manageNum = 0;
                  try {
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println("========================");
                        System.out.println("1. 등록");
                        System.out.println("2. 수정");
                        System.out.println("3. 삭제");
                        System.out.println("4. 정보 출력");
                        System.out.println("5. 처음으로");
                        System.out.print("========================\n\n\n\n\n\n\n\n");

                        manageNum = Integer.parseInt(sc.nextLine());
                        if (checkBackSlashForInt(manageNum)) {
                              return;
                        }
                        System.out.print("\n\n\n\n\n");


                  } catch (NumberFormatException e) {
                        System.out.println("\n\n형식이 틀리거나 뒤로가기를 선택하셨습니다\n\n");
                  }

                  if (btnNumInput == 1) { //학생
                        switch (manageNum) {
                              case 1:
                                    enrollStudent();
                                    break;


                              case 2:
                                    modifyStudent();
                                    break;

                              case 3:
                                    removeStudent();
                                    break;

                              case 4:
                                    showStudentInfo();
                                    break;
                              case 5:
                                    try {
                                          System.out.println("\n\n처음으로 이동\n\n");

                                          return;
                                    } catch (Exception e) {
                                          e.printStackTrace();
                                    }

                              default:
                                    System.out.println("\n\n잘못된 번호입력\n\n");
                                    break;
                        }
                  } else if (btnNumInput == 2) { // 과목
                        switch (manageNum) {
                              case 1:
                                    enrollSubject(fields);

                                    break;
                              case 2:
                                    modifySubject(fields);
                                    break;
                              case 3:
                                    removeSubject();

                                    break;
                              case 4:
                                    showSubjectInfo();
                                    break;
                              case 5:
                                    System.out.println("\n\n처음으로 이동\n\n");

                                    return;
                              default:
                                    System.out.println("\n\n잘못된 번호 입력\n\n");

                                    break;
                        }
                  } else if (btnNumInput == 3) { // 성적
                        switch (manageNum) {
                              case 1: {
                                    enrollScore();
                                    break;
                              }
                              case 2: {

                                    modifyScore();
                                    break;

                              }
                              case 3:
                                    System.out.println("\n\n성적 삭제는 해당 과목의 삭제와 동일함.\n\n");
                                    break;
                              case 4:
                                    GenerateGradeReport generateGradeReport = new GenerateGradeReport();
                                    System.out.println(generateGradeReport.getReport());
                                    break;
                              case 5:
                                    System.out.print("\n\n처음으로 이동\n\n");
                                    return;
                              default:
                                    System.out.print("\n\n잘못된 번호 입력\n\n");
                                    break;
                        }

                  } else {
                        System.out.println("처음으로 돌아갑니다");
                        System.out.println("========================");
                        break;
                  }
            }


      }

      private boolean modifyScore() {
            try {


                  System.out.println("========================");

                  System.out.println("========================");
                  showStudentInfo();
                  System.out.println("========================");
                  System.out.println("성적을 수정할 학생을 선택해주세요");

                  int numOfScoredStudent2 = Integer.parseInt(sc.nextLine());

                  if (checkBackSlashForInt(numOfScoredStudent2)) {
                        return true;
                  }
                  System.out.print("\n\n\n\n\n");

                  System.out.println("========================");
                  showSubjectInfo();
                  System.out.println("========================");

                  System.out.println("성적을 수정할 과목을 입력해주세요");

                  int numOfScoredSubject2 = Integer.parseInt(sc.nextLine());

                  if (checkBackSlashForInt(numOfScoredStudent2)) {
                        return true;
                  }

                  System.out.print("\n\n\n\n\n");

                  System.out.println("점수 입력");

                  int pointOfSubject2 = Integer.parseInt(sc.nextLine());
                  if (checkBackSlashForInt(pointOfSubject2)) {
                        return true;
                  }

                  System.out.print("\n\n\n\n\n");

                  if (pointOfSubject2 < 0 || pointOfSubject2 > 100) {
                        System.out.println("0~100까지만..");

                        return true;
                  }

                  System.out.println("========================");

                  modifyScoreForStudent(studentList.get(numOfScoredStudent2), subjectList.get(numOfScoredSubject2), pointOfSubject2);


                  System.out.println("처리되었습니다.");


            } catch (Exception e) {
                  e.printStackTrace();
            }
            return true;
      }

      private boolean enrollScore() {
            try {

                  System.out.println("성적을 입력합니다");
                  System.out.println("========================");

                  if (!showStudentInfo()) {
                        System.out.println("등록된 학생이 없습니다.");
                        System.out.println();
                        System.out.println("메인으로 돌아갑니다.");
                        return true;
                  }

                  System.out.println("========================");
                  System.out.println("성적을 입력할 학생을 선택해주세요");

                  int numOfScoredStudent = Integer.parseInt(sc.nextLine());
                  if (checkBackSlashForInt(numOfScoredStudent)) {
                        return true;
                  }
                  System.out.print("\n\n\n\n\n");

                  if (!(numOfScoredStudent >= 0 && numOfScoredStudent < studentList.size())) {
                        System.out.println("잘못된 번호의 입력");
                        System.out.println();
                        System.out.println("======================================================");
                        return true;
                  }

                  System.out.println("========================");
                  showSubjectInfo();
                  System.out.println("========================");

                  System.out.println("성적을 입력할 과목을 선택해주세요");

                  int numOfScoredSubject = Integer.parseInt(sc.nextLine());

                  if (checkBackSlashForInt(numOfScoredSubject)) {
                        return true;
                  }
                  ArrayList<Score> checkArr = studentList.get(numOfScoredSubject).getScoreList();
                  if (checkArr.size() != 0) {
                        System.out.println("이미 값이 존재합니다");
                        return true;
                  }



                  System.out.print("\n\n\n\n\n");

                  System.out.println("점수 입력");
                  int pointOfSubject = Integer.parseInt(sc.nextLine());

                  if (checkBackSlashForInt(pointOfSubject)) {
                        return true;
                  }
                  System.out.print("\n\n\n\n\n");

                  if (pointOfSubject < 0 || pointOfSubject > 100) {
                        System.out.println("올바른 점수를 입력 부탁합니다!");
                        return true;
                  }
                  System.out.println("========================");

                  addScoreForStudent(instance.studentList.get(numOfScoredStudent), subjectList.get(numOfScoredSubject), pointOfSubject);

                  System.out.println("처리되었습니다.");

            } catch (NumberFormatException e) {
                  System.out.println("\n\n형식이 틀리거나 뒤로가기를 선택하셨습니다\n\n");
            }
            return false;
      }

      private void removeSubject() {
            try {

                  System.out.println("현재 과목의 목록");
                  System.out.println("========================");
                  showSubjectInfo();
                  System.out.println("========================");

                  System.out.println("삭제할 과목의 번호 ex) 0, 1, 2 ...");
                  int removeNum = Integer.parseInt(sc.nextLine());
                  if (checkBackSlashForInt(removeNum)) {
                        return;
                  }
                  System.out.print("\n\n\n\n\n");

                  instance.removeSubject(removeNum);
                  System.out.println("정상적으로 삭제되었습니다");

            } catch (IndexOutOfBoundsException e) {
                  System.out.println("해당 값은 없습니다.");
            } catch (NumberFormatException e) {
                  System.out.println("\n\n형식이 틀리거나 뒤로가기를 선택하셨습니다\n\n");
            }
      }

      private void enrollSubject(Field[] fields) {
            try {
                  System.out.println();
                  System.out.println("현재 과목의 정보");
                  System.out.println();
                  System.out.println("========================");
                  showSubjectInfo();
                  System.out.println("========================");

                  System.out.println("등록할 과목 이름 입력");
                  String name = sc.nextLine();
                  if (checkBackSlashForString(name)) {
                        return;
                  }
                  System.out.print("\n\n\n\n\n");

                  System.out.println("등록할 과목의 번호 입력");
                  int getOne = Integer.parseInt(sc.nextLine());
                  if (checkBackSlashForInt(getOne)) {
                        return;
                  }
                  System.out.print("\n\n\n\n\n");

                  for (Subject subject : subjectList) {
                        if (subject.getSubjectId() == getOne) {
                              throw new AlreadyExistedException("이미 존재하는 값입니다");
                        }
                  }

                  System.out.println("========================");
                  showEvaluationProcess(fields);
                  System.out.println("========================");
                  System.out.println("등록할 학점 평가 방식을 선택 (숫자 선택)");
                  int numType = Integer.parseInt(sc.nextLine());
                  if (checkBackSlashForInt(numType)) {
                        return;
                  }
                  System.out.print("\n\n\n\n\n");


                  instance.addSubject(new Subject(name, getOne, GradeType.find(numType)));

            } catch (NumberFormatException e1) {
                  System.out.println("\n\n형식이 틀리거나 뒤로가기를 선택하셨습니다\n\n");
            } catch (IllegalArgumentException e) {
                  System.out.println("찾지 못하였습니다.");
            } catch (AlreadyExistedException e) {
                  System.out.println(e.getMessage());
            }
      }

      private boolean removeStudent() {
            try {

                  System.out.println("========================");
                  System.out.println("삭제할 학생을 선택해주세요");

                  showStudentInfo();
                  System.out.println("========================");

                  System.out.println("삭제할 학생 번호을 입력해주세요");
                  int wantRemoveStdNum = Integer.parseInt(sc.nextLine());
                  if (checkBackSlashForInt(wantRemoveStdNum)) {
                        return true;
                  }
                  System.out.print("\n\n\n\n\n");

                  removeStudent(wantRemoveStdNum);
                  removeScoreForStudent(subjectList.get(wantRemoveStdNum), wantRemoveStdNum);
                  System.out.println("처리되었습니다");

                  return true;
            } catch (NumberFormatException e) {
                  System.out.println("\n\n형식이 틀리거나 뒤로가기를 선택하셨습니다\n\n");
            } catch (IndexOutOfBoundsException e1) {
                  System.out.println("해당 번호는 없습니다.");
            } catch (Exception e) {
                  System.out.println("예상치 못한 예외발생?");
            }
            return false;
      }

      private boolean modifyStudent() {
            try {

                  System.out.println("변경을 선택하셨습니다");

                  System.out.println("========================");

                  if (!showStudentInfo()) {
                        System.out.println("변경할 학생이 없습니다");
                        System.out.print("\n\n\n\n\n");
                        return true;
                  }

                  System.out.println("========================");
                  System.out.println("변경할 학생을 선택해주세요");
                  System.out.print("\n\n\n\n\n");

                  int stdNum = Integer.parseInt(sc.nextLine());
                  if (checkBackSlashForInt(stdNum)) {
                        return true;
                  }
                  System.out.print("\n\n\n\n\n");

                  if (!(stdNum >= 0 && stdNum < studentList.size())) {
                        System.out.println("잘못된 번호 입력!");
                        System.out.println();
                        System.out.println("메인으로 이동합니다");
                        return true;
                  }


                  System.out.println("========================");
                  System.out.println("해당 학생의 정보");
                  System.out.println(School.getInstance().getStudentList().get(stdNum)
                                             .getStudentName() + " : " + School.getInstance().getSubjectList()
                          .get(stdNum).getSubjectId());

                  System.out.println("========================");

                  System.out.println("변경할 이름을 입력해주세요");
                  String changedName = sc.nextLine();
                  if (checkBackSlashForString(changedName)) {
                        return true;
                  }
                  System.out.print("\n\n\n\n\n");

                  System.out.println("변경할 전공을 입력해주세요");
                  System.out.println("======================================================");
                  showSubjectInfo();
                  System.out.println("======================================================");

                  int changedMajorNum = Integer.parseInt(sc.nextLine());
                  if (checkBackSlashForInt(changedMajorNum)) {
                        return true;
                  }
                  System.out.print("\n\n\n\n\n");

                  if (School.getInstance().getSubjectList().size() <= changedMajorNum) {
                        System.out.println("======================================================");
                        System.out.println("그런 번호는 없습니다만");
                        System.out.println("======================================================");
                        return true;
                  }

                  System.out.println("========================");
                  School.getInstance().getStudentList().get(stdNum).setStudentName(changedName);
                  School.getInstance().getStudentList().get(stdNum)
                          .setMajorSubject(School.getInstance().getSubjectList().get(changedMajorNum));

                  System.out.println("반영되었습니다!");

                  System.out.println("========================");
                  System.out.println("변경된 내역입니다");
                  School.getInstance().getStudentList().get(stdNum).toString();
                  System.out.println("========================");

                  return true;
            } catch (NumberFormatException e) {
                  System.out.println("\n\n형식이 틀리거나 뒤로가기를 선택하셨습니다\n\n");
            }
            return false;
      }

      private boolean enrollStudent() {
            try {
                  System.out.println();
                  char back = '\\';

                  System.out.println("학생 이름 입력");

                  String name = sc.nextLine();
                  if (checkBackSlashForString(name)) {
                        return true;
                  }
                  System.out.print("\n\n\n\n\n");

                  System.out.println("========================");
                  System.out.println();
                  if (!showSubjectInfo()) {
                        System.out.println();
                        System.out.println("과목등록을 먼저 해주세요");
                        System.out.println();
                        System.out.println("======================================================");
                        return true;
                  }

                  System.out.println("========================");
                  System.out.println("필수 과목 입력 (숫자로 입력해주세요)");
                  System.out.print("\n\n\n\n\n");
                  int getOne = Integer.parseInt(Util.sc.nextLine());
                  if (checkBackSlashForInt(getOne)) {
                        return true;
                  }

                  System.out.print("\n\n\n\n\n");

                  if (School.getInstance().getSubjectList().size() <= getOne) {
                        System.out.println("======================================================");
                        System.out.println("그런 번호는 없습니다만");
                        System.out.println("======================================================");
                        return true;
                  }
                  instance.addStudent(new Student(name, School.getInstance().getSubjectList().get(getOne)));
                  System.out.print("\n\n등록 성공\n\n");


                  return true;
            } catch (NumberFormatException e) {
                  System.out.println("잘못된 값을 눌렀자나..");
            } catch (IndexOutOfBoundsException e1) {
                  System.out.println("없는 값을 호출했습니다");

            }
            return false;
      }

      private void modifySubject(Field[] fields) {
            try {
                  System.out.println();

                  System.out.println("현재 과목의 정보");
                  System.out.println();
                  System.out.println("========================");
                  showSubjectInfo();
                  System.out.println("========================");


                  System.out.println("수정할 과목의 번호 입력");

                  int getModifyNum = Integer.parseInt(sc.nextLine());
                  if (checkBackSlashForInt(getModifyNum)) {
                        return;
                  }

                  System.out.print("\n\n\n\n\n");

                  if (!(getModifyNum >= 0 && getModifyNum < subjectList.size())) {
                        System.out.println("잘못된 번호 입력");
                        System.out.println();
                        System.out.println("메인으로 돌아갑니다");
                        return;
                  }
                  System.out.println("========================");

                  System.out.println("과목 이름 (수정)");
                  String modifiedSubjectName = sc.nextLine();
                  if (checkBackSlashForString(modifiedSubjectName)) {
                        return;
                  }

                  System.out.print("\n\n\n\n\n");

                  System.out.println("과목 번호 (수정)");

                  int modifiedSubejctNum = Integer.parseInt(sc.nextLine());
                  if (checkBackSlashForInt(modifiedSubejctNum)) {
                        return;
                  }

                  System.out.print("\n\n\n\n\n");

                  System.out.println();

                  System.out.println("현재 과목 평가 방식의 종류");

                  System.out.println("========================");
                  showEvaluationProcess(fields);
                  System.out.println("========================");


                  System.out.println("과목 학점 평가 방식(수정) - 번호로 입력");
                  int numOfGradeType = Integer.parseInt(sc.nextLine());
                  if (checkBackSlashForInt(numOfGradeType)) {
                        return;
                  }
                  System.out.print("\n\n\n\n\n");


                  instance.modifySubject(new Subject(modifiedSubjectName, modifiedSubejctNum, GradeType.find(numOfGradeType)), getModifyNum);

            } catch (NumberFormatException e) {
                  System.out.println("\n\n형식이 틀리거나 뒤로가기를 선택하셨습니다\n\n");
            } catch (IllegalArgumentException e1) {
                  System.out.println("올바른 평가 방식으로..");

            } catch (Exception e) {
                  System.out.println("에러발생");

            }

      }

      private boolean checkBackSlashForInt(int getModifyNum) {
            if (getModifyNum == (int) '\\') {
                  System.out.println("메인으로 이동");
                  return true;
            }
            return false;
      }

      private boolean checkBackSlashForString(String modifiedSubjectName) {
            if (modifiedSubjectName.equals("\\")) {
                  System.out.println("메인으로 이동");
                  return true;
            }
            return false;
      }

      private void showEvaluationProcess(Field[] fields) {
            for (int i = 0; i < fields.length; i++) {
                  if (i == 0) {
                        System.out.println(i + ". " + "S A B 방식");

                        System.out.print("\t\t 해당 방식은 95점 이상 : S , 90점 이상 : A, 80점 이상 : B\n");
                        System.out.print("\t\t\t 70점 이상 : C, 60점 이상 : D, 60점 미만 : F\n\n");
                  } else if (i == 1) {
                        System.out.println(i + ". " + "A B 방식");

                        System.out.print("\t\t 해당 방식은 90점 이상 : A ,80점 이상 : B, 70점 이상 : C\n");
                        System.out.print("\t\t\t 55점 이상 : D, 55점 미만 : F\n\n");

                  } else {
                        System.out.println("새로 등록해줘야합니다. 문의 바랍니다");
                  }

            }
      }

      public void addScoreForStudent(Student student, Subject subject, int point) {

            try {

                  subject.register(student);
                  Score score = new Score(student.getStudentID(), subject, point);

                  //성적 등록시 자동 수강신청으로 생각하겠습니다.


                  student.addSubjectScore(score);
            } catch (Exception e) {
                  System.out.println("**");
            }

      }

      public void removeScoreForStudent(Subject subject, int index) {

            try {

                  System.out.println("======================================================");
                  subject.removeOneStudent(index);
            } catch (IndexOutOfBoundsException ignored) {

            } catch (Exception e) {
                  System.out.println("**");
            }


      } // 삭제시 해당 학생도 삭제되는 메서드

      public void modifyScoreForStudent(Student student, Subject subject, int point) {

            int index = -1;
            for (int i = 0; i < subjectList.size(); i++) {
                  if (subjectList.get(i).getSubjectName().equals(subject.getSubjectName())) {
                        index = i;
                  }
            }

            System.out.println(student.getScoreList());
            if (index != -1) {
                  student.removeSubjectScore(index);
                  subject.getStudentList().remove(index);

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
                        System.out.print("\n\n\t\t사용하실 번호를 입력해주세요\n\n");
                        System.out.print("\t1. 학생 관리\n");
                        System.out.print("\t\t 학생을 등록하고 학생에 대해 정보를 수정하고 삭제가능합니다\n");
                        System.out.print("\t2. 과목 관리\n");
                        System.out.print("\t\t 과목을 등록하고 학생에 대해 정보를 수정하고 삭제가능합니다\n");
                        System.out.print("\t3. 성적 관리\n");
                        System.out.print("\t\t 해당 과목에 대한 학생들의 성적을 등록. 수정. 삭제가능합니다\n");
                        System.out.print("\t4. 리포트 출력\n");
                        System.out.print("\t\t 학생별 성적 || 과목별 학생들의 성적에 대해 출력 가능합니다\n");
                        System.out.print("\t5. 프로그램의 종료\n");
                        System.out.print("\t\t 프로그램을 종료합니다\n\n");
                        System.out.println();
                        System.out.println();
                        System.out.println("======================================================");
                        System.out.println("TIP) \\ 을 입력시 \"입력도중\" 메인화면으로 이동할 수 있습니다");
                        System.out.print("1. 학생 관리 2. 과목 관리 3. 성적 관리 4. 리포팅(출력) 5. 프로그램 종료 99.제작의도\n\n\n\n\n\n\n\n");

                        btnNum = Integer.parseInt(sc.nextLine());
                        if (checkBackSlashForInt(btnNum)) {
                              continue;
                        }
                        System.out.print("\n\n\n\n\n");

                  } catch (NumberFormatException e) {
                        System.out.println("\n\n형식이 틀리거나 뒤로가기를 선택하셨습니다\n\n");
                  }

                  switch (btnNum) {
                        case 1:
                        case 2:
                        case 3:
                              School.getInstance().goManage(btnNum);
                              break;
                        case 4:
                              try {
                                    System.out.print("출력 방식 선택\n\n");
                                    System.out.print("1. 과목별 성적 출력\t\t2. 학생별 성적 출력\n\n");

                                    int numOfPrintType = Integer.parseInt(sc.nextLine());
                                    if (checkBackSlashForInt(numOfPrintType)) {
                                          return;
                                    }
                                    GenerateGradeReport generateGradeReport = new GenerateGradeReport(); //출력 메서드

                                    switch (numOfPrintType) {
                                          case 1:
                                                System.out.println(generateGradeReport.getReport());
                                                break;
                                          case 2:
                                                System.out.println(generateGradeReport.getReportGroupbyStudent());
                                                break;

                                          default:
                                                System.out.println("올바른 값을 입력해주세요");
                                                break;
                                    }
                              } catch (NumberFormatException e) {
                                    System.out.println("\n\n형식이 틀리거나 뒤로가기를 선택하셨습니다\n\n");
                                    System.out.println();
                              } catch (Exception e) {
                                    e.printStackTrace();
                              }
                              break;

                        case 5:
                              System.out.println("프로그램이 종료됩니다");
                              System.exit(0);
                        case 99:
                              System.out.print("\n\n\n\t\t\t\t제작의도\t\t\t\t\n\n\n");
                              System.out.println("\t\t\t\t학점 관리 프로그램입니다.\t\t\t\t");
                              System.out.println("\t\t\t\t해당 프로그램은 수강신청된 과목에 대한 수강하는 학생들의 학점을 수기 입력없이 계산할 수 있도록 제작된 프로그램입니다.\t\t\t\t");
                              System.out.print("\n\n\n");
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

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
package test.exercise.testmeplz2;

import java.util.ArrayList;


/**
 * packageName    : test.exercise.testmeplz2
 * fileName       : Student
 * author         : letscombine
 * date           : 2022-01-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-24        letscombine       최초 생성
 */


public class Student {
      private static int studentID = 1000; //학번
      private String studentName; //학생이름
      private Subject majorSubject; //학생 필수 과목 하나!

      private ArrayList<Score> scoreList = new ArrayList<>();

      public Student() {
            this("이름없음", null);

      }

      public Student(String studentName, Subject majorSubject) {
            studentID++;
            this.studentName = studentName;
            this.majorSubject = majorSubject;
      }

      public int getStudentID() {
            return studentID;
      }

      public void setStudentID(int studentID) {
            Student.studentID = studentID;
      }

      public String getStudentName() {
            return studentName;
      }

      public void setStudentName(String studentName) {
            this.studentName = studentName;
      }

      public Subject getMajorSubject() {
            return majorSubject;
      }

      public void setMajorSubject(Subject majorSubject) {
            this.majorSubject = majorSubject;
      }

      public ArrayList<Score> getScoreList() {
            return scoreList;
      }

      public void setScoreList(ArrayList<Score> scoreList) {
            this.scoreList = scoreList;
      }

      public Student  enrollStudent() {

            System.out.println("========================");

            System.out.println("학생이름 입력");
            String studentInputName = Util.sc.nextLine();

            System.out.println("학생 번호 입력");
            int studentInputID = Integer.parseInt(Util.sc.nextLine());


            System.out.println("========================");
            System.out.println("선택가능한 과목");

            for (int i = 0; i < School.getInstance().getSubjectList().size(); i++) {
                  System.out.println(School.getInstance().getSubjectList().get(i));
            }
            System.out.println("========================");
            System.out.println("필수 과목 입력 (숫자로 입력해주세요)");

            int getOne = Integer.parseInt(Util.sc.nextLine());

            Student std = new Student(studentInputName, School.getInstance().getSubjectList().get(getOne));

            System.out.println("학생이 생성되었습니다");
            System.out.println("std = " + std);

            System.out.println("========================");
            return std;
      }

      public void addSubjectScore(Score score) {
            scoreList.add(score);

      }

      public void removeSubjectScore(int index) {
            scoreList.remove(index);
      }

      @Override
      public String toString() {
            final StringBuilder sb = new StringBuilder("Student{");
            sb.append("studentName='").append(studentName).append('\'');
            sb.append(", majorSubject=").append(majorSubject);
            sb.append(", scoreList=").append(scoreList);
            sb.append('}');
            return sb.toString();
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
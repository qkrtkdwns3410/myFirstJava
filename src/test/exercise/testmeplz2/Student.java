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
      private int studentID; //학번
      private String studentName; //학생이름
      private Subject majorSubject; //학생 필수 과목 하나!

      private ArrayList<Score> scoreList = new ArrayList<>();


      public int getStudentID() {
            return studentID;
      }

      public void setStudentID(int studentID) {
            this.studentID = studentID;
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

      public void enrollStudent() {
            System.out.println("========================");

            System.out.println("학생이름 입력");
            String studentInputName = Util.sc.nextLine();

            System.out.println("학생 번호 입력");
            int studentInputID = Integer.parseInt(Util.sc.nextLine());

            System.out.println("필수 과목 입력");



      }

}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
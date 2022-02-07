package test.exercise.testmeplz2.consolePrg;

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


public class StudentVO {
      private static int studentSerialID = 1000; //학번
      private int studentID;
      private String studentName; //학생이름
      private SubjectVO majorSubject; //학생 필수 과목 하나!

      private ArrayList<ScoreVO> scoreList = new ArrayList<>();

      public StudentVO() {
            this("이름없음", null);
      }

      public StudentVO(String studentName, SubjectVO majorSubject) {
            this.studentID = studentSerialID++;
            this.studentName = studentName;
            this.majorSubject = majorSubject;
      }

      public int getStudentID() {
            return studentSerialID;
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

      public SubjectVO getMajorSubject() {
            return majorSubject;
      }

      public void setMajorSubject(SubjectVO majorSubject) {
            this.majorSubject = majorSubject;
      }

      public ArrayList<ScoreVO> getScoreList() {
            return scoreList;
      }

      public void setScoreList(ArrayList<ScoreVO> scoreList) {
            this.scoreList = scoreList;
      }

      public void addSubjectScore(ScoreVO score) {
            scoreList.add(score);

      }

      public void removeSubjectScore(int index) {
            scoreList.remove(index);
      }

      @Override
      public String toString() {
            return "학생 이름 = " + studentName + majorSubject;
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
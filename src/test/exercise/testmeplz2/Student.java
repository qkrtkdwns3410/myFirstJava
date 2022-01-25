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
      private static int studentSerialID = 1000; //학번
      private int studentID;
      private String studentName; //학생이름
      private Subject majorSubject; //학생 필수 과목 하나!

      private ArrayList<Score> scoreList = new ArrayList<>();

      public Student() {
            this("이름없음", null);

      }

      public Student(String studentName, Subject majorSubject) {
            this.studentID = studentSerialID++;
            this.studentName = studentName;
            this.majorSubject = majorSubject;
      }

      public int getStudentID() {
            return studentSerialID;
      }

      public void setStudentID(int studentID) {
            Student.studentSerialID = studentID;
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

      public void addSubjectScore(Score score) {
            scoreList.add(score);

      }

      public void removeSubjectScore(int index) {
            scoreList.remove(index);
      }

      @Override
      public String toString() {
            return "Student{" + "studentName='" + studentName + '\'' + ", majorSubject=" + majorSubject +'}';
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
package test.exercise.testmeplz;

import javax.security.auth.Subject;
import java.util.ArrayList;


/**
 * packageName    : test.exercise.testmeplz
 * fileName       : Student
 * author         : letscombine
 * date           : 2022-01-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-21        letscombine       최초 생성
 */


public class Student {
      private int studentID;
      private String studentName;
      private Subject majorSubject;

      private ArrayList<Score> scoreList = new ArrayList<>();

      public Student(int studentID, String studentName, Subject majorSubject) {
            this.studentID = studentID;
            this.studentName = studentName;
            this.majorSubject = majorSubject;
      }


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

      public void addSubjectScore(Score score) {

            scoreList.add(score);
      } //스코어를 리스트에 추가합니다!

      @Override
      public String toString() {
            final StringBuilder sb = new StringBuilder("Student{");
            sb.append("studentID=")
                    .append(studentID);
            sb.append(", studentName='")
                    .append(studentName)
                    .append('\'');
            sb.append(", majorSubject=")
                    .append(majorSubject);
            sb.append(", scoreList=")
                    .append(scoreList);
            sb.append('}');
            return sb.toString();
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
package test.exercise.testmeplz;

/**
 * packageName    : test.exercise.testmeplz
 * fileName       : Score
 * author         : letscombine
 * date           : 2022-01-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-21        letscombine       최초 생성
 */


public class ScoreVO {
      private int studentID; //학번
      private SubjectVO subject; //과목
      private int point; // 점수

      public ScoreVO(int studentID, SubjectVO subject, int point) {
            this.studentID = studentID;
            this.subject = subject;
            this.point = point;
      }

      public int getStudentID() {
            return studentID;
      }

      public void setStudentID(int studentID) {
            this.studentID = studentID;
      }

      public SubjectVO getSubject() {
            return subject;
      }

      public void setSubject(SubjectVO subject) {
            this.subject = subject;
      }

      public int getPoint() {
            return point;
      }

      public void setPoint(int point) {
            this.point = point;
      }

      @Override
      public String toString() {
            final StringBuilder sb = new StringBuilder("Score{");
            sb.append("studentID=")
                    .append(studentID);
            sb.append(", subject=")
                    .append(subject);
            sb.append(", point=")
                    .append(point);
            sb.append('}');
            return sb.toString();
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
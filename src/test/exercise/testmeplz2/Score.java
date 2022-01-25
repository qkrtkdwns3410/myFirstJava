package test.exercise.testmeplz2;

/**
 * packageName    : test.exercise.testmeplz2
 * fileName       : Score
 * author         : letscombine
 * date           : 2022-01-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-24        letscombine       최초 생성
 */


public class Score {
      private int studentId; //학번
      private Subject subject; //과목
      private int point; //점수

      public Score(int studentId, Subject subject, int point) {
            this.studentId = studentId;
            this.subject = subject;
            this.point = point;
      }

      public int getStudentId() {
            return studentId;
      }

      public void setStudentId(int studentId) {
            this.studentId = studentId;
      }

      public Subject getSubject() {
            return subject;
      }

      public void setSubject(Subject subject) {
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
            sb.append("studentId=").append(studentId);
            sb.append(", subject=").append(subject);
            sb.append(", point=").append(point);
            sb.append('}');
            return sb.toString();
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
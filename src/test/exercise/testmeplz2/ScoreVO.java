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


public class ScoreVO {
      private int studentId; //학번
      private SubjectVO subject; //과목
      private float point; //점수

      public ScoreVO(int studentId, SubjectVO subject, float point) {
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

      public SubjectVO getSubject() {
            return subject;
      }

      public void setSubject(SubjectVO subject) {
            this.subject = subject;
      }

      public float getPoint() {
            return point;
      }

      public void setPoint(int point) {
            this.point = point;
      }

      @Override
      public String toString() {
            return "학생이름=" + studentId + ", 과목=" + subject + ", 점수=" + point + '}';
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    